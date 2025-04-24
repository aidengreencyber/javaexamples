import java.util.ArrayList;

    class Student {
        private String firstName;
        private String lastName;
        private String studentId;
        private String email;
        private String phoneNumber;
    
        public Student(String firstName, String lastName, String studentId, String email, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentId = studentId;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
    
            students.add(new Student("Alice", "Anderson", "S001", "alice.anderson@example.com", "555-1111"));
            students.add(new Student("Bob", "Brown", "S002", "bob.brown@example.com", "555-2222"));
            students.add(new Student("Charlie", "Clark", "S003", "charlie.clark@example.com", "555-3333"));
    
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Student " + (i + 1) + ": [" + students.get(i).toString() + "]");
            }
        }
    
        @Override
        public String toString() {
            return "First Name: " + firstName + ", Last Name: " + lastName + 
                   ", Student ID: " + studentId + ", Email: " + email + 
                   ", Phone Number: " + phoneNumber;
        }
    }

