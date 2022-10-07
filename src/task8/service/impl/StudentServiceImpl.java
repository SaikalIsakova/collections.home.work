package task8.service.impl;

import task8.Student;
import task8.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> removeStudents(List<Student> list) {
        ArrayList<Student>removedList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRating()<3){
                removedList.add(list.get(i));
                list.remove(list.get(i));
            }
        }
        System.out.println("Удалены за неуспеваемость. \n" + removedList);
        return removedList;
    }

    @Override
    public List<Student> moveToCourse(List<Student> list) {
        ArrayList<Student>nextCourse=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRating()>=3){
                nextCourse.add(list.get(i));
            }
        }
        System.out.println("Переведены на след курс.\n"+nextCourse);
        return nextCourse;
    }

    @Override
    public List<Student> printStudents(List<Student> students, int group) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getGroup()==group){
            System.out.print(students.get(i));
            }
        }
        return students;
    }
}
