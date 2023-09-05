package Model;

public class Campus {
	private String nome;
	private String sigla;
	private String cidade;
	private String bairro;
	
	public Campus() {}
	
	public Campus(String nome, String sigla, String cidade, String bairro) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.cidade = cidade;
		this.bairro = bairro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	
	
	
	
}