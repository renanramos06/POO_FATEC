package net.renan.prjcontabancaria;

import java.time.LocalDate;

public class Conta {

    //Atributos não estáticos
    public int numero;
    public String cliente;
    public double saldo;
    public LocalDate dataAbertura;
    public static double CPMF = 0.01;

    //Método debitarConta

    public void debitarConta(double valor){
        if(valor <= saldo){
            double vlrDesconto = valor * CPMF;
            this.saldo -= (valor + vlrDesconto);
        }
    }

    public void depositarConta(double valor){
        this.saldo += valor;
    }

}
