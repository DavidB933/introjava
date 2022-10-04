
package fr.dampierre;

import java.util.Scanner;
public class CafeCreme {
    public static void main(String[] args) {
int coutCafeEnCentimes = 100 ; 
int pieceDeUn = 1 ; 
int pieceDeCinq = 5 ; 
int pieceDeDix = 10 ; 
int pieceDeVingt = 20 ; 
int pieceDeCinquante = 50 ;

Scanner clavier = new Scanner(System.in) ; 
int nombreDePieceDeUn = clavier.nextInt() ; 
int nombreDePieceDeCinq = clavier.nextInt() ; 
int nombreDePieceDeDix = clavier.nextInt() ; 
int nombreDePieceDeVingt = clavier.nextInt() ; 
int nombreDePieceDeCinquante = clavier.nextInt() ;

int montantInsere = (nombreDePieceDeUn * pieceDeUn) 
+ (nombreDePieceDeDix * pieceDeDix) + (nombreDePieceDeVingt * pieceDeVingt) 
+ (nombreDePieceDeCinquante * pieceDeCinquante) ; 
int montantManquant = coutCafeEnCentimes - montantInsere ; 
int montantRestant = montantInsere - coutCafeEnCentimes ; 

If (montantInsere = 100) {
    System.out.println("Vous avez exactement de quoi vous payer le café !") ; 
} else if (montantInsere < 100) { 
    System.out.println("Il vous manque" + montantManquant +"pour prendre un cafe.") ; 
} else {
    System.out.println("Il vous restera" + montantRestant + "après avoir pris votre café !") ;
}


    }
}
