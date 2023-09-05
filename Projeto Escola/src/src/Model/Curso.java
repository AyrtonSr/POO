package Model;

public class Curso {
	private String nome;
	private String sigla;
	private int duração;
	private Departamento departamento;
	
	
	public Curso() {}
	
	public Curso(String nome, String sigla, int duração) {
		this.nome = nome;
		this.sigla = sigla;
		this.duração = duração;
	}
	
	
	
	public Curso(String nome, String sigla, int duração, Departamento departamento) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.duração = duração;
		this.departamento = departamento;
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
	public int getDuração() {
		return duração;
	}
	public void setDuração(int duração) {
		this.duração = duração;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}