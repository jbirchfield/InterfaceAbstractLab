/*
 *     Jim Birchfield
 */
package lab1;

public abstract class ComputerClasses {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public abstract String getCourseName(); 
    
    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();
    
    public abstract void setCourseNumber(String courseNumber); 

    public abstract double getCredits(); 

    public abstract void setCredits(double credits); 

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    
    
}
