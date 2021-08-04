package br.com.adryan.polimorfismo;

import java.util.Objects;
import java.util.SplittableRandom;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String documento) {
		super(documento);
	}

	@Override
	public Boolean validarDocumento() {
		if (Objects.isNull(super.getDocumento()) 
				|| super.getDocumento().length() != 11) {
			return false;
		}
		String preDoc = super.getDocumento().substring(0, 9);
		String cpfValido = this.gerarCpf(preDoc);
		return super.getDocumento().equals(cpfValido);
	}

	@Override
	public String gerarDocumento() {
		SplittableRandom sr = new SplittableRandom();
		String preDoc = "";
		for (int i = 0; i < 9; i++) {
			preDoc = preDoc + sr.nextInt(0, 10);
		}
		return this.gerarCpf(preDoc);
	}

	@Override
	public String getDocumentoFormatado() {
		if (!this.validarDocumento()) {
			return this.getDocumento();
		}
		return this.getDocumento().replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
	}
	
	private String gerarCpf(final String preDocumento) {
		
		String preDoc = preDocumento;
		char[] numeros = preDoc.toCharArray();
		Integer soma = 0;
		
		for (int i = numeros.length; i > 0; i--) {
			Integer num = Integer.valueOf(String.valueOf(numeros[i - 1]));
			soma += (num * i);
		}
		Integer dv1 = soma % 11;
		
		preDoc = preDoc + (dv1.equals(10) ? 0 : dv1);
		numeros = preDoc.toCharArray();
		soma = 0;
		
		for (int i = numeros.length - 1; i >= 0; i--) {
			Integer num = Integer.valueOf(String.valueOf(numeros[i]));
			soma += (num * i);
		}
		Integer dv2 = soma % 11;
		
		return preDoc + (dv2.equals(10) ? 0 : dv2);
	}
}