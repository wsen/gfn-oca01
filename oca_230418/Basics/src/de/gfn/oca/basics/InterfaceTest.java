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
public class InterfaceTest {
    
}

class Jet implements ILanden {

    @Override
    public void machWas() {
        ILanden.super.machWas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fahrwerkAusfahren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void landen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void landebahnVerlassen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Luftbalon implements ILanden {

    @Override
    public void machWas() {
        ILanden.super.machWas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fahrwerkAusfahren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void landen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void landebahnVerlassen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

interface ILanden {
    
    public static final int x = 10;
    
    default void machWas() {
        
    }
    
    static void machWasStatic() {
        
    }
    
    public void fahrwerkAusfahren();

    public void landen();

    public void landebahnVerlassen();
}
