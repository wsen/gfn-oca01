/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgaben.blatt1;

/**
 *
 * @author student
 */
public class QuadratDefinition {
    private int a;

    public QuadratDefinition(int a) {
        this.a = a;
    }
    
    public int flaeche() {
        return a * a;
    }
    
    public static int flaeche(QuadratDefinition q) {
        return q.a * q.a;
        //return q.flaeche();
    }
}
