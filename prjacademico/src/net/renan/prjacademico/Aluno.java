package net.renan.prjacademico;

public class Aluno {

    //Atributos
    public int rm;
    public String nome;
    public String email;

    public void matricular(){
        //Escrever o códio da funcionalidade matricular
        System.out.println("Aluno Matriculado com Sucesso");
        System.out.println("Dados do Aluno: ");
        System.out.println(imprimir());
        System.out.println("------------------------------");
    }
    private String imprimir(){
        return "RM: " + rm + " ,NOME: " + nome + " ,EMAIL: " + email;

    }

    public void cancelarMatricula(){
        //Escrever o código para cancelar matricula
        System.out.println("Aluno com Matricula Cancelada. ");
        System.out.println("Dados do Ex Aluno: ");
        System.out.println(imprimir());
        System.out.println("-------------------------------");


    }
}
