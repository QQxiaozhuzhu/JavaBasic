package JavaBasic.Chapter_1_Intro.Composition;
public class Main {
    public static void main(String [] args){

    Students students = new Students();
    students.setNames("Bubble");
    students.setDataOfBirth("1-12-1999");
    students.setHasStudentHousing(false);

//    Course course = new Course();
//    course.setLevel("320");
//    course.setTitle("Theory of Math");
//    course.setStarDate("1-31-2021");

// When course is public
//        students.course = new Course();
//        students.course.setTitle("Computer Science");

        students.setCourse(new Course());
        students.getCourse().setTitle("Computer Science");
        students.getCourse().setLevel("230");
        students.getCourse().setStarDate("1-11-2011");

        System.out.println("Name : " + students.getNames());
        System.out.println("Date of Births : " + students.getDataOfBirth());
        System.out.println("Student Housing : " + (students.isHasStudentHousing() ? "Yes" : "No" ));

        

    }
}

/*
Composition:
    Composition is when an object is composed of other objects and this happens when the fields
    hold a reference to another object

Composition: "has a" relationship
      //Human has a brain
      //employee has a manager
      //a book has pages
 */
