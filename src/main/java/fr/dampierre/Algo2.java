package fr.dampierre;

public class Algo2 {
    public static void main(String[] args) {
int quotaVentes = 10; 
int nbVentesSemaine = 9;
int nbVentesManquantes = quotaVentes - nbVentesSemaine; 
if (nbVentesSemaine >= quotaVentes) { 
    System.out.println("Felicitations vous avez rempli le quota");
}
else { 
System.out.println("Il vous manque" + nbVentesManquantes + "pour atteindre le quota");
}

    }
} 
