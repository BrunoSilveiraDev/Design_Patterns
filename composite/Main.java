/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author snow
 */

public class Main {

	public static void main(String[] args) {
	//Cria programadores (folhas)
	Programador pEstagiario = new Programador("arq1");
	Programador pJunior = new Programador("arq2");
	Programador pSenior = new Programador("arq3");
		
	//Gerentes
	Gerente joao = new Gerente("\\root");
        Gerente maria = new Gerente("\\pasta1");
        Gerente carlos = new Gerente("\\pasta2");
        
        //Montar a estrutura em árvore
        
        //Carlos superviosiona os programadores José e Pedro
        carlos.add(pEstagiario);
        carlos.add(pJunior);
        
        //Maria superviosiona o programador Ricardo
        maria.add(pSenior);
        
        //João é raiz da estrutura em árvore
        joao.add(carlos);
        joao.add(maria);
        
        joao.print();
        
        System.out.println("----------------------------");
        carlos.remove(pJunior);
        joao.print();
    }

}
