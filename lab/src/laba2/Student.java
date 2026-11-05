package laba2;

public class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
 @Override
    public int compareTo(Student other) {
        int result = this.name.compareTo(other.name);

        if (result == 0) {
            return Integer.compare(this.age, other.age);
        }

        return result;
    }

}
