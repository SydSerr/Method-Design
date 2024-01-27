import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Sydney", "Serrano");
        s1.addCourse("AP Lit", 93);
        s1.addCourse("AP Physics 1", 100);
        s1.addCourse("AP Calc BC", 90);

        Student s2 = new Student("Mickey","Sosa");
        s2.addCourse("Forensics",100);
        s2.addCourse("STEAM Capstone",95);
        s2.addCourse("AP CS A",92);

        Student s3 = new Student("Julia","de Andrade");
        s3.addCourse("College Math",95);
        s3.addCourse("AP Gov",98);
        s3.addCourse("Catholic Innovations",100);

        System.out.println(s1);
    }

    public static class Student {
        public String firstName, lastName, courseName;
        public int testScore;
        public ArrayList<Courses> courses;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.courses = new ArrayList<Courses>();
        }

        //method inside that adds an arraylist for Courses so main method arraylist is under the student
        public void addCourse(String courseName, int testScore) {
            this.courses.add(new Courses(courseName, testScore));
        }

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

        public void getAvg() {
            //double s1Avg = (Student.getTestScore() + sc2.getTestScore() + sc3.getTestScore()) / 3;

        }

        public String toString() {
            String result;
            result = firstName + " " + lastName + ": \n"; //needs display courses with scores and testAvg
            for (int i = 0; i < courses.size(); i++) {
                result = result + " " + courses.get(i);
            }
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

    }
}
