import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class DB {
    public static Connection connect() throws SQLException {
        try {
            // Get Database creds from databaseconfig class
            var jdbcUrl = DatabaseConfig.getDbURL();
            var user = DatabaseConfig.getDbUsername();
            var password = DatabaseConfig.getDbPassword();

            // open a connection
            return DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
