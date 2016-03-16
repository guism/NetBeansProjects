/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.guism.pokedex.bean;

import br.guism.pokedex.object.pokemon.Pokemon;
import br.guism.pokedex.object.pokemon.Tipo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PokeBean {
    //VARIAVEIS ALTERNATIVAS
    private int identificador;
    private int idPok;
    private String DPok;
    private String tipoPok;
    
    //TIPO
    private List<Tipo> todostipos = new ArrayList<>();
    private Tipo tipoPoke = new Tipo();
    
    //POKEMON
    private List<Pokemon> pokemons = new ArrayList<>();
    private Pokemon pokemon = new Pokemon();
    
    //BUG
    private List<Pokemon> pokeBug = new ArrayList<>();
    private Tipo tipoBug = new Tipo();
    private Pokemon Bug = new Pokemon();
    //DARK
    private List<Pokemon> pokeDark = new ArrayList<>();
    private Tipo tipoDark = new Tipo();
    private Pokemon Dark = new Pokemon();
   

    
   
    //MÉTODOS
    public void adcionarPokemon(){
    pokemons.add(pokemon);
    mostraPokemon();
    mostraTipo();
    pokemon = new Pokemon();
    identificador++;
    
    
    }
    
    public void adcionarTipo(){
    todostipos.add(tipoPoke);
    mostraTipo();
    tipoPoke = new Tipo();
    
    }
    
   public void mostraPokemon(){
       
      idPok = pokemons.get(identificador).getId();
      tipoPok = pokemons.get(identificador).getTipoPoke();
      DPok = pokemons.get(identificador).getDescricaoPoke();
     
   }
   
   public void mostraTipo(){
    if("BUG".equals(todostipos.get(identificador).getTipoNome())){
        tipoBug = todostipos.get(identificador);
        
    }
    if("BUG".equals(pokemons.get(identificador).getTipoPoke())){
        Bug = pokemons.get(identificador);
        pokeBug.add(Bug);
        Bug = new Pokemon();
        
    }
   }
   
  
   
   
    
    //GETERS AND SETERS
    

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public List<Pokemon> getPokemons() {    
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Tipo> getTodostipos() {
        return todostipos;
    }
    public void setTodostipos(List<Tipo> todostipos) {    
        this.todostipos = todostipos;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Tipo getTipoPoke() {
        return tipoPoke;
    }

    public void setTipoPoke(Tipo tipoPoke) {
        this.tipoPoke = tipoPoke;
    }

   

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void setTodostipos(ArrayList<Tipo> todostipos) {
        this.todostipos = todostipos;
    }

    public int getIdPok() {
        return idPok;
    }

    public void setIdPok(int idPok) {
        this.idPok = idPok;
    }

    public String getDPok() {
        return DPok;
    }

    public void setDPok(String DPok) {
        this.DPok = DPok;
    }

    public String getTipoPok() {
        return tipoPok;
    }

    public void setTipoPok(String tipoPok) {
        this.tipoPok = tipoPok;
    }

    public Tipo getTipoBug() {
        return tipoBug;
    }

    public void setTipoBug(Tipo tipoBug) {
        this.tipoBug = tipoBug;
    }

    public List<Pokemon> getPokeBug() {
        return pokeBug;
    }

    public void setPokeBug(List<Pokemon> pokeBug) {
        this.pokeBug = pokeBug;
    }

    public Pokemon getBug() {
        return Bug;
    }

    public void setBug(Pokemon Bug) {
        this.Bug = Bug;
    }

    public List<Pokemon> getPokeDark() {
        return pokeDark;
    }

    public void setPokeDark(List<Pokemon> pokeDark) {
        this.pokeDark = pokeDark;
    }

    public Tipo getTipoDark() {
        return tipoDark;
    }

    public void setTipoDark(Tipo tipoDark) {
        this.tipoDark = tipoDark;
    }

    public Pokemon getDark() {
        return Dark;
    }

    public void setDark(Pokemon Dark) {
        this.Dark = Dark;
    }

    
}
