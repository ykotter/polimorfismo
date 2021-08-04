package br.com.adryan.polimorfismo;

public abstract class Pessoa {
	
	private String documento;
	
	public Pessoa(String documento) {
		this.documento = documento;
	}

	public abstract Boolean validarDocumento();
	public abstract String gerarDocumento();
	public abstract String getDocumentoFormatado();
	
	public String getDocumento() {
		return documento;
	}
}
