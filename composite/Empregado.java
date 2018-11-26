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

//Component
public abstract class Empregado {
         
    protected String nome;
    protected double salario;
     
    public Empregado(String nome) {
        this.nome = nome;
    }
 
    //Exibe detalhes do empregado
    public abstract void print();
     
    public abstract void add(Empregado e);
    public abstract void remove(Empregado e);
}