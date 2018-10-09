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
public class ScentedCandle extends Candle{
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
@Override
public void setHeight(Double height) {
    price = 3;
        this.height = height;
    }

}
