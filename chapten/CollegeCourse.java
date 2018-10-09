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
public class CollegeCourse {
    protected String department;
    protected int courseNum;
    protected int credits;
    protected double fee;

    public CollegeCourse(String department, int courseNum, int credits) {
        this.department = department;
        this.courseNum = courseNum;
        this.credits = credits;
        this.fee = 120 * credits;
    }
    public void display(){
        System.out.println("dept:" + this.department );
        System.out.println("course number:" + courseNum );
        System.out.println("credits:" + credits );
        System.out.println("fee:" + fee );
    }
}
