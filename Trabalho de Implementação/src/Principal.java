

public class Principal {
    public static void main(String[] args) throws Exception {
       //Gerando vetor de String e vetor de ocorrência das palavras chaves nos Tweets
       Tweets tt = new Tweets();
       String[]palavras = new String[100];
       int[]ocorrencias = new int[100];
       int[]ordenado = new int[100];
       String[]palavrasOrd = new String[100];

       palavras = tt.preenchePalavrasChaves(palavras);
       ocorrencias = tt.calcularOcorrencias(palavras, ocorrencias);

        System.out.println();
        System.out.println();
        System.out.println("Imprimindo Palavras Chaves e o número de Ocorrências:");
        System.out.println();
        System.out.println();
        for(int i=0; i<100; i++){
            System.out.println("Palavra Chave: '" + palavras[i] + "', número de Ocorrências: " + ocorrencias[i]);
        }

        //Gerando Hashing com String que contém Palavras chaves e número de Ocorrências
        Hashing has = new Hashing();
        String[] palavrasHash = new String[100]; 
       // has.palavrasLocal = palavras;
        //has.numOcorr = ocorrencias;

        palavrasHash = has.InserirHash(palavras, ocorrencias);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Inserindo Hashing e imprimindo");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //Imprimindo Hash
        for(int i=0; i<100; i++){
            System.out.println("Palavra Chave e número de ocorrências: " + palavrasHash[i]);
        }
        

        //Lista Simplesmente Encadeada
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Inserindo na Lista e imprimindo");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        Lista l = new Lista();
        System.out.println(l);

        for(int i=0; i<100; i++){
            l.inserirInicio(palavras[i] + ", " + ocorrencias[i]);
        }
     /**   System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(l);*/
       
        //System.out.println(l);

        l.imprimirLista();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

       // SelectSort ord = new SelectSort();
        //ordenado = ord.ordenar(ocorrencias);
        //Imprimindo Lista de Ocorrências de forma Ordenada crescente
        System.out.println("Lista de Ocorrências ordenada de forma crescente:");
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();

        SelectSort ord = new SelectSort();

        ordenado = ord.ordenar(ocorrencias);

        for(int i=0; i<100; i++){
            System.out.println(ordenado[i]);
        }
    }
}

