package task8.service;

import task8.Student;

import java.util.List;

public interface StudentService {
   List<Student> removeStudents(List<Student>list);
   List<Student> moveToCourse(List<Student>list);
   List<Student> printStudents(List<Student> students, int group);



}
