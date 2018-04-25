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
public class QuadratDefinitionTest {
    public static void main(String[] args) {
        QuadratDefinition q1 = new QuadratDefinition(10);
        System.out.println(q1.flaeche());
        
        System.out.println(QuadratDefinition.flaeche(q1));
        //System.out.println(q1.flaeche(q1));
    }
}
