import java.sql.SQLException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to name the table?");
        String table = scanner.nextLine();
        System.out.println("The first column will be the id SERIAL PRIMARY KEY");
        System.out.println("What do you want the name of the second column to be?");
        String firstColumn = scanner.nextLine();
        System.out.println("What do you want the third column to be?");
        String secondColumn = scanner.nextLine();

        scanner.close();

        var sql = String.format("CREATE TABLE %s ("+
        "           id SERIAL PRIMARY KEY," +
        "           %s VARCHAR(255) NOT NULL," +
        "           %s DECIMAL(10, 2) NOT NULL" +
        ");", table, firstColumn, secondColumn);

        try (var conn = DB.connect();
            var stmt = conn.createStatement()) { 
                stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
