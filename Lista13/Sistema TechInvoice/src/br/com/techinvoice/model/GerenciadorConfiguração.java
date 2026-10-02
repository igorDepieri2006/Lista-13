package br.com.techinvoice.model;

public class GerenciadorConfiguração {

    // solicitado na lista exercicio 1
    private String apikey = "AWS-12345-KEY";

    // ex 2 passo 1 privado para armazenar a unica instacia
    private static GerenciadorConfiguração instacia;

    // ex 1 construtor privado para impedir o new fora da classe
    private GerenciadorConfiguração(){

    }

    //ex 2 metodo de acesso global com lazy Initialization
    public static GerenciadorConfiguração getIntance(){

        // se a instacia ainda n foi criada, faz o new internamente
        if(instacia == null){
            instacia = new GerenciadorConfiguração();
        }
        // retorna sempre a mesma instacia armazenada
        return instacia;
    }

    public String getApikey(){
        return apikey;
    }
}
