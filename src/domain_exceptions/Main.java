package domain_exceptions;

import java.math.BigDecimal;

import domain_exceptions.domain.DomainWrapper;
import domain_exceptions.domain.Produto;

public class Main {
	
	public static void main(String[] args) {
        DomainWrapper wrp = new DomainWrapper();
        Produto produto = new Produto();

        wrp.exec(() -> produto.setNome("Luiz"));
        System.out.println(produto.getNome());
        
        wrp.exec(() -> produto.setPreco(new BigDecimal("-20")));
        System.out.println(produto.getPreco());
        
        wrp.exec(() -> produto.setPreco(new BigDecimal("-30")));
        System.out.println(produto.getPreco());
        
        wrp.exec(() -> produto.setPreco(new BigDecimal("330")));
        System.out.println(produto.getPreco());
        

        System.out.println(wrp.getErrors());
        
        wrp.callErrors(); // Vai lançar exception aqui, com todas acumuladas
    }
}

