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


public class ContaFulano extends Observable implements Conta {

    private String acao = "";
    
     @Override
    public void publica() {
        this.acao = "publica";
        System.out.println("Fulano fez uma publicação.");
        this.mudaEstado();
    }

    @Override
    public void comenta() {
        this.acao = "comenta";
        System.out.println("Fulano fez um comentário.");
        this.mudaEstado();
    }

    @Override
    public void curte() {
        this.acao = "curte";
        System.out.println("Fulano curtiu uma publicação.");
        this.mudaEstado();
    }
    
    public void mudaEstado() {
	setChanged(); 
	notifyObservers(acao); 
    }
	
}
