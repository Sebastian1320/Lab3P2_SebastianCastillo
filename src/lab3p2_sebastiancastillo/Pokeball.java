/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Pokeball {
    private String color;
    private int num_s;
    private int eficiencia;

    public Pokeball(String color, int num_s, int eficiencia) {
        this.color = color;
        this.num_s = num_s;
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_s() {
        return num_s;
    }

    public void setNum_s(int num_s) {
        this.num_s = num_s;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "color: " + color + ", numero de serie: " + num_s + ", eficiencia: " + eficiencia ;
    }
    
    
}

