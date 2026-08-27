package Spring.Booot.Study.JBDC.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DataBaseConnection {

    private static DataBaseConnection instance;
    private final Connection connection;

    private DataBaseConnection() {
        try {
            this.connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/biblioteca",
                    "postgres",
                    "3010"
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