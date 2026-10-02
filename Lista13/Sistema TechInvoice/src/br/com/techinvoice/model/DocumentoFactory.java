package br.com.techinvoice.model;

public class DocumentoFactory {
    public static IDocumento criarDocumento(String tipo){
        if(tipo == null){
            // impedir ja sua execução
            throw new IllegalArgumentException("Tipo de documento inválido: o tipo não pode ser nulo.");
        }
        // logica de criação baseada no parâmetro
        if(tipo.equalsIgnoreCase("NF")){
            return new NotaFiscal();
        }else if(tipo.equalsIgnoreCase("RECIBO")){
            return new Recibo();
        }else {
            throw new IllegalArgumentException("Tipo de Documento Inválido" + tipo);
        }
    }
}
