import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lendo {
    private static String linha;
    public static void main(String[] args) throws Exception {
        File baseDeDados = new File("C:\\Users\\Cabral\\Desktop\\Base de Dados1.JSON");
        Scanner sc=null;
        File tweets = new File("C:\\Users\\Cabral\\Desktop\\Tweets.txt");
        FileWriter saida = new FileWriter(tweets);
        BufferedWriter escrever = new BufferedWriter(saida);
        try {
            sc = new Scanner(baseDeDados);
            while(sc.hasNextLine()){
                linha = sc.nextLine();
                if(linha.indexOf("'text':")!=-1){
                    //System.out.println(linha);   
                    escrever.write(linha); 
                    escrever.write("\n");
                }
            }
        } catch (IOException erro) {
            //TODO: handle exception
            System.out.println(erro.getMessage());
        }
        finally{
            if(sc!=null){
                sc.close();
            }
            if(saida!=null){
                escrever.close();
                saida.close();
            }
        }
    }
}
