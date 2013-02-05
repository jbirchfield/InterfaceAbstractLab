/*
 *  Jim Birchfield
 */
package lab1;

/*  I don't know when the Liskvov substituion principle is useful or not.  It didn't
 *  make any difference in my results. I guess I don't really understand inheritance,
 *  I can't get any inherited methods to work.
 *  This coding is somewhat cumbersome, I would prefer using interface methods.  
 *
 * @author jamesb
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProgrammingCourses class1 = new IntroToProgrammingCourse("Programming 101","2345");
       class1.setCredits(3.0);
       
       
       System.out.println(class1.getCourseName() + 
                          class1.getCourseNumber() +
                          class1.getCredits());  
                          
    
    
        IntroJavaCourse course2 = new IntroJavaCourse("Java 101","4567");
            course2.setCredits(3.5);
            course2.setPrerequisites("Intro to Programming");
       
            System.out.println(course2.getCourseName() + 
                                course2.getCourseNumber() +
                                course2.getCredits() +  
                                course2.getPrerequisites());


        AdvancedJavaCourse class3 = new AdvancedJavaCourse("Java 201","7890");
            class3.setCredits(4.0);
            class3.setPrerequisites("Intro Java");
       
            System.out.println(class3.getCourseName() + 
                                class3.getCourseNumber() +
                                class3.getCredits() +  
                                class3.getPrerequisites());
    }
}
