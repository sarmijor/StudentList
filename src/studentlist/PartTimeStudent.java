/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;


/**
 *
 * @author jordansarmiento
 */
public class PartTimeStudent extends Student {
    
    private int numCourses;
    
    public PartTimeStudent(String name, int numCourses) {
        super(name);  // Call to the superclass constructor
        this.numCourses = numCourses;
    }
    
    public int getNumCourses(){
        return numCourses;
    }
    
    public void setNumCourses(int numCourses){
        this.numCourses = numCourses;
    }
    
}
