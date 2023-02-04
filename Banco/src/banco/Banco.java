package banco;

import java.util.*;

public class Banco {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        Correntista correntistaUm = new Correntista(" ", 0, 0 );

        System.out.println("Digite o nome do correntista");
        String nome = info.nextLine();
        correntistaUm.setNome(nome);
        System.out.println("Digite o saldo da conta");
        double saldo = info.nextDouble();
        correntistaUm.setSaldo(saldo);
        System.out.println("Digite o valor do saque");
        double saque = info.nextDouble();
        correntistaUm.setSaque(saque);

        while (true) {
            Scanner entradaDados = new Scanner(System.in);
            System.out.println("Digite uma opcao do Menu, sendo: \n [1] Extrato \n [2] Alterar valor do saque \n [3] Depositar");
            int opcao = entradaDados.nextInt();
            if (opcao == 1) {
                System.out.println("" + correntistaUm.ExibirCorrentista());
            } else if (opcao == 2) {
                System.out.println("Digite outro valor");
                correntistaUm.setSaque(info.nextDouble());
                
            } else if(opcao == 3){
                System.out.println("Valor do depósito");
                correntistaUm.deposito(info.nextDouble());
            }
            else {
                System.out.println("Encerrar operação");
                break;
            }
        }
    }

}
