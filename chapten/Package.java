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
public class Package {
    private double weight;
    private char shippingMethod;
    private String shippingCost;

    public Package(double weight, char shippingMethod) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
    }
    public void display(){
        System.out.println(weight);
        System.out.println(shippingMethod);
        System.out.println(shippingCost);
        
    }
}
