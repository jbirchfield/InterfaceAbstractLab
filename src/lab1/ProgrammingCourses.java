/*
 *     Jim Birchfield
 *     The three private members are all common to all three subclasses.  
 *     All three subclasses use the getters for each member and do not override them, so they
 *     are defined as not abstract.  All the setters are overridden in more than one subclass,
 *     so the setters are defined as abstract, requiring them to be overriden for each subclass's
 *     specific needs.
 */
package lab1;

public abstract class ProgrammingCourses {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public abstract void setCourseName(String courseName);

    public String getCourseName(){
        return courseName;
    }; 
    
    public abstract void setCourseNumber(String courseNumber); 
    
    public String getCourseNumber(){
        return courseNumber;
    };
    
    public abstract void setCredits(double credits); 
    
    public double getCredits(){
        return credits;
    }; 
}
