/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import itens.ArcoFlecha;
import itens.Espada;
import itens.Item;
import java.util.ArrayList;
import model.Personagem;

/**
 *
 * @author snow
 */
public class MediatorImp implements Mediator{
    
    private Espada espada;
    private ArcoFlecha arcoFlecha;
    private ArrayList<Item> itens;

    public MediatorImp() {
        this.itens = new ArrayList<>();
    }
    
    @Override
    public void registraItem(Item item) {
        item.setMediator(this);
        switch(item.getNome()) {
            case "Espada":
                espada = (Espada)item;
                itens.add(espada);
                break;
            case "Arco e Flecha":
                arcoFlecha = (ArcoFlecha)item;
                itens.add(arcoFlecha);
                break;
        }
    }

    @Override
    public void criaPersonagem(String tipo) {
        Personagem personagem = new Personagem(tipo, itens);
        System.out.println("Tipo: "+personagem.getTipo());
        System.out.println("Itens:");
        itens.forEach((_item) -> {
            System.out.println(_item.getNome());
        });
    }
}
