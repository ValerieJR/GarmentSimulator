public class StudentInfo {
    private int studentID;
    private String studentName;
    public static int objectCounter = 0;
    public int objectCounter2 = 0;
    StudentInfo(){
        studentID =  0;
        studentName = "Mohammad";
        objectCounter++;
        objectCounter2++;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void printObjectCounter(){
        System.out.println("the current object counter = " + objectCounter);
    }
    public void printObjectCounter2(){
        System.out.println("the current object counter2 = " + objectCounter2);
    }

}
