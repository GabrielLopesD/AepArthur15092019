package aepArthur.AepFinalizada;

public class Aluno {
	private String nomeDoAluno;
	private int ra;
	
	public Aluno(String nomeDoAluno, int ra) {
		this.nomeDoAluno = nomeDoAluno;
		this.ra = ra;
	}
	
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	
	public int getRa() {
		return ra;
	}
	
	public void setRA(int ra) {
		this.ra = ra;
	}
	
	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}
}
