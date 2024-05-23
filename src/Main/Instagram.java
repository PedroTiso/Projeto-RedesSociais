package Main;

public class Instagram extends RedeSocial {

    // Construtor da classe Main.Instagram
    public Instagram(String nome, int numAmigos){
        super(nome, numAmigos);
    }

    // Metodos que foram sobescritos da classe abstrata RedeSocial
    @Override
    public void postarFoto() {
        System.out.println("A foto foi postada no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("O vídeo foi postado no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("O comentário acaba de ser publicado no Instagram");
    }


}
