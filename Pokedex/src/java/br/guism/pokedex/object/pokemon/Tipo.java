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
public class Tipo {
    private String tipoNome;
    private String tipoResistencia;
    private String tipoFraqueza;
    private String descTipo;
    
    
   // CONSTRUTOR
  

    // GETERS AND SETERS
    public String getTipoNome() {
        return tipoNome;
    }

    public void setTipoNome(String tipoNome) {
        this.tipoNome = tipoNome;
    }

    public String getTipoResistencia() {
        return tipoResistencia;
    }

    public void setTipoResistencia(String tipoResistencia) {
        this.tipoResistencia = tipoResistencia;
    }

    public String getTipoFraqueza() {
        return tipoFraqueza;
    }

    public void setTipoFraqueza(String tipoFraqueza) {
        this.tipoFraqueza = tipoFraqueza;
    }

    public String getDescTipo() {
        return descTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }

    
    
}
