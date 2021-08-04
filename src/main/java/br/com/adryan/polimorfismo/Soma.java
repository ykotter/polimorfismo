package br.com.adryan.polimorfismo;

import java.math.BigDecimal;

public class Soma extends OperacaoMatematica{
	
	public Soma(Integer n1, Integer n2) {
        super (n1, n2);
	}
	
	@Override
	public BigDecimal calcular () {
		return super.getX().add(super.getY());
	}
}
