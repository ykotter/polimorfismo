package br.com.adryan.polimorfismo;

import java.math.BigDecimal;

public class Divisao extends OperacaoMatematica {
	
	public Divisao(Integer n1, Integer n2) {
        super (n1, n2);
	}
	
	@Override
	public BigDecimal calcular () {
		return super.getX().divide(super.getY());
	}
}
