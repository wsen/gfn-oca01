package de.gfn.oca.basics;

/**
 *
 * @author student
 */
public class Start {
    
    static String text = "Das ist ein kurzer Text";
    
    public static void main(String[] argerHanswurst) {
    
        System.out.println("Hallo Welt!");
        System.out.println(text);
        System.out.println(argerHanswurst);
        
        Buch b = new Buch("Nach dem Fest");
        b.machWas();
    }
}


