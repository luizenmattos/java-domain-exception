package domain_exceptions.domain;

import java.util.ArrayList;
import java.util.List;

public class DomainException extends RuntimeException {

	@SuppressWarnings("unused")
	private List<DomainException> errors = new ArrayList<>();
	private static final long serialVersionUID = 1L;
	
	public DomainException(String message) {
		super(message);
	}
	
	public DomainException(String message, List<DomainException> errors) {
		super(message);
		this.setErrors(errors);
	}

	public void setErrors(List<DomainException> errors) {
		this.errors = errors;
	}
}
