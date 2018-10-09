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
public class LabCourse extends CollegeCourse{
    
    public LabCourse(String department, int courseNum, int credits) {
        super(department, courseNum + 50, credits);
    }

    display();
    
}
