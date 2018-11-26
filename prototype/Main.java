/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author snow
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Carregar os diferentes tipos de guerreiros
	Jogo.CarregaWarrior();

	//Carregam os guerreiros no jogo
	Jogo.getWarrior("Arqueiro").mostraWarrior();
	Jogo.getWarrior("Agente").mostraWarrior();
	Jogo.getWarrior("Mercenario").mostraWarrior();
	
    }
    
}
