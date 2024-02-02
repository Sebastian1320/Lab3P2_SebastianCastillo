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
        Random rng = new Random();
        System.out.println("***** M E N U *****");
        System.out.println("1. Crear pokemon");
        System.out.println("2. Crear Pokebola");
        System.out.println("3. Listar pokemon");
        System.out.println("4. Eliminar Pokemon");
        System.out.println("5. Capturar pokemon");
        System.out.println("6. Modificar Pokemon");
        System.out.println("7. Salir");
        int op = leer.nextInt();
        ArrayList<Pokemon> pokemon = new ArrayList();
        ArrayList<Pokeball> pokeball = new ArrayList();
        ArrayList<Pokemon> pokemondisp = new ArrayList();
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
                        pokemondisp.add(new Fire_Type(llamas, nombre, entrada, naturaleza));
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
                        pokemondisp.add(new Water_Type(vivir, rapidez, nombre, entrada, naturaleza));
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
                        pokemondisp.add(new Grass_Type(habitat, dominio, nombre, entrada, naturaleza));
                    }else{
                        System.out.println("Opcion no valida");
                        break;
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
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay pokemones disponibles");
                        break;
                    }
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
                    if (pokeball.isEmpty()) {
                        System.out.println("No hay pokebolas");
                        break;
                    }
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay pokemones disponibles");
                        break;
                    }
                    if (pokemondisp.isEmpty()) {
                        System.out.println("Todos los pokemons estan atrapados");
                        break;
                    }

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
                    int random = rng.nextInt(pokemon.size());
                    int randomp = rng.nextInt(3) + 1;
                    while (pokemon.get(random).isAtrapado() == true) {
                        random = rng.nextInt(pokemon.size());
                    }
                    System.out.println("EL POKEMON " + pokemon.get(random).getNombre() + " HA APARECIDO");
                    System.out.println("Desea utilizar la pokeball para capturarlo 1. Si/2. Huir");
                    op2 = leer.nextInt();
                    while (op2 > 2 || op2 < 1) {
                        System.out.println("Opcion no valida");
                        System.out.println("Desea utilizar la pokeball para capturarlo 1.Si/2.Huir");
                        op2 = leer.nextInt();
                    }
                    if (op2 == 1) {
                        if (pokeball.get(ind).getEficiencia() == 3) {
                            System.out.println("Ha capturado el pokemon con exito");
                            pokemon.get(random).setAtrapado(true);
                            pokemon.get(random).setPokeballdisp(pokeball.get(ind));
                            pokeball.remove(ind);
                            pokemondisp.remove(random);
                        } else if (pokeball.get(ind).getEficiencia() == 2) {
                            if (pokeball.get(ind).getEficiencia() < randomp) {
                                System.out.println("Ha fallado la captura ");
                                pokeball.remove(ind);
                            } else {
                                System.out.println("Ha capturado el pokemon con exito");
                                pokemon.get(random).setAtrapado(true);
                                pokemon.get(random).setPokeballdisp(pokeball.get(ind));
                                pokeball.remove(ind);
                                pokemondisp.remove(random);
                            }
                        } else {
                            if (pokeball.get(ind).getEficiencia() < randomp) {
                                System.out.println("Ha fallado la captura ");
                                pokeball.remove(ind);
                            } else {
                                System.out.println("Ha capturado el pokemon con exito");
                                pokemon.get(random).setAtrapado(true);
                                pokemon.get(random).setPokeballdisp(pokeball.get(ind));
                                pokeball.remove(ind);
                                pokemondisp.remove(random);
                            }
                        }
                    } else if (op2 == 2) {
                        System.out.println("A Huido con exito");
                        break;
                    }
                    break;
                case 6:
                    int n=0;
                    if (pokemon.isEmpty()) {
                        System.out.println("No hay pokemones disponibles");
                        break;
                    }
                     for (int i = 0; i < pokemon.size(); i++) {
                            if (pokemon.get(i).isAtrapado() == true ) {
                                n++;
                            }
                        }
                     if(n==0){
                         System.out.println("No hay pokemons atrapados");
                         break;
                     }
                    System.out.println("Ingrese que tipo de pokemon quiere Modificar 1. fuego, 2.Agua,3.Planta");
                    op2 = leer.nextInt();
                    if (op2 == 1) {
                        n=0;
                        for (int i = 0; i < pokemon.size(); i++) {
                            if (pokemon.get(i).isAtrapado() == true && pokemon.get(i) instanceof Fire_Type) {
                                System.out.println(i + ". " + pokemon.get(i));
                                n++;
                            }
                        }
                        if(n==0){
                            System.out.println("No hay pokemons de fugo atrapados");
                            break;
                        }
                        System.out.println("Ingrese el indice del pokemon que quiere modificar");
                        ind = leer.nextInt();
                        while (ind > pokemon.size() || !(pokemon.get(ind) instanceof Fire_Type)) {
                            System.out.println("El indice de ese pokemon no es valido");
                            System.out.println("Ingrese el indice del pokemon que quiere modificar");
                            ind = leer.nextInt();
                        }
                        System.out.println("Que desea modificar de este pokemon" + "\n 1. Nombre\n"
                                + "2. Número de Entrada en la pokédex.\n"
                                + "3. potencia de llamas.");
                        int op3 = leer.nextInt();
                        if (op3 == 1) {
                            System.out.println("Ingrese el nuevo nombre de su pokemon");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            pokemon.get(ind).setNombre(nombre);
                        } else if (op3 == 2) {
                            System.out.println("Ingrese el numero de entrada de la pokedex");
                            int pok = leer.nextInt();
                            pokemon.get(ind).setEntrada_p(pok);
                        } else if (op3 == 3) {
                            System.out.println("Ingrese la potencia de fuego");
                            int pot = leer.nextInt();
                            ((Fire_Type) pokemon.get(ind)).setLlamas(pot);
                        } else {
                            System.out.println("Opcion no valida");
                            break;
                        }
                    } else if (op2 == 2) {
                        n=0;
                        for (int i = 0; i < pokemon.size(); i++) {
                            if (pokemon.get(i).isAtrapado() == true && pokemon.get(i) instanceof Water_Type) {
                                n++;
                                System.out.println(i + ". " + pokemon.get(i));
                            }
                        }
                        if(n==0){
                            System.out.println("No hay pokemons de agua atrapados");
                            break;
                        }
                        System.out.println("Ingrese el indice del pokemon que quiere modificar");
                        ind = leer.nextInt();
                        while (ind > pokemon.size() || !(pokemon.get(ind) instanceof Water_Type)) {
                            System.out.println("El indice de ese pokemon no es valido");
                            System.out.println("Ingrese el indice del pokemon que quiere modificar");
                            ind = leer.nextInt();
                        }
                        System.out.println("Que desea modificar de este pokemon" + "\n 1. Nombre\n"
                                + "2. Número de Entrada en la pokédex.\n"
                                + "3. puede vivir fuera del agua.");
                        int op3 = leer.nextInt();
                        if (op3 == 1) {
                            System.out.println("Ingrese el nuevo nombre de su pokemon");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            pokemon.get(ind).setNombre(nombre);
                        } else if (op3 == 2) {
                            System.out.println("Ingrese el numero de entrada de la pokedex");
                            int pok = leer.nextInt();
                            pokemon.get(ind).setEntrada_p(pok);
                        } else if (op3 == 3) {
                            boolean vivir;
                            System.out.println("Puede vivir fuera del agua");
                            String v = leer.next();
                            if (v.equalsIgnoreCase("Si")) {
                                vivir = true;
                            } else if (v.equalsIgnoreCase("No")) {
                                vivir = false;
                            } else {
                                System.out.println("Opcion no valida");
                                break;
                            }
                            ((Water_Type) pokemon.get(ind)).setVivir(vivir);
                        } else {
                            System.out.println("Opcion no valida");
                            break;
                        }

                    } else if (op2 == 3) {
                        n=0;
                         for (int i = 0; i < pokemon.size(); i++) {
                            if (pokemon.get(i).isAtrapado() == true && pokemon.get(i) instanceof Grass_Type) {
                                System.out.println(i + ". " + pokemon.get(i));
                                n++;
                            }
                        }
                         if(n==0){
                             System.out.println("No hay pokemons tipo planta atrapados");
                             break;
                         }
                        System.out.println("Ingrese el indice del pokemon que quiere modificar");
                        ind = leer.nextInt();
                        while (ind > pokemon.size() || !(pokemon.get(ind) instanceof Grass_Type)) {
                            System.out.println("El indice de ese pokemon no es valido");
                            System.out.println("Ingrese el indice del pokemon que quiere modificar");
                            ind = leer.nextInt();
                        }
                        System.out.println("Que desea modificar de este pokemon" + "\n 1. Nombre\n"
                                + "2. Número de Entrada en la pokédex.\n"
                                + "3. habitat.");
                        int op3 = leer.nextInt();
                        if (op3 == 1) {
                            System.out.println("Ingrese el nuevo nombre de su pokemon");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            pokemon.get(ind).setNombre(nombre);
                        } else if (op3 == 2) {
                            System.out.println("Ingrese el numero de entrada de la pokedex");
                            int pok = leer.nextInt();
                            pokemon.get(ind).setEntrada_p(pok);
                        } else if (op3 == 3) {
                            System.out.println("Puede vivir fuera del agua");
                            leer.nextLine();
                            String habitat=leer.nextLine();
                            ((Grass_Type) pokemon.get(ind)).setHabitat(habitat);
                        } else {
                            System.out.println("Opcion no valida");
                            break;
                        }

                    } else {
                        System.out.println("Opcion no valida");
                        break;
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
            System.out.println("***** M E N U *****");
            System.out.println("1. Crear pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir");
            op = leer.nextInt();
        }
    }

}
