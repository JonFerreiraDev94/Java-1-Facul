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
import java.util.*;
public class CriarHospital {

   
    public static void main(String[] args) {
        Scanner info = new Scanner( System.in ); 
		Paciente pacienteUm = new Paciente ("" , " ");
		System.out.println("Digite o nome do paciente");
    	pacienteUm.setNome(info.nextLine());
		System.out.println("Digite o tipo de enfermidade do mesmo");
    	pacienteUm.setTipoEnfermidade(info.nextLine());

while(true) {
	Scanner entradaDados = new Scanner( System.in ); 
	System.out.println("Digite uma opcao do Menu, sendo: \n [1] Relatorio \n [2] Alterar Doenca \n");   
	int opcao = entradaDados.nextInt();
    	if (opcao==1){
			System.out.println("" + pacienteUm.relatorioPaciente());
	    }
		else
		if (opcao==2){
		System.out.println("Digite o novo tipo de enfermidade do mesmo");
		pacienteUm.setTipoEnfermidade(info.nextLine());
					
					}
          			else
					    {
					    System.out.println("Fim");
		  				break;
						}
	}   }   } 

    
    

