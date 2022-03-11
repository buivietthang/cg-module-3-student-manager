package service;

import dao.StudentDao;
import model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    public static List<Student> students = StudentDao.getAllClass();

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Student student) {
        int indexOf = findIndexById(id);
        students.set(indexOf, student);
    }

    @Override
    public void delete(int index) {
        students.remove(index);
    }
}
