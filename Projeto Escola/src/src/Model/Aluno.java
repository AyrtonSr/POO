package Model;


public class Aluno {
	private String matricula;
	private String nome;
	private Curso curso;
	
	public Aluno() {}
	
	
	public Aluno (String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	
	
	public Aluno(String matricula, String nome, Curso curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}