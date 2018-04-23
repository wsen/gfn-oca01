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
public class Start {
    
    static String text = "Das ist ein kurzer Text";
    
    // psvm tab
    public static void main(String args[]) {
        //sout tab
        System.out.println("Hello World");
        java.lang.System.out.println(text);
        
        Buch b = new Buch("Nach dem Fest");
        
        System.out.println(b);
        //System.out.println(b.wachWas());
        //b.machWas(); //Instanzmethode
    }
    
}

class Buch {
    String autor;
    String titel;
    
    //de.gfn.oca.basics.Buch@15db9742
    //Hexadezimaler Hash Code
    
    Buch(String titel) {
        this.titel = titel;
    }
    
    /*
    Buch2(String t) {
        titel = t;
    }
*/
   void wachWas() {
       System.out.println(autor + ", " + titel);   
   }
}
