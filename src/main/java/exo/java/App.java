package exo.java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("nbventes");
        int nbventes = clavier.nextInt();
        if (10 >= nbventes) {
            System.out.println("félicitations" + nbventes);
        } else {
            int nbmanquants = 10 - nbventes;
            System.out.println(nbmanquants);
        }

    }

}
