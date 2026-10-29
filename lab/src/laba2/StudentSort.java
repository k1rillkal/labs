package laba2;

import sortirovki.Sorting;

import java.util.List;

public class StudentSort implements Sorting<Student> {
    @Override
    public void sort(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i;
            while(j > 0 && students.get(j-1).getAge() > current.getAge())
            {
                students.set(j,students.get(j-1));
                j--;
            }
            students.set(j,current);

        }

        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i;
            while(j > 0 && students.get(j-1).getName().compareTo(current.getName())>0)
            {
                students.set(j,students.get(j-1));
                j--;
            }
            students.set(j,current);

        }
    }
}
