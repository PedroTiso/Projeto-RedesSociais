package Main;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    // Construtor da classe Main.GooglePlus
    public GooglePlus(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    // Metodos que foram sobescritos da classe abstrata Main.RedeSocial
    @Override
    public void postarFoto() {
        System.out.println("A foto foi postada no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("O vídeo foi postado no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("O comentário foi publicado no GooglePlus");
    }

    // Implementando os metodos da inteerface
    @Override
    public void fazStreaming()
    {
        System.out.println("Iniciando os serviços de Streaming do Google Plus");
    }

    @Override
    public void compartilhar(){
        System.out.println("Fazendo o compartilhamneto no GooglePlus");
    }
}
