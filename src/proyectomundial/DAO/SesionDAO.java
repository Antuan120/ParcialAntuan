package proyectomundial.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SesionDAO {

    
   public boolean Validacion(String usuar, String contrase) {
       String dbUrl = "jdbc:postgresql://dpg-cfpuu1qrrk0fd9ounopg-a.oregon-postgres.render.com:5432/unisimon";
        String dbUsername = "unisimon_user";
        String dbPassword = "11k1WiZg5ekiFQYHx9Bog6W7cTArSZea";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM a_penaranda12.users WHERE username = '" + usuar+ "' AND password = '" + contrase+ "'";
            ResultSet resultSet = statement.executeQuery(query);
            return resultSet.next(); // Si hay una fila de resultado, las credenciales son válidas
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
       
    }
   
   
    
    

}
