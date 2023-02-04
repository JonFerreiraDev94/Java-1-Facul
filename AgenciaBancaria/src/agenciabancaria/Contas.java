/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciabancaria;

/**
 *
 * @author Jon
 */
public class Contas {

    private String titular;
    private double saldo;

    public Contas(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double debito) {
        if (saldo >= debito) {
            System.out.println("Saldo anterior =  " + saldo + "  retirada = " + debito);
            saldo = saldo - debito;
            System.out.println("Saldo atual = " + saldo);
        } else {
            System.out.println("saldo insufuciente");
        }
    }

    public void depositar(double juros) {
        double sa= saldo + juros;
        saldo = (saldo + juros) * 1.2;
        System.out.println("Saldo atual = " + sa);
        System.out.println("Saldo final = " + saldo);
        System.out.println("Seu dinheiro rendeu = " +(saldo-sa)+ " reais ");
    }

    @Override
    public String toString() {
        return "\ntitular= " + titular + " \nsaldo= " + saldo;
    }

}
