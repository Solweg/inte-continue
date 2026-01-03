package bibliotheque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDDbilbio {
    // 'mariadb' est le nom du service dans le docker-compose
    // 3306 est le port interne du conteneur
    private static final String URL = "jdbc:mariadb://mariadb_db:3306/bibliotheque";
    private static final String USER = "root"; 
    private static final String PASSWORD = "root"; // Aligné sur ton nouveau compose
    // ... reste du code

    public static Connection getConnection() throws SQLException {
        try {
            // Nécessite la dépendance MySQL Connector/J !
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC non trouvé.");
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}