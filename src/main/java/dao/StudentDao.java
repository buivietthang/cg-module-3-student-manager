package dao;

import model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private static Connection connection = ConnectMySQL.getConnection();

    public static List<Student> getAllClass() {
        String sqlGetAllStudent = "SELECT * FROM student";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlGetAllStudent);

            ArrayList<Student> students = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("idStudent");
                String name = resultSet.getString("name");
                String dateOfBirth = resultSet.getString("dateOfBirth");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                int idClassRoom = resultSet.getInt("idClassRoom");

                students.add(new Student(id, name, dateOfBirth, address, phoneNumber, email, idClassRoom));
            }
            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
