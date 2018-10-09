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
public class Alien {
    private int eyesNum;
    private int livesNum;
    private String color;

    public Alien(int eyesNum, int livesNum, String color) {
        this.eyesNum = eyesNum;
        this.livesNum = livesNum;
        this.color = color;
    }
    public String aboutAlien(){
        return "blah blah blah" + " eyes num " + eyesNum + " Lives " + livesNum +
                " color " + color;
    }
}
