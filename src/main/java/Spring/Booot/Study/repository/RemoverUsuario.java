package Spring.Booot.Study.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoverUsuario {

    private final Connection connection;

    public RemoverUsuario(Connection connection) {
        this.connection = connection;
    }

    public void removerUsuario(String email) {

        String sql = "DELETE FROM usuarios WHERE email = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, email);

            int linhasAfetadas = statement.executeUpdate();

            statement.close();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário removido com sucesso!");
            } else {
                System.out.println("Usuário não encontrado!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}