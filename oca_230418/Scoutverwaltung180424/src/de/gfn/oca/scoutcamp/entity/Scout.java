/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.scoutcamp.entity;

import java.time.LocalDate;

/**
 *
 * @author student
 */
public class Scout {
    //Eigenschaften definieren
    private int id; //Datenkapselung mit private
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private boolean aktiv;

    // Konstruktor
    /* default, falls expliziet kein Konstruktor definiert ist dann:
    public Scout() {}
    */

    // Konstruktor definieren //HIER: überladen, um Parameter per Objektaufruf zu ermöglichen
    public Scout() {
        this("ohne Vornamen", "ohne Nachnamen"); //in der 1.Zeile immer this ODER super
    }
    
    public Scout(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
       
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    //is statt set bei boolschen Datentyp
    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
    
   
    @Override
    public String toString() {
        //default
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "name: " + firstname + " " + lastname;
        //Ausgabe: 
        //name: null null
        //Default Werte der Varialben, wenn diese noch nicht zugwiesen sind.
    }
    
    
}
