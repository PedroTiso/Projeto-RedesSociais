package Main;

import Exceptions.NumeroDeAmigosNegativos;
import Exceptions.QuantidadeDeRedesSociais;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Facebook facebook;
        GooglePlus googlePlus;
        Set<RedeSocial> redeSociais = new HashSet<>();
        try{
            facebook = new Facebook("12345", -30);
            googlePlus = new GooglePlus("ar
            redeSociais.add(facebook);
            redeSociais.add(googlePlus);

            facebook.postarFoto();
            facebook.postarVideo();
            facebook.postarComentario();
            System.out.println();

            googlePlus.fazStreaming();
            googlePlus.compartilhar();
            googlePlus.curtirPublicacao();

        } catch (NumeroDeAmigosNegativos e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        Usuario usuario = new Usuario("Pauinho", "paulinholindosex@gmail.com", redeSociais);

        try {
            usuario.mostraInfo();
        } catch (QuantidadeDeRedesSociais e) {
            System.out.println(e.getMessage());
        }

    }
}