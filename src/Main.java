import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Student> students = new ArrayList<>()
        //Student s1 = new Student("Sydney", "Serrano");
        //  s1.addCourse("AP Lit", 93);
        //  s1.addCourse("AP Physics 1", 100);
        //  s1.addCourse("AP Calc BC", 90);


        ArrayList students = new ArrayList<>();
        Student s1 = new Student("Sydney","Serrano");
        Courses sc1 = new Courses("AP Lit",93);
        Courses sc2 = new Courses("AP Physics 1",100);
        Courses sc3 = new Courses("AP Calc BC",90);
        students.add(s1);
        students.add(sc1);
        students.add(sc2);
        students.add(sc3);

        System.out.println(students);

        Student s2 = new Student("Mickey","Sosa");
        Courses mc1 = new Courses("Forensics",100);
        Courses mc2 = new Courses("STEAM Capstone",95);
        Courses mc3 = new Courses("AP CS A",92);
        students.add(s2);
        students.add(mc1);
        students.add(mc2);
        students.add(mc3);

        Student s3 = new Student("Julia","de Andrade");
        Courses jc1 = new Courses("College Math",95);
        Courses jc2 = new Courses("AP Gov",98);
        Courses jc3 = new Courses("Catholic Innovations",100);
        students.add(s3);
        students.add(jc1);
        students.add(jc2);
        students.add(jc3);

    }
    public static class Student {
        public String firstName, lastName, courseName;
        public int testScore;
        //public ArrayList<Courses> courses;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            //this.courses = new ArrayList<>();
        }
//method inside that adds an arraylist for Courses so main method arraylist is under the student
//        public void addCourse(String courseName, int testScore){
//            this.courses.add(new Courses(courseName, testScore));
//        }

        //constructor for all instance data
        public void Course(String courseName, int testScore) {
            this.courseName = courseName;
            this.testScore = testScore;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public int getTestScore() {
            return testScore;
        }
        public void setTestScore(int testScore) {
            this.testScore = testScore;
        }
        public String getCourseName() {
            return courseName;
        }
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        //toString not working
        public String toString() {
            String result;
            result = firstName + " " + lastName + ": \n" + courseName + " " + testScore;
            return result;
        }
    }

    public static class Courses {
        public String courseName;
        public int testScore;

        public int getTestScore() {
            return testScore;
        }
        public void setTestScore(int testScore) {
            this.testScore = testScore;
        }
        public String getCourseName() {
            return courseName;
        }
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public Courses(String courseName, int testScore) {
            this.courseName = courseName;
            this.testScore = testScore;

        }

    }}

//    public void getTestAvg (ArrayList students, double avg, int testScore) {
//
//        double s1Avg = (sc1.getTestScore() + sc2.getTestScore() + sc3.getTestScore())/3;
//        double s2Avg = (mcs1.getTestScore() + mc2.getTestScore()+mc3.getTestScore())/3;
//        double s3Avg = (jc1.getTestScore() + jc2.getTestScore()+jc3.getTestScore())/3;
//
//    }


