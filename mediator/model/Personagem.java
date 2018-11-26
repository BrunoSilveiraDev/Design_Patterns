package model;

import itens.Item;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snow
 */
public class Personagem {
    
    private String tipo; 
    private ArrayList<Item> itens;

    public Personagem() {
    }

    public Personagem(String tipo, ArrayList<Item> itens) {
        this.tipo = tipo;
        this.itens = itens;
    }
 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
