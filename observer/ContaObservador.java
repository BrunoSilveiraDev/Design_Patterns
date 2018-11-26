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

import java.util.Observable;
import java.util.Observer;


public class ContaObservador implements Observer, Conta {
    
    @Override
    public void publica() {
        System.out.println("Checa publicação.");
    }

    @Override
    public void comenta() {
        System.out.println("Checa comentário.");
    }

    @Override
    public void curte() {
        System.out.println("Checa quem curtiu.");
    }


    @Override
    public void update(Observable arg0, Object arg1) {
        ContaFulano contaObservada = (ContaFulano)arg0;
	String acao = String.valueOf(arg1);
        
        switch(acao) {
            case "publica" : this.publica();
            break;
            case "comenta" : this.comenta();
            break;
            case "curte" : this.curte();
            break;
            default: System.out.println("nenhuma ação");
        }
    }
}
