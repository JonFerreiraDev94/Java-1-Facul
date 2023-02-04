
package faculdade;

import java.util.Scanner; //importa a biblioteca scanner


public class Faculdade { //criou a classe faculdade, classe principal

    
    public static void main(String[] args) { // método principal que inicia o programa
        
        Scanner info = new Scanner(System.in); //variável info do tipo scanner novo objeto
        System.out.println("Digite o nome do aluno");//entrada do usuário
        String variavelNome = info.nextLine(); //uso o comando nextline para guardar o nome na variável variavel nome
        System.out.println("Digite o endereço");// Usario entra com o endereço
        String variavelRua = info.nextLine(); // guardo o endereço dentro da variável variavelRua
        Aluno alunoUm = new Aluno(variavelNome, variavelRua); // novo objeto alunoum do tipo aluno

        while (true) { // enquanto for verdade irá repetir o laço
            Scanner entradaDados = new Scanner(System.in); // var entraDados do tipo scanner, novo objeto
            System.out.println("Digite uma opcao do Menu, sendo: \n [1] Exibir Cadastro \n [2] Alterar endereço \n");
            int opcao = entradaDados.nextInt();// Guarda a opção que o usuário digitou
            if (opcao == 1) { // Se a opção for o número 1
                System.out.println("" + alunoUm.relatorioAluno()); // Exibe o cadastro completo
            } else if (opcao == 2) { // Se opção for 2
                System.out.println("Digite o novo endereço");// o sistema pede o novo endereço
                alunoUm.alterarRua(info.nextLine()); //chamo o metodo alterar rua e faz a troca do endereço

            } else { // Senão
                System.out.println("Fim");
                break;// Se a opção for diferente de 1 ou 2, o programa é encerrado
            }
        }
    }
}
    
    

