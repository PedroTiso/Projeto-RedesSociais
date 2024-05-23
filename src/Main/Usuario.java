package Main;

import Exceptions.QuantidadeDeRedesSociais;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Usuario {

    // Atributos da classe Main.Usuario
    private String nome;
    private String email;
    private Set<RedeSocial> redeSociais;

    // Construtor da classe Main.Usuario
    public Usuario(String nome, String email, Set< RedeSocial> redesSociais) {
        this.nome = nome;
        this.redeSociais = redesSociais;
        this.email = email;
    }

    // Método que mostrará as informções
    public void mostraInfo() throws QuantidadeDeRedesSociais {

        if(redeSociais.size() < 2) {
            throw new QuantidadeDeRedesSociais("É necessário ao menos duas redes sociais para a criação do usuário");
        }
        System.out.println("O nome do usuario é: " + nome);
        System.out.println("O email do usuário é: " + email);
    }
}
