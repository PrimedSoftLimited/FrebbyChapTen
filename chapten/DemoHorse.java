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
public class DemoHorse {
    public static void main(String[] args){
        RaceHorse race = new RaceHorse();
        race.setName("whatever");
        race.setColor("brown");
        race.setNumOfRacesCompeted(3);
        System.out.println(race.getName());
        System.out.println(race.getColor());
        System.out.println(race.getNumOfRacesCompeted());
        
        
    }
}
