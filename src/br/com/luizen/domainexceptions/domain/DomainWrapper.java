package br.com.luizen.domainexceptions.domain;

import java.util.ArrayList;
import java.util.List;

public class DomainWrapper {
    private final List<DomainException> errors = new ArrayList<>();

    public void exec(Runnable runnable) {
        try {
            runnable.run();
        } catch (DomainException e) {
        	errors.add(e);
        }
    }

    public void callErrors() {
        if (!errors.isEmpty()) {
            String mensagemFinal = errors.stream()
                    .map(DomainException::getMessage)
                    .reduce((a, b) -> a + "; " + b)
                    .orElse("Erros de validação.");
            throw new DomainException(mensagemFinal, errors);
        }
    }
    
    public List<DomainException> getErrors() {
		return errors;
	}
}

