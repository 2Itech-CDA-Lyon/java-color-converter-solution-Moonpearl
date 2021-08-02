package com.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Point d'entrée de l'application
 */
public class App 
{
    /**
     * Processus principal de l'applcation
     * @param args
     */
    public static void main( String[] args )
    {
        // Affiche le menu dans la console
        System.out.println("1. Entrer un code hexadécimal");
        System.out.println("2. Entrer trois valeurs de rouge, vert, et bleu");

        // Attend une saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        // En fonction du choix de l'utilisateur
        switch (choice) {
            // Entrer un code hexadécimal
            case 1:
                // Attend une saisie utilisateur
                System.out.println("Entrez un code hexadécimal");
                System.out.print("#");
                String hexString = scanner.nextLine();
                // Transforme le code de couleur hexadécimal fourni en rouge, vert, bleu, et affiche le résultat
                int[] rgbArray = new int[] {
                    Integer.valueOf( hexString.substring( 0, 2 ), 16 ),
                    Integer.valueOf( hexString.substring( 2, 4 ), 16 ),
                    Integer.valueOf( hexString.substring( 4, 6 ), 16 ),
                };
                System.out.println( Arrays.toString(rgbArray) );
                break;
            
            // Entrer une valeur de rouge, une valeur de vert, une valeur de bleu
            case 2:
                // Attend une saisie utilisateur
                System.out.println("Entrez une valeur de rouge");
                int red = Integer.parseInt(scanner.nextLine());
                System.out.println("Entrez une valeur de vert");
                int green = Integer.parseInt(scanner.nextLine());
                System.out.println("Entrez une valeur de bleu");
                int blue = Integer.parseInt(scanner.nextLine());
                // Transforme des valeurs de rouge, vert, bleu en code hexadécimal et affiche le résultat
                hexString = String.format("#%02X%02X%02X", red, green, blue);
                System.out.println( hexString );
                break;
        }
    }
}
