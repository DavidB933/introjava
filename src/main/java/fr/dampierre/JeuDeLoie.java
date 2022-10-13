// package fr.dampierre;

// import java.util.Random;
// import java.util.Scanner;

// public class JeuDeLoie {
//     public static void main(String[] args) {
//         int nbCases = 20;
//         int nbDeFacesDe = 6;

//         Random generateur = new Random();
//         int LancerDeDe = generateur.nextInt(6) + 1;
//         int laCase = 0;

//         while (laCase != 20) {
//             laCase = 0;
//             for (int i = 1; i <= 5; i++) {
//                 // avancer le pion d'autant de cases
//                 laCase = laCase + LancerDeDe;
//             }
//             if (laCase == 20) {
//                 System.out.println("Vous êtes à la case" + laCase);
//                 System.out.println("Vous avez gagné !");
//             } else {
//                 System.out.println("Vous êtes à la case" + laCase);
//                 System.out.println("Vous avez perdu !");
//             }
//         }

//     }
// }
