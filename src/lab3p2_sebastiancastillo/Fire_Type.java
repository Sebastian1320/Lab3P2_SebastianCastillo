/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Fire_Type extends Pokemon {
    private int llamas;

    public Fire_Type(int llamas, String nombre, int entrada_p, String naturaleza) {
        super(nombre, entrada_p, naturaleza);
        this.llamas = llamas;
    }
    

    public int getLlamas() {
        return llamas;
    }

    public void setLlamas(int llamas) {
        this.llamas = llamas;
    }
    
    
}
