/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itens;

import mediator.MediatorImp;

/**
 *
 * @author snow
 */
public class Espada implements Item{

    private MediatorImp mediator;
    
    public Espada() {
    }
    
    @Override
    public void setMediator(MediatorImp mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getNome() {
        return "Espada";
    }
    
}
