import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Database {
    private Connection connection;
    private Statement statement;

    //Construktor

    public Database(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Digunakan untuk Select
    public ResultSet selectQuery(String sql){
        try{
            statement.executeQuery(sql);
            return statement.getResultSet();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Digunakan untuk Insert, Update, dan Delete
    public int InsertUpdateDeleteQuery(String sql){
        try{
            return statement.executeUpdate(sql);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Getter
    public Statement getStatement() {
        return statement;
    }
}
