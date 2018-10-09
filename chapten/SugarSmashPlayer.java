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
public class SugarSmashPlayer {
    private int idNum;
    private String screenName;
    private int[] highestScore;
    private int[] gameLevel;

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int[] getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int[] highestScore, int[] gameLevel) {
        for(int x = 0; x > this.highestScore.length || x > this.gameLevel.length; ++x){
            System.out.println("out of range");
            if(x < this.highestScore.length || x < this.gameLevel.length){
        this.highestScore = highestScore;
        this.gameLevel = gameLevel;
    }
    }
    }
    
}
