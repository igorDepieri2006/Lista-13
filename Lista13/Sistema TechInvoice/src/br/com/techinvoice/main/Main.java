package br.com.techinvoice.main;

import br.com.techinvoice.model.DocumentoFactory;
import br.com.techinvoice.model.GerenciadorConfiguração;
import br.com.techinvoice.model.IDocumento;

public class Main {
    public static void main(String[] args){
        System.out.println("==| Padrão Singleton |==");

        // captura a primeira instacia
        GerenciadorConfiguração gen1 = GerenciadorConfiguração.getIntance();
        System.out.println("API Key: " + gen1.getApikey());

        // captura a segunda instacia e compara os enderecos de memoria 
        GerenciadorConfiguração gen2 = GerenciadorConfiguração.getIntance();

        if(gen1 == gen2){
            System.out.println("Prova Qua Ambas apontam para o mesmo endereço de memoria");
        }else{
            System.out.println("Instacias Diferentes Foram Criadas");
        }
        System.out.println("\n===| Padrão Factory |===");

        // usa o docFactory para criar uma NF
        IDocumento docNF = DocumentoFactory.criarDocumento("NF");
        docNF.gerarPDF();

        // try-cath para tipo inválido do BOLETO
        try {
            System.out.println("\nTentando criar um documento do tipo <|BOLETO|>...");
            IDocumento docBoleto = DocumentoFactory.criarDocumento("\nBOLETO");
            docBoleto.gerarPDF();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado com sucesso: " + e.getMessage());
        }
    }
}
