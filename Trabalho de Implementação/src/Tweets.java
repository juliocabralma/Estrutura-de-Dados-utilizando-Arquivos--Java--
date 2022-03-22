import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Tweets {
        String palavrasChaves[] = new String[100]; 
        int numOcorrencias[] = new int[100];
        
        
         //texto com as palavras chaves.
         // vetor com o número de ocorrências das palavras chaves.
        //Botando as palavras chaves no vetor de string;
        public String[] preenchePalavrasChaves(String[] txt){
            txt = palavrasChaves;
            txt[0] = "Tom";
            txt[1] = "Veiga";
            txt[2] = "Louro";
            txt[3] = "José";
            txt[4] = "Saudade";
            txt[5] = "MaisVocê";
            txt[6] = "Intérprete";
            txt[7] = "Homenagem";
            txt[8] = "RIPLouroJosé";
            txt[9] = "RIPTomVeiga";
            txt[10] = "Triste";
            txt[11] = "Ana";
            txt[12] = "Maria";
            txt[13] = "Braga";
            txt[14] = "Surreal";
            txt[15] = "Força";
            txt[16] = "Metalinguagem";
            txt[17] = "Morte";
            txt[18] = "Deus";
            txt[19] = "Família";
            txt[20] = "Legado";
            txt[21] = "Filho";
            txt[22] = "Dia";
            txt[23] = "Zoeira";
            txt[24] = "Pai";
            txt[25] = "Asas";
            txt[26] = "Ave";
            txt[27] = "Notícia";
            txt[28] = "Chorar";
            txt[29] = "Vídeo";
            txt[30] = "Televisão";
            txt[31] = "Brasileira";
            txt[32] = "Infantilização";
            txt[33] = "Irresistível";
            txt[34] = "Despedida";
            txt[35] = "Querido";
            txt[36] = "Lamentável";
            txt[37] = "Bancada";
            txt[38] = "Real";
            txt[39] = "2020";
            txt[40] = "Nossos";
            txt[41] = "Corações";
            txt[42] = "Rio";
            txt[43] = "Criações";
            txt[44] = "História";
            txt[45] = "AVC";
            txt[46] = "Sorvete";
            txt[47] = "Redes";
            txt[48] = "Amigo";
            txt[49] = "Novembro";
            txt[50] = "Compilado";
            txt[51] = "Verdade";
            txt[52] = "Gente";
            txt[53] = "Estivesse";
            txt[54] = "Fã";
            txt[55] = "Assistiu";
            txt[56] = "Programa";
            txt[57] = "Conceito";
            txt[58] = "Descanse";
            txt[59] = "Paz";
            txt[60] = "Fio";
            txt[61] = "Globo";
            txt[62] = "Caos";
            txt[63] = "Fantoche";
            txt[64] = "Transformar";
            txt[65] = "Narrador";
            txt[66] = "Photoshopar";
            txt[67] = "Mágica";
            txt[68] = "Cumplicidade";
            txt[69] = "Personalidade";
            txt[70] = "Cosplay";
            txt[71] = "Manhã";
            txt[72] = "Favorito";
            txt[73] = "Felicidade";
            txt[74] = "Chato";
            txt[75] = "Momentos";
            txt[76] = "Emociona";
            txt[77] = "Imaginaria";
            txt[78] = "Único";
            txt[79] = "Preferido";
            txt[80] = "Faces";
            txt[81] = "Bem";
            txt[82] = "Eterno";
            txt[83] = "Acredito";
            txt[84] = "Domingo";
            txt[85] = "Divertiram";
            txt[86] = "Encontro";
            txt[87] = "Lágrima";
            txt[88] = "Difícil";
            txt[89] = "Pássaro";
            txt[90] = "Papagaio";
            txt[91] = "Respeito";
            txt[92] = "Sofrer";
            txt[93] = "Afeto";
            txt[94] = "Infância";
            txt[95] = "Ano";
            txt[96] = "Corinthiano";
            txt[97] = "Esquecido";
            txt[98] = "Especial";
            txt[99] = "Emoção";

            return txt;
        }

            //Zerando todas as posições do vetor de ocorrências.
        /**    for(int i=0; i<100; i++){
                numOcorrencias[i] = 0;
            }*/

            public int[] calcularOcorrencias(String[]txt, int[] num){
                String linha, aux;
                txt = palavrasChaves;
                num = numOcorrencias;
                //String[] retornoSplit;
                File tweets = new File("C:\\Users\\Cabral\\Desktop\\Tweets.txt");
                Scanner sc=null;
                int i=0;
                int j=0;
                int numeroElementos=0;
                try {
                    sc = new Scanner(tweets);
                    while(sc.hasNextLine()){
                        linha = sc.nextLine();
                        linha = linha.toLowerCase(Locale.US);
                        String []retornoSplit = linha.split(" ");
                        numeroElementos = retornoSplit.length;
                        i=0;
                        while(i<numeroElementos){
                            j=0;
                            while(j<100){
                                aux = txt[j];
                                aux = aux.toLowerCase(Locale.US);
                                if(retornoSplit[i].indexOf(aux)!=-1){
                                    num[j]++;
                                }
                            j++;
                            }
                            i++;
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
                }
                return num;
            }
}
