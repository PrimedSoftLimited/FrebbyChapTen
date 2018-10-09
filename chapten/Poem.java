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
public class Poem {
    private String poemName;
    protected int numOfLines;

    public Poem(String poemName, int numOfLines) {
        this.poemName = poemName;
        this.numOfLines = numOfLines;
    }

    public String getPoemName() {
        return poemName;
    }

    public int getNumOfLines() {
        return numOfLines;
    }
    
}
