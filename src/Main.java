import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //ArrayList for 3 diff students and their Courses
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

        //print out students name, courses, and test avg
        System.out.println(s1 + " Avg: " + s1.getAvg());
        System.out.println(s2 + " Avg: " + s2.getAvg());
        System.out.println(s3 + " Avg: " + s3.getAvg());
    }
    //Student class that assigns students first and last names with 3 diff courses
    public static class Student {
        public String firstName, lastName, courseName;
        public int testScore;
        public ArrayList<Courses> courses;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.courses = new ArrayList<Courses>();
        }

        //method that adds an arraylist for Courses so main method arraylist is under the student
        public void addCourse(String courseName, int testScore) {
            this.courses.add(new Courses(courseName, testScore));
        }

        //constructor for all instance data
        public void Course(String courseName, int testScore) {
            this.courseName = courseName;
            this.testScore = testScore;
        }
        //getters and setters for all instance data
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
        //getAvg method
        public double getAvg() {
            int total = 0;
            int numberOfCourses = courses.size();

            for (int i = 0; i < numberOfCourses; i++) {
                total += courses.get(i).getTestScore();
            }

            return (double) total / numberOfCourses;
        }
        //toString that displays students first and last name
        public String toString() {
            String result;
            result = firstName + " " + lastName + "\n";
            for (int i = 0; i < courses.size(); i++) {
                result = result + " " + courses.get(i);
            }
            return result;
        }
    }
    //Courses class that assigns courseName with a score
    public static class Courses {
        public String courseName;
        public int testScore;
        //getters and setters for all instance data
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
        //toString to display courseName and testScore
        public String toString() {
            String result;
            result = courseName + ": " + testScore + "\n";
            return result;
        }
    }
}