package danimandou;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Fachada {
    public void addTermo(String termo, String traducao){
        
    }
    public void removerTermo(String termo){
        
    }
    public void traduzirArq(String src, String dest){
    }
    public void criarNovoArq(){
        try{
            
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            
            pr.println("l1 c1; l1 c2; l1 c3");
            pr.println("l2 c1; l2 c2; l2 c3");
            pr.println("l3 c1; l3 c2; l3 c3");
            
            pr.close();
            arquivo.close();
            
        } catch(Exception e){
            System.out.println("Erro ao escrever o arquivo");
        }
        
    }
    public void verDic(){
        
    }    
}
