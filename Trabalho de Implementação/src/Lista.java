public class Lista {
    No inicio = null;
    int tamanhoDaLista = 0;

    public void inserirInicio(String texto){
        No noAtual = new No();
        noAtual.palavra = texto;
        noAtual.proximo = inicio;
        inicio = noAtual;
        tamanhoDaLista++;
    }

    public void imprimirLista(){
        String aux;
        No local = inicio;
        while(local!=null){
                aux = local.palavra;
                local = local.proximo;
                System.out.println(aux);
        }
    }


}
