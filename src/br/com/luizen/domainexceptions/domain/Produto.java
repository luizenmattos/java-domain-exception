package br.com.luizen.domainexceptions.domain;

import java.math.BigDecimal;
public class Produto {
    private String nome;
    private BigDecimal preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        if (preco.compareTo(BigDecimal.ZERO) < 0) {
            throw new DomainException("Preço inválido: " + preco);
        }
        this.preco = preco;
    }
    
    public BigDecimal getPreco() {
		return preco;
	}
    
    public String getNome() {
		return nome;
	}
}