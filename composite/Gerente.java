/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author snow
 */
import java.util.ArrayList;
import java.util.List;

//Composite
public class Gerente extends Empregado {

    //Collection of child graphics.
    private List<Empregado> listaSubordinados = new ArrayList<>();
  
    public Gerente(String nome) {
        super(nome);
    }
     
    //Exibe a estrutura 
    @Override
    public void print() {
        System.out.println(super.nome);
        for (Empregado e : listaSubordinados) {
            e.print();
        }
    }
  
    //Adiciona empregado à estrutura.
    @Override
    public void add(Empregado e) {
        listaSubordinados.add(e);
    }
  
    //Remove empregado da estrutura.
    @Override
    public void remove(Empregado e) {
        listaSubordinados.remove(e);
    }
}