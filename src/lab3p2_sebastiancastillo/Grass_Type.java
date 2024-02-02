/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Grass_Type extends Pokemon {
    private String habitat;
    private int dominio;

    public Grass_Type(String habitat, int dominio, String nombre, int entrada_p, String naturaleza) {
        super(nombre, entrada_p, naturaleza);
        this.habitat = habitat;
        this.dominio = dominio;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }
    
    
}
