package Spring.Booot.Study.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DataBaseConnection {

    private static DataBaseConnection instance;
    private final Connection connection;
    private final String URL = "jdbc:postgresql://localhost:5432/biblioteca";
    private final String USER = "postgres";
    private final String PASSWORD = "3010";

    private DataBaseConnection() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD
            );
        } catch (SQLException e) {
            throw new RuntimeException("Cannot connect to database.", e);
        }
    }

    public static DataBaseConnection getInstance() {
        if (Objects.isNull(instance)) {
            instance = new DataBaseConnection();
        }
        return instance;
    }

    public Connection connection() {
        return connection;
    }
}