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
public class DemoItemsAndPets {
    public static void main(String[] args){
        ItemSold item = new ItemSold();
        PetSold pet = new PetSold();
        item.setPrice(34.5);
        item.setInvoiceNum(34);
         System.out.println(item.getPrice());
          System.out.println(item.getInvoiceNum());
        pet.setVaccinated(true);
        pet.setInvoiceNum(12);
         System.out.println(pet.getInvoiceNum());
         System.out.println(pet.isVaccinated());
        
        
        
    }
}
