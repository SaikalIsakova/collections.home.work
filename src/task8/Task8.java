package task8;

import task8.service.StudentService;
import task8.service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        StudentService students=new StudentServiceImpl();
        List<Student >studentList=new ArrayList<>();
        studentList.add(new Student("John","Java",2,5));
        studentList.add(new Student("Peter","Java",3,2));
        studentList.add(new Student("Alice","Java",2,4));
        studentList.add(new Student("Tom","Java",4,2));
        studentList.add(new Student("Mike","Java",2,3));
        studentList.add(new Student("Peter","Java",3,1));

        System.out.println("Студенты группы.");
        students.printStudents(studentList,2);
        students.removeStudents(studentList);
        students.moveToCourse(studentList);

    }

}
