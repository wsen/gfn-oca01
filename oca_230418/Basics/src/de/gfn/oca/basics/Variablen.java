/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

/**
 *
 * @author student
 */
public class Variablen {
    
    int x; 
    static int y; //Default Initialisierung: y = 0
    String s; //null als Default Initialisierung
    
    {
        String s3; // ist im Initialisierungblock eine lokale Variable
                    // hier vor dem Konstruktur
    }
    
    public static void main(String[] args) {
        // Lokale Variable haben keine Default-Intialisierung 
        // gilt für primitive als auch für Referenzvariablen
        int x = 10;
        System.out.println(x);
        
        //Variante
        //int x;
        String s = "LOKAL";
        System.out.println(s);
        Variablen v = new Variablen();
        System.out.println(v.s);
        //System.out.println(this.s);
    }
    
}
