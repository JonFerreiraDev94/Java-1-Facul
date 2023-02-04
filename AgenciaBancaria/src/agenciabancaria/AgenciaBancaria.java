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
import java.util.Scanner;

public class AgenciaBancaria {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        ContaPoupanca clienteUm = new ContaPoupanca(0, "", 0);
        System.out.println("Digite o nome do correntista");
        clienteUm.setTitular(dado.nextLine());
        clienteUm.setSaldo(500); // saldo inicia com 500
        System.out.println("Digite o valor do saque ");
        clienteUm.saque(dado.nextDouble());
        clienteUm.setJuros(2); // tx de juros
        System.out.println("Deposiar na poupança? Digite o valor");
        clienteUm.depositar(dado.nextDouble());

        while (true) {
            Scanner entradaDados = new Scanner(System.in);
            System.out.println("Digite uma opcao do Menu, sendo: \n [1] Extrato \n [2] Alterar valor do saque \n [3] depositar na poupança");
            int opcao = entradaDados.nextInt();
            if (opcao == 1) {
                System.out.println("\n========== EXTRATO ===========" + clienteUm.toString());
                System.out.println("================================");
                
            } else if (opcao == 2) {
                System.out.println("Digite outro valor");
                clienteUm.saque(dado.nextDouble());
            }else if(opcao==3){
                System.out.println("Valor do depósito");
                clienteUm.depositar(dado.nextDouble());
            }else {
                System.out.println("Encerrar operação");
                break;
            }
        }
    }
}
