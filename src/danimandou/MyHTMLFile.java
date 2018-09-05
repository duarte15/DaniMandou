package danimandou;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyHTMLFile extends MyFile {

    @Override
    public String converter(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o endereço do arquivo com extensão 'HTML'");
        String caminho = sc.nextLine();
        setSrcAddress(caminho);
        
        try{
        FileInputStream arquivo = new FileInputStream(getSrcAddress());
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader br = new BufferedReader(input);
        
        String linha;
        int l=1;
        do {
            linha = br.readLine();
            if (linha != null){
                //System.out.println("Linha "+l+ ": "+linha);
                //l+=1;
                System.out.println(linha);
                
            }
        }while(linha != null);

    } catch(Exception e){
        System.out.println("Erro ao ler o arquivo. Reinicie a aplicação!");
    }   return null;
}
   
}
