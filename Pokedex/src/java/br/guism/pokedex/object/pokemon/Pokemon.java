/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.guism.pokedex.object.pokemon;

/**
 *
 * @author Usuário
 */
public class Pokemon {
    private int id;
    private String nomePoke;
    private String descricaoPoke;
    public String tipoPoke;
    

//CONSTRUTOR


    
    
    //Geters and Seters
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePoke() {
        return nomePoke;
    }

    public void setNomePoke(String nomePoke) {
        this.nomePoke = nomePoke;
    }

    public String getDescricaoPoke() {
        return descricaoPoke;
    }

    public void setDescricaoPoke(String descricaoPoke) {
        this.descricaoPoke = descricaoPoke;
    }

    public String getTipoPoke() {
        return tipoPoke;
    }

    public void setTipoPoke(String tipoPoke) {
        this.tipoPoke = tipoPoke;
    }
    
    
}
