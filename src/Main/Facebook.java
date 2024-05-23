package Main;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    // Construtor da classe Main.Facebook
    public Facebook(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    // Metodos que foram sobrescritos da classe abstrata Main.RedeSocial
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("O comentário foi postado no Facebook");
    }

    // Implementando os métodos da interface
    @Override
    public void fazStreaming(){
        System.out.println("Iniciando os serviços de Streaming do Facebbok");
    }

    @Override
    public void compartilhar(){
        System.out.println("Fazendo o compartilhamento no Facebook");
    }

}
