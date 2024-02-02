/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_sebastiancastillo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Lab3P2_SebastianCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("***** M E N U *****");
        System.out.println("1. Crear pokemon");
        System.out.println("2. Crar Pokebola");
        System.out.println("3. Listar pokemon");
        System.out.println("4. Eliminar Pokemon");
        System.out.println("5. Capturar pokemon");
        System.out.println("6. Modificar Pokemon");
        System.out.println("7. Salir");
        int op = leer.nextInt();
        ArrayList<Pokemon> pokemon = new ArrayList();
        ArrayList<Pokeball> pokeball = new ArrayList();
        while (op != 7) {
            switch (op) {
                case 1:
                    System.out.println("Ingrese que tipo de pokemon quiere crear 1. fuego, 2.Agua,3.Planta");
                    int op2 = leer.nextInt();
                    if (op2 == 1) {
                        System.out.println("Ingrese el nombre de su pokemon");
                        leer.nextLine();
                        String nombre = leer.nextLine();
                        System.out.println("Ingrese el numero de entrada en la pokedex");
                        int entrada = leer.nextInt();
                        System.out.println("Ingrese su naturaleza(Timido, Energetico, Misterioso) ");
                        String naturaleza = leer.next();
                        while (!(naturaleza.equalsIgnoreCase("Timido") || naturaleza.equalsIgnoreCase("Energetico") || naturaleza.equalsIgnoreCase("Misterioso"))) {
                            System.out.println("Naturaleza no válida");
                            System.out.println("Ingrese su naturaleza (Timido, Energetico, Misterioso): ");
                            naturaleza = leer.next();
                        }
                        System.out.println("Ingese la potencia de sus llamas");
                        int llamas = leer.nextInt();
                        pokemon.add(new Fire_Type(llamas, nombre, entrada, naturaleza));
                    } else if (op2 == 2) {
                        boolean vivir;
                        System.out.println("Ingrese el nombre de su pokemon");
                        leer.nextLine();
                        String nombre = leer.nextLine();
                        System.out.println("Ingrese el numero de entrada en la pokedex");
                        int entrada = leer.nextInt();
                        System.out.println("Ingrese su naturaleza(Timido, Energetico, Misterioso) ");
                        String naturaleza = leer.next();
                        while (!(naturaleza.equalsIgnoreCase("Timido") || naturaleza.equalsIgnoreCase("Energetico") || naturaleza.equalsIgnoreCase("Misterioso"))) {
                            System.out.println("Naturaleza no válida");
                            System.out.println("Ingrese su naturaleza (Timido, Energetico, Misterioso): ");
                            naturaleza = leer.next();
                        }
                        System.out.println("El pokemon puede vivir fuera del agua?");
                        String v = leer.next();
                        if (v.equalsIgnoreCase("Si")) {
                            vivir = true;
                        } else if (v.equalsIgnoreCase("No")) {
                            vivir = false;
                        } else {
                            System.out.println("Opcion no valida");
                            break;
                        }
                        System.out.println("Ingrese su rapidez al nadar");
                        int rapidez = leer.nextInt();
                        pokemon.add(new Water_Type(vivir, rapidez, nombre, entrada, naturaleza));
                    } else if (op2 == 3) {
                        System.out.println("Ingrese el nombre de su pokemon");
                        leer.nextLine();
                        String nombre = leer.nextLine();
                        System.out.println("Ingrese el numero de entrada en la pokedex");
                        int entrada = leer.nextInt();
                        System.out.println("Ingrese su naturaleza(Timido, Energetico, Misterioso) ");
                        String naturaleza = leer.next();
                        while (!(naturaleza.equalsIgnoreCase("Timido") || naturaleza.equalsIgnoreCase("Energetico") || naturaleza.equalsIgnoreCase("Misterioso"))) {
                            System.out.println("Naturaleza no válida");
                            System.out.println("Ingrese su naturaleza (Timido, Energetico, Misterioso): ");
                            naturaleza = leer.next();
                        }
                        System.out.println("Ingrese su habitat");
                        leer.nextLine();
                        String habitat = leer.nextLine();
                        System.out.println("Ingrese su dominio sobre las plantas");
                        int dominio = leer.nextInt();
                        while (dominio > 100 || dominio < 0) {
                            System.out.println("Numero no valido");
                            System.out.println("Ingrese su dominio sobre las plantas");
                             dominio = leer.nextInt();
                        }
                        pokemon.add(new Grass_Type(habitat, dominio, nombre, entrada, naturaleza));
                    }

                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
            System.out.println("***** M E N U *****");
            System.out.println("1. Crear pokemon");
            System.out.println("2. Crar Pokebola");
            System.out.println("3. Listar pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir");
            op = leer.nextInt();
        }
    }

}
