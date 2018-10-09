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
public class PetSold extends ItemSold{
    private boolean vaccinated;
    private boolean neutered;
    private boolean houseBroken;

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHouseBroken() {
        return houseBroken;
    }

    public void setHouseBroken(boolean houseBroken) {
        this.houseBroken = houseBroken;
    }
    
}
