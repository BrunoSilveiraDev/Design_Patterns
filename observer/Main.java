/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author snow
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Observador
        ContaObservador observador = new ContaObservador();
		
	//Observado
	ContaFulano contaObservada = new ContaFulano();
		
	//Adiciona observador ao observado
	contaObservada.addObserver(observador);
		
	contaObservada.publica();
        contaObservada.comenta();
        contaObservada.curte();
    }
    
}
