package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class TP04Version02 {
    public static void main(String[] args) {
        int nbEntre = GenererUnNombre(); 
        int nbPense = EntrerUnNombre(); 
        System.out.println("Vous proposez : " + nbPense); 
        System.out.println("Le nombre auquel je pensais étais : " + nbEntre); 
        int difference = nbEntre - nbPense; 
        if (nbEntre > nbPense) {
            System.out.println("Perdu ! Vous avez dépassé de " + ((nbPense - nbEntre) * -1));
        } else if (nbEntre < nbPense) {
            System.out.println("Perdu ! Il vous manquait " + (difference * -1)); // nbEntre-nbPense c'est la différence//
        } else {
            System.out.println("Quel bol, vous avez trouvé !"); 
        }
         
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