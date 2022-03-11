package service;

import model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    void save(Student student);

    int findIndexById(int id);

    Student findById(int id);

    void update(int id, Student student);

    void delete(int id);
}
