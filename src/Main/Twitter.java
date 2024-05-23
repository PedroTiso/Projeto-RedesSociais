package Main;

public class Twitter extends RedeSocial implements Compartilhamento{

    // Construtor da classe Main.Twitter
    public Twitter(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    // Metodos que foram sobescritos da classe abstrata RedeSocial
    @Override
    public void postarFoto()
    {
        System.out.println("A foto foi postada no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("O video foi postado no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("O comentário foi publicado no Twitter");
    }

    // Implementando os metodos da Interface
    @Override
    public void compartilhar(){
        System.out.println("Fazendo o compartilhamento no Twitter");
    }
}
