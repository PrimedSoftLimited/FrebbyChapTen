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
public class DemoCandle {
    public static void main(String[] args){
        Candle candle = new Candle();
        ScentedCandle scent = new ScentedCandle();
        
        candle.setHeight(4.5);
        scent.setHeight(5.6);
        System.out.println(candle.getHeight());
         System.out.println(scent.getHeight());
    }
}
