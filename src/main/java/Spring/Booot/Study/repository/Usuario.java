package Spring.Booot.Study.repository;

import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;

@Getter
@Setter

public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private String data_nascimento;

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Usuario(String nome, String email, int idade, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.data_nascimento = dataNascimento;
    }

    public void exibirListaUsuarios() {
        listaUsuarios.forEach(usuario -> System.out.println(usuario.getNome()));
    }



}


