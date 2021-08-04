package br.com.adryan.polimorfismo;

import java.math.BigDecimal;

public abstract class OperacaoMatematica {
	private BigDecimal x;
	private BigDecimal y;
	
	public OperacaoMatematica(Integer n1, Integer n2) {
		this.x = BigDecimal.valueOf(n1);
		this.y = BigDecimal.valueOf(n2);
	}
	
	public abstract BigDecimal calcular(); 
	
	public BigDecimal getX() {
		return x;
	}

	public BigDecimal getY() {
		return y;
	}
}
