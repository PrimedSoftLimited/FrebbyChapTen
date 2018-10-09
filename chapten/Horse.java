/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapten;

import java.time.LocalDate;

/**
 *
 * @author Frebby
 */
public class Horse {
    private String name;
    private String color;
    private LocalDate birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }
    
}
