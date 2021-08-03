package br.com.adryan.polimorfismo;

public abstract class Pessoa {
	
	private String documento;
	
	public Pessoa(String documento) {
		this.documento = documento;
	}

	public abstract Boolean validarDocumento();
	/*public abstract String gerarDocumento(); bonus-one
	public abstract String getDocumentoFormatado(); bonus-two*/
	
	public String getDocumento() {
		return documento;
	}
}
