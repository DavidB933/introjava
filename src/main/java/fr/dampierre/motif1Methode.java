package fr.dampierre;

public class motif1Methode {
    
    public static void main(String[] args) {
        afficherTirets(); 
        afficherMotifs();
        afficherNombreSimple1();
        afficherNombreSimple2();
        afficherTirets(); 
    }

    public static void afficherTirets() {
        int nbt=40; 
        for (int i=1; i<=nbt ; i++) {
            System.out.print("-");
        } 
        System.out.println(); 
    }
 
    public static void afficherMotifs() {
        int nbM = 9; 
        for (int i=1; i<=nbM; i++) {
            System.out.print("_-^-_"); 
        } 
        System.out.println(); 
    }

    public static void afficherNombreSimple1() {
        int nbS = 9; 
        for (int i=1; i<=nbS; i++) {
            System.out.print(i); 
            System.out.print(i); 
        } 
        System.out.print("0"); 
        System.out.print("0"); 
    }

    public static void afficherNombreSimple2() {
        int nbS = 9; 
        for (int i=1; i<=nbS; i++) {
            System.out.print(i); 
            System.out.print(i); 
        } 
        System.out.print("0"); 
        System.out.print("0");
        System.out.println(); 
    }

} 