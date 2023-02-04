/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Jon
 */
import java.util.Scanner;

public class Loja {

    public static void main(String args[]) {
        Scanner entradaDados = new Scanner(System.in);

        Produto produtoUm = new Produto();
	  System.out.print("Digite o nome do produto:");
      produtoUm.nome = entradaDados.nextLine();
      System.out.print("Digite o nome do fabricante:");
      produtoUm.fabricante =entradaDados.nextLine();
      System.out.print("Digite o valor do produto:");
      produtoUm.valor = entradaDados.nextDouble();
       System.out.print("Digite o valor do desconto:");
       produtoUm.descontar(entradaDados.nextDouble());
       System.out.println();
       System.out.println("dados do produto " + produtoUm.exibirProduto());
      System.out.print("\n");
    }

}
