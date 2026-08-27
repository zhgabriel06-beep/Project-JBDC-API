package Spring.Booot.Study.JBDC.connection;

import lombok.Getter;
import lombok.Setter;


import java.sql.Connection;
@Getter
@Setter
public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private String data_nascimento;


    public Usuario(String nome, String email, int idade, String data_nascimento) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.data_nascimento = data_nascimento;
    }
}


