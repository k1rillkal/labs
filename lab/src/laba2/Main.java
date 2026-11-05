package laba2;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Student> students = new ArrayList<>();

        for(int i=0; i < n; i++){
            String name = scanner.next();
            int age = scanner.nextInt();
            students.add(new Student(name, age));
        }
        Sorting<Student> studentSort = new StudentSort();
        studentSort.sort(students);

        for (Student student : students)
        {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
