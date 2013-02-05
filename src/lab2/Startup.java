/*
 *  Jim Birchfield
 */
package lab2;

/*  The Liskov substitution principle cannot be used because the methods are not
 *  allocated properly.  It can be used when using a non interface superclass
 *  when you are using inheritance.  It cannot be used with an interface.
 *  The interface method is much easier to implement than the
 *  abstract class method.
 *
 * @author jamesb
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("Programming 101","2345");
       course1.setCredits(3.0);
       
       
       System.out.println(course1.getCourseName() + " " +
                          course1.getCourseNumber() + " " +
                          course1.getCredits());  
                          
    
    
        IntroJavaCourse course2 = new IntroJavaCourse("Java 101","4567");
            course2.setCredits(3.5);
            course2.setPrerequisites("Intro to Programming");
       
            System.out.println(course2.getCourseName() + " " +
                                course2.getCourseNumber() + " " +
                                course2.getCredits() + " " + 
                                course2.getPrerequisites());


        AdvancedJavaCourse class3 = new AdvancedJavaCourse("Java 201","7890");
            class3.setCredits(4.0);
            class3.setPrerequisites("Intro Java");
       
            System.out.println(class3.getCourseName() + " " +
                                class3.getCourseNumber() + " " +
                                class3.getCredits() + " " + 
                                class3.getPrerequisites());
    }
}
