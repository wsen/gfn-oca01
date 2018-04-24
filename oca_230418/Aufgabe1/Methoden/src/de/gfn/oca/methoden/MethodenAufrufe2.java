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
public class MethodenAufrufe2 {
    //Instanzmethoden
    public void instMethode(){
        System.out.println("Instanzmethode der Klasse MethodenAufrufe2");
         klsMethode();
    }
   
    //Klassenmethoden
    public static void klsMethode(){
        System.out.println("Klassenmethodenaufruf aus instMethode der Klasse MethodenAufrufe2");
    }
}
