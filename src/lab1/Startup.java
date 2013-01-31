/*
 *  Jim Birchfield
 */
package lab1;

/**
 *
 * @author jamesb
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AdvancedJavaCourse class1 = new AdvancedJavaCourse("Java 2","2345");
       class1.setCredits(3.5);
       class1.setPrerequisites("Basic Java");
       
       System.out.println(class1.getCourseName() + 
                          class1.getCourseNumber() +
                          class1.getCredits() +
                          class1.getPrerequisites());
    }
}

