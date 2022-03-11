package dao;

import model.ClassRoom;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomDao {
    private static Connection connection = ConnectMySQL.getConnection();

    public static List<ClassRoom> getAllClass() {
        String sqlGetAllClass = "SELECT * FROM classroom";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlGetAllClass);

            ArrayList<ClassRoom> classes = new ArrayList<>();

            while (resultSet.next()) {
                int idClassRoom = resultSet.getInt("idClassRoom");
                String nameClassRoom = resultSet.getString("nameClassRoom");

                classes.add(new ClassRoom(idClassRoom, nameClassRoom));
            }
            return classes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
