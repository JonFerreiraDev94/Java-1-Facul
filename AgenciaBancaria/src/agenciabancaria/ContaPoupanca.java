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
// Conta poupança
public class ContaPoupanca extends Contas {

    private double juros; //taxa de juros

    public ContaPoupanca(double juros, String titular, double saldo) {
        super(titular, saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
