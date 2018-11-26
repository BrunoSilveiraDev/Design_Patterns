/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import itens.Item;

/**
 *
 * @author snow
 */
public interface Mediator {
    
    public void registraItem(Item item);
    public void criaPersonagem(String tipo);
}
