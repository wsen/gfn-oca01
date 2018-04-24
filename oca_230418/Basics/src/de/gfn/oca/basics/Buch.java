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
class Buch {

    String autor;
    String titel;
    
    Buch(String titel) {
    
        this.titel = titel;
    }
    
    void machWas() {
        System.out.println(autor + ", " + titel);
    }
}
