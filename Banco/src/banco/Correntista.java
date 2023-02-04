
package banco;


public class Correntista {
    private String nome;
	private double saldo;
	private double saque;
        public double atual;

	public Correntista (String nome, double saldo, double saque){
	this.setNome(nome);
	this.setSaldo(saldo);
	this.setSaque(saque);
	}
        
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo){
	    this.saldo = saldo;
         
	}
	public double getSaque(){
	    return saque;
	}
	public void setSaque(double saque) {
            
	    if (saldo >= saque)  { 
             this.saque = saque;
             this.saldo = saldo - saque;
  
        } else {   
              System.out.println("Saldo insuficiente!");
        }
            
	   	
	}
        public void deposito(double valor){
            System.out.println("Deposito:" + valor);
            saldo = saldo + valor;
        }
        
	public String ExibirCorrentista(){
	return "\nEXTRATO \nNome= " + getNome() +  "  \nSaque= " + getSaque() + "\nSaldo=" + getSaldo() ;
	}

}
    

