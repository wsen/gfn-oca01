/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.scoutcamp;

import de.gfn.oca.scoutcamp.entity.Scout;

/**
 *
 * @author student
 */
public class App {
    public static void main(String[] args) {
        System.out.println("START");
        //TODO: Scouts aus DB oder Datei lesen
        
        // User-Eingabe verarbeiten
        
        Scout s1 = new Scout("Peter", "Parker"); //Aufruf über def. Konstruktor
        // s1.setFirstname("Peter"); // Aufruf über default, also ohne eigens definierten Konstruktor
        // s1.setLastname("Parker");
        
        Scout s2 = new Scout();
         s2.setFirstname("Bruce");
         s2.setLastname("Wayne");
         
         Scout s3 = new Scout();
        
        System.out.println(s1);
        System.out.println("-----");
        System.out.println(s2);
        System.out.println("-----");
        System.out.println(s3);
        
        //TODO: Scouts in die DB oder Datei schreiben
        System.out.println("END");
        
    }
}
