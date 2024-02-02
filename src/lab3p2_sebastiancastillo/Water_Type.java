/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Water_Type extends Pokemon {
    private boolean vivir;
    private int rapidez;

    public Water_Type(boolean vivir, int rapidez, String nombre, int entrada_p, String naturaleza) {
        super(nombre, entrada_p, naturaleza);
        this.vivir = vivir;
        this.rapidez = rapidez;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }
    
}
