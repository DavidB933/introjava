package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class TP04Version1 {
    public static void main(String[] args) {
        int nbEntre = GenererUnNombre(); 
        int nbPense = EntrerUnNombre(); 
        System.out.println("Vous proposez : " + nbPense);
        System.out.println("Le nombre auquel je pensais étais : " + nbEntre); 
        int difference = nbEntre - nbPense; 
        System.out.println("Vous étiez à " + difference); 
    }
     
    public static int GenererUnNombre () {
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel."); 
        Random generateur = new Random(); 
        int nbPense = generateur.nextInt(100)+1; 
        return nbPense; 
    }

    public static int EntrerUnNombre () {
        System.out.print("Entrez un nombre : "); 
        Scanner clavier = new Scanner(System.in); 
        int nbEntre = clavier.nextInt(); 
        clavier.close(); 
        return nbEntre;
    }    

}

