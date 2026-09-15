package Spring.Booot.Study.repository;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastrarUsuario {
    private Connection connection;
    public CadastrarUsuario(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(String nome, String email, int idade, String data_nascimento) {
        String sql = "INSERT INTO usuarios (nome, email,idade,data_nascimento ) VALUES (?, ?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setInt(3, idade);
            statement.setString(4, data_nascimento);
            statement.execute();
            statement.close();
            System.out.println("Usuario cadastrado com sucesso!");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
      //  listaUsuarios.forEach(usuario ->  System.out.println(usuario.getNome()));

    }
}

