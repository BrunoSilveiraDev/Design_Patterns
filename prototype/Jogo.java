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

import java.util.Hashtable;

public class Jogo {
	
    private static Hashtable<String, Warrior> warriorMap  = new Hashtable<String, Warrior>();
	
    public static void CarregaWarrior() {
		
	Arqueiro arqueiro = new Arqueiro();
	warriorMap.put("Arqueiro", arqueiro);
		
	Mercenario mercenario = new Mercenario();
	warriorMap.put("Mercenario", mercenario);
		
	Agente agente = new Agente();
	warriorMap.put("Agente", agente);
		
    }
	
    public static Warrior getWarrior(String nome){
	
        Warrior nota = warriorMap.get(nome);
        
	return nota.clone();
    }
	
}
