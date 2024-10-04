package exo.java;

import java.util.Scanner;

public class exo3 {

    public static void main(String[] args){

        Scanner clavier = new Scanner(System.in);
        

        System.out.println("devinez le nombre");
        int nombre = clavier.nextInt();
        int devinezlenombre = (int)(Math.random() * 100);
        int nbdistance = devinezlenombre-nombre;
        if (nbdistance<0){
            nbdistance=nbdistance*(-1);
        }
        System.out.print("le nombre etait " + devinezlenombre + "ecart "+nbdistance );
        
    }

}