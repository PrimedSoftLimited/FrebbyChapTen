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
public class CreateAliens {
    public static void main(String[] args){
    
        Martian martian = new Martian(3, 5, "brown");
        Jupiterian jupiter = new Jupiterian(5, 2, "black");
        
        System.out.println(martian.aboutAlien());
        System.out.println(jupiter.aboutAlien());
        
    
}
}
