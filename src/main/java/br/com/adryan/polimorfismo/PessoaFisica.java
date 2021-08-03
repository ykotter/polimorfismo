package br.com.adryan.polimorfismo;

public class PessoaFisica extends Pessoa {
	
	public PessoaFisica(String documento) {
		super (documento);
	}
	
	@Override
	public Boolean validarDocumento() {
		char[] a1 = super.getDocumento().toCharArray();
		String[] a2 = new String[a1.length];
		Integer[] a3 = new Integer[a1.length];
		Integer auxiliar = 0;
		Integer multiplica = 1;
		Integer soma = 1;
		for ( int i = 0; i < a1.length - 2; i++) {
			a2[i] = String.valueOf(a1[i]);
			a3[i] = Integer.valueOf(a2[i]);
			auxiliar = Integer.valueOf(a3[i]);
			if (multiplica != 2) {
				multiplica = multiplica * auxiliar;
				soma = soma + multiplica;
				multiplica++;
			} else {
				soma = soma + 10;
				multiplica++;
			}
		
		}
	}
}