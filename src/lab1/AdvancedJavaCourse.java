package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Jim Birchfield
 * @version     1.00
 */
public class AdvancedJavaCourse extends ComputerClasses {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null or empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    

    

    
    
    
    

    
    
}
