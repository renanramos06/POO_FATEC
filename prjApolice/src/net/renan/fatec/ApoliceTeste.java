package net.renan.fatec;

public class ApoliceTeste {

    public static void main(String[] args) {
	// write your code here
    Apolice apolice = new Apolice();
    apolice.setNomeSegurado("Renan Rogério de Ramos");
    apolice.setIdade(22);
    apolice.setValorPremio(3500.0f);

    apolice.imprimir();
    }
}
