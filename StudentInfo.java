import java.util.Scanner;

public class StudentInfo {
    static void main() {

                Scanner input = new Scanner(System.in);
                String fullName, indexNumber, department, gender;
                int age, level;
                double gpa;
                String adultStatus, academicClass;

                System.out.println("Enter Full Name: ");
                fullName = input.nextLine();
                System.out.println("Enter Index Number: ");
                indexNumber = input.nextLine();
                System.out.println("Enter Age: ");
                age = input.nextInt();
                System.out.println("Enter Gender: ");
                input.next();
                gender = input.nextLine();
                System.out.println("Enter Department: ");
                department = input.nextLine();
                System.out.println("Enter Level: ");
                level = input.nextInt();
                System.out.println("Enter GPA: ");
                gpa = input.nextDouble();

                //check adult status
                if (age >= 18) {
                    adultStatus = "Yes";
                } else {
                    adultStatus = "No";
                }

                //gpa
                if (gpa >= 3.5 && gpa <= 4.0) {
                    academicClass = "First class";
                } else if (gpa >= 3.0 && gpa < 3.5) {
                    academicClass = "Second class Upper";
                } else if (gpa >= 2.5 && gpa < 3.0) {
                    academicClass = "Second class Lower";
                }else{
                    academicClass ="pass";
                }

                //output
                System.out.println("======= STUDENT PROFILE ========");
                System.out.println("Name: " + fullName);
                System.out.println("Index no. " + indexNumber);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Department: " + department);
                System.out.println("Level: " + level);
                System.out.println("GPA: " +gpa);

                System.out.println("Adult Status: " +adultStatus);
                System.out.println("Academic Class: " +academicClass);

    }
}
