
import java.util.HashMap;
import java.util.Map;

class StudentCourses {

    private Map<String, Integer> courses;

    // Constructor to initialize the courses map
    public StudentCourses() {
        courses = new HashMap<>();
    }

    // Method to add courses and marks
    public void addCourse(String courseName, int marksObtained) {
        courses.put(courseName, marksObtained);
    }

    // Method to display courses and marks
    public void displayCoursesAndMarks() {
        System.out.println("\nCourses and Marks Obtained:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Hardcoded course information
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.addCourse("Mathematics", 85);
        studentCourses.addCourse("Physics", 78);
        studentCourses.addCourse("Computer Science", 90);

        studentCourses.displayCoursesAndMarks();
    }
}
