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
//Leaf
public class Programador extends Empregado {
  
    public Programador(String nome) {
        super(nome);
    }
 
    //Exibe detalhes do empregado
    @Override
    public void print() {
        System.out.println(super.nome);
    }
     
    //Adiciona empregado à estrutura.
    @Override
    public void add(Empregado e) {
        System.out.println("Não é possível adicionar empregado subordinado do programador");
    }
  
    //Remove empregado da estrutura.
    @Override
    public void remove(Empregado e) {
        System.out.println("Não é possível remover empregado subordinado do programador");
    }
}