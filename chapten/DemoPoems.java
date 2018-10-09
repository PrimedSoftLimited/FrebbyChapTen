/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapten;

/**
 *
 * @author Frebby
 */
public class DemoPoems {
    public static void main(String[] args) {
        
        Poem poem = new Poem("concern u", 13);
       Couplet coup = new Couplet("Whatever");
       Limerick lime = new Limerick("Who cares");
        Haiku hai = new Haiku("i dont no");
        
        System.out.println(poem.getPoemName());
       System.out.println( poem.getNumOfLines());
        System.out.println(coup.getPoemName());
        System.out.println(coup.getNumOfLines());
        System.out.println(lime.getPoemName());
       System.out.println( lime.getNumOfLines());
System.out.println(hai.getPoemName());
       System.out.println( hai.getNumOfLines());
    }
}
