/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Pokemon {
    protected String nombre;
    protected int entrada_p;
    protected String  naturaleza;
    protected boolean atrapado;
    protected String pokeballdisp;

    public Pokemon(String nombre, int entrada_p, String naturaleza) {
        this.nombre = nombre;
        this.entrada_p = entrada_p;
        this.naturaleza = naturaleza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntrada_p() {
        return entrada_p;
    }

    public void setEntrada_p(int entrada_p) {
        this.entrada_p = entrada_p;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }


    public String getPokeballdisp() {
        return pokeballdisp;
    }

    public void setPokeballdisp(Pokeball pokeball) {
        if(pokeball!=null){
        this.pokeballdisp = pokeball.toString();
        }
    }

   

    @Override
    public String toString() {
        return  "Nombre: " + nombre + ", Entrada en Pokedex:" + entrada_p + ", Naturaleza: " + naturaleza + ", Atrapado: " + atrapado+", Pokebola asignada[ "+pokeballdisp+" ]" ;
    }
    
    
}
 
