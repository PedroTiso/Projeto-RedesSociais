package Main;

import Exceptions.NumeroDeAmigosNegativos;

public abstract class RedeSocial {

    // Atributos da classe Main.RedeSocial

    protected String senha;
    protected int numAmigos;

    // Construtor da classe Main.RedeSocial
    public RedeSocial(String senha, int numAmigos){
        this.senha = senha;
        if(numAmigos < 0){
            throw new NumeroDeAmigosNegativos("Não é possível ter um número de amigos negativo");
        }
        this.numAmigos = numAmigos;
    }

    // Metodos abstratos da classe Main.RedeSocial
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    // Metodo curtirPublicacao
    public void curtirPublicacao(){
        System.out.println("Você deu um like");
    }



}
