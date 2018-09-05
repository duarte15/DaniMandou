package danimandou;

import java.util.Scanner;

public class DaniMandou {
    public static void main(String[] args) {
        MyTxtFile txt = new MyTxtFile();
        MyHTMLFile ht = new MyHTMLFile();
        Fachada f = new Fachada();
        System.out.println("Informe o tipo de arquivo que você deseja importar: \n 1- Arquivo com extensão txt;\n 2- Arquivo com extensão html;\n 3- Arquivo com extensão PDF;");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        System.out.println("Informe o endereço do arquivo: ");
        if(opcao==1){
            f.criarNovoArq();
            txt.converter();
        }
        else if(opcao==2){
            ht.converter();
        }
        else if(opcao==3){
            //pd.read();
        }
        else{
            System.out.println("Opção inválida. Reinicie o programa!");
        }
    }
}
