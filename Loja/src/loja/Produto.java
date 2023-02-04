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
public class Produto {

    public String nome;
    public String fabricante;
    public double valor;

    public String exibirProduto() {
        return "\nnome:  " + nome + "\nfabricante:  " + fabricante + "\nvalor: " + valor;
    }
    
    public void descontar (double desconto) {
		    valor = valor - desconto;
        
}

}
