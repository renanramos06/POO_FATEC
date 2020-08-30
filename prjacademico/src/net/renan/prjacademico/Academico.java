package net.renan.prjacademico;

public class Academico {
    //sem atributos(poderia ter)


    public static void main(String[] args) {
	// código fonte para executar a aplicação

        Aluno aluno1, aluno2; //Definindo variaveis
        int x = 10;
        aluno1 = new Aluno();
        aluno1.rm = 1;
        aluno1.nome = "joao";
        aluno1.email = "emaildojoao@joao.com";

        aluno2 = new Aluno();
        aluno2.rm = 2;
        aluno2.nome = "pedro";
        aluno2.email = "emaildopedre@pedro.com";

        //matricular os dois alunos

        aluno1.matricular();
        aluno2.matricular();

        //cancelar a matricula dos dois alunos

        aluno1.cancelarMatricula();
        aluno2.cancelarMatricula();

    }
}
