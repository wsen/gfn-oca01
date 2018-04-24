/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.methoden;

/**
 *
 * @author student
 */
public class MethodenAufrufe1 {
    //Instanzmethoden
    public void instMethode1(){
        System.out.println("1. Instanzmethode der Klasse MethodenAufrufe1");
        instMethode2();
        klsMethode1();
        
    };
    
    private void instMethode2(){
        System.out.println("Die instMethode2 meldet sich!");
        System.out.println("2. Instanzmethode der Klasse MethodenAufrufe1");
    };
    
    //Klassenmethoden
    void klsMethode1(){
        System.out.println("Die klsMethode1 meldet sich");
        System.out.println("„1." + "Klassenmethode der Klasse MethodenAufrufe1");
    };
    
    void klsMethode2(){
        System.out.println("2. Klassenmethode der Klasse MethodenAufrufe1");
        instMethode2();
        klsMethode1();
    };    
}
