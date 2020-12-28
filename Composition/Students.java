package JavaBasic.Chapter_1_Intro.Composition;

public class Students {
    private String names;
    private String dataOfBirth;
    private boolean hasStudentHousing;
//    public Course course;
    private Course course;



    public void setNames(String name){
        this.names = name;
    }
    public void setDataOfBirth(String dataOfBirth){
        this.dataOfBirth = dataOfBirth;
    }
    public void setHasStudentHousing(boolean studentHousing){
        this.hasStudentHousing = studentHousing;
    }

    public String getNames() {
        return names;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public boolean isHasStudentHousing() {
        return hasStudentHousing;
    }
    public void setCourse(Course course){
        this.course = course;
    }
    public Course getCourse(){
        return this.course;
    }
}
