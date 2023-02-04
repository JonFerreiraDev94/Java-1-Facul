
 
package faculdade;


public class Aluno { // criou a classe aluno
    
    public String nome; // variável nome do tipo string
    public String nomeEndereco; //Variável nomeendereco do tipo String

    public Aluno(String nome,  String nomeEndereco) { //método para criar o objeto aluno
        this.nome = nome; // this faz referencia ao nome
        this.nomeEndereco = nomeEndereco; //This faz referencia ao endereço
    }

    public void alterarRua(String nomeEndereco) { // método que faz a alteração no endereço
        this.nomeEndereco = nomeEndereco; // faz referecia ao endereco
    }

    public String relatorioAluno() { // métod para exibir o cadastro completo do aluno 
        return "Aluno " + nome + "  Rua  " + nomeEndereco + "\n";
    }
    
}
