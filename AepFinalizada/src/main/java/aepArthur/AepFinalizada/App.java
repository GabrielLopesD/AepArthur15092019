package aepArthur.AepFinalizada;

public class App 
{
	public static void main(String[] args) {
    
        Aluno A1 = new Aluno("Gabriel Lopes Dos Santos", 18309182);
        Aluno A2 = new Aluno("Rafael LopesDos Santos",12345678);
        Aluno A3 = new Aluno("Patricia Lopes Da silva", 78945612);
        
        Nota N1 = new Nota(1.0);
        Nota N2 = new Nota(0.0);
        Nota N3 = new Nota(8.8);
        
		Avaliação AV1 = new Avaliação("Programação O.O.");
		Avaliação AV2 = new Avaliação("Banco de dados");
		Avaliação AV3 = new Avaliação("Matemática");
		
		ExibirAvaliação(AV1);
		ExibirAluno(A1, N1);
		
		ExibirAvaliação(AV2);
		ExibirAluno(A2, N2);
		
		ExibirAvaliação(AV3);
		ExibirAluno(A3, N3);
		
		
	}
    
    public static void ExibirAluno(Aluno aluno, Nota nota) {
    	System.out.println("Nome Aluno(a):" + aluno.getNomeDoAluno() + " RA: " + aluno.getRa() + " Nota: " + nota.getNota() );
    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void ExibirAvaliação(Avaliação avaliação) {
    	System.out.println("Prova: " + avaliação.getAvaliação());
    }
    }
