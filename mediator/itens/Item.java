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
public interface Item {
    
    public void setMediator(MediatorImp mediator);
    public String getNome();
}
