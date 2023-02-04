/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criarhospital;

/**
 *
 * @author Jon
 */
public class Paciente {
    private String nome;
  private String tipoEnfermidade;

  public Paciente(String nome, String tipoEnfermidade){
this.setNome(nome);
this.setTipoEnfermidade(tipoEnfermidade);
  }

  public String getNome(){
    return nome;
  }

  public void setNome (String nome){
    this.nome = nome;
}
public String getTipoEnfermidade(){
    return tipoEnfermidade;
}
public void setTipoEnfermidade (String tipoEnfermidade){
    this.tipoEnfermidade = tipoEnfermidade;
}
public String relatorioPaciente(){
    return "individio " + getNome() + " doença " + getTipoEnfermidade() + "\n";
}
    
}
