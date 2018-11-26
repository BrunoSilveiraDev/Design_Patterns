
import itens.ArcoFlecha;
import itens.Espada;
import mediator.MediatorImp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snow
 */
public class Main {
    public static void main(String[] args) {
        
        MediatorImp mediator = new MediatorImp();
        
        mediator.registraItem(new Espada());
        mediator.registraItem(new ArcoFlecha());
        
        mediator.criaPersonagem("Warrior");
    }
}
