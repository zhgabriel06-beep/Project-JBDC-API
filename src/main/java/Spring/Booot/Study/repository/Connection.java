package Spring.Booot.Study.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Connection {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            java.sql.Connection connection = DataBaseConnection.getInstance().connection();
            PreparedStatement pstm = connection.prepareStatement("SELECT * FROM usuarios");
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String nome= resultSet.getString("nome");
                String email = resultSet.getString("email");
                int idade = resultSet.getInt("idade");
                String data_nascimento = resultSet.getString("data_nascimento");
                usuarios.add(new Usuario(nome, email, idade, data_nascimento));
            }
        }catch (SQLException e){
            throw new RuntimeException("Cannot connect to database.");
        }
        usuarios.forEach(usuario ->  System.out.println(usuario.getNome()));
    }
}
