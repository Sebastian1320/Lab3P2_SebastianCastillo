/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_sebastiancastillo;

import java.util.ArrayList;
import java.util.Random;
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
        Random rng=new Random();
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
                    System.out.println("Ingrese el color ");
                    leer.nextLine();
                    String color = leer.nextLine();
                    System.out.println("Ingrese un numero de serie");
                    int serie = leer.nextInt();
                    System.out.println("Ingrese la eficiencia de atrapado 1-3");
                    int eficiencia = leer.nextInt();
                    while (eficiencia < 1 || eficiencia > 3) {
                        System.out.println("Numero no valido");
                        System.out.println("Ingrese la eficiencia de atrapado 1-3");
                        eficiencia = leer.nextInt();
                    }
                    pokeball.add(new Pokeball(color, serie, eficiencia));
                    break;
                case 3:
                    System.out.println("Tipos fuego");
                    for (int i = 0; i < pokemon.size(); i++) {
                        if (pokemon.get(i) instanceof Fire_Type) {
                            System.out.println(i + ". " + pokemon.get(i).toString());
                        }
                    }
                    System.out.println("Tipos agua");
                    for (int i = 0; i < pokemon.size(); i++) {
                        if (pokemon.get(i) instanceof Water_Type) {
                            System.out.println(i + ". " + pokemon.get(i).toString());
                        }
                    }
                    System.out.println("Tipos planta");
                    for (int i = 0; i < pokemon.size(); i++) {
                        if (pokemon.get(i) instanceof Grass_Type) {
                            System.out.println(i + ". " + pokemon.get(i).toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese que tipo de pokemon quiere crear 1. fuego, 2.Agua,3.Planta");
                    op2 = leer.nextInt();
                    if (op2 == 1) {
                        for (int i = 0; i < pokemon.size(); i++) {
                            if (pokemon.get(i) instanceof Fire_Type) {
                                System.out.println(i + ". " + pokemon.get(i).toString());
                            }
                        }
                        System.out.println("Ingrese el indice del pokemon que quiera eliminar");
                        int ind = leer.nextInt();
                        while (ind > pokemon.size()) {
                            System.out.println("EL numero ingresado esta en la lista");
                            System.out.println("Ingrese el indice del pokemon que quiere eliminar");
                            ind = leer.nextInt();
                        }
                        if (pokemon.get(ind) instanceof Fire_Type) {
                            pokemon.remove(ind);
                            System.out.println("Se ha eliminado con exito");
                        } else {
                            System.out.println("El pokemon elegido no es tipo fuego");
                            break;
                        }
                    } else if (op2 == 2) {
                        for (int i = 0; i < pokemon.size(); i++) {
                            if (pokemon.get(i) instanceof Water_Type) {
                                System.out.println(i + ". " + pokemon.get(i).toString());
                            }
                        }
                        System.out.println("Ingrese el indice del pokemon que quiera eliminar");
                        int ind = leer.nextInt();
                        while (ind > pokemon.size()) {
                            System.out.println("EL numero ingresado esta en la lista");
                            System.out.println("Ingrese el indice del pokemon que quiere eliminar");
                            ind = leer.nextInt();
                        }
                        if (pokemon.get(ind) instanceof Water_Type) {
                            pokemon.remove(ind);
                            System.out.println("Se ha eliminado con exito");
                        } else {
                            System.out.println("El pokemon elegido no es tipo agua");
                            break;
                        }

                    } else if (op2 == 3) {
                        for (int i = 0; i < pokemon.size(); i++) {
                            if (pokemon.get(i) instanceof Grass_Type) {
                                System.out.println(i + ". " + pokemon.get(i).toString());
                            }
                        }
                        System.out.println("Ingrese el indice del pokemon que quiera eliminar");
                        int ind = leer.nextInt();
                        while (ind > pokemon.size()) {
                            System.out.println("EL numero ingresado esta en la lista");
                            System.out.println("Ingrese el indice del pokemon que quiere eliminar");
                            ind = leer.nextInt();
                        }
                        if (pokemon.get(ind) instanceof Grass_Type) {
                            pokemon.remove(ind);
                            System.out.println("Se ha eliminado con exito");
                        } else {
                            System.out.println("El pokemon elegido no es tipo Planta");
                            break;
                        }
                    } else {
                        System.out.println("Opcion no valida");
                        break;
                    }
                    break;
                case 5:
                    for (Pokeball p : pokeball) {
                        System.out.println(pokeball.indexOf(p) + ". " + p);
                    }
                    System.out.println("Ingrese el indice de la pokebola que quiere");
                    int ind = leer.nextInt();
                    while (ind > pokeball.size()) {
                        System.out.println("Indice no valido");
                        System.out.println("Ingrese el indice de la pokebola que quiere");
                        ind = leer.nextInt();
                    }
                    
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
