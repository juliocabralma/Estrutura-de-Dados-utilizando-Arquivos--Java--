public class SelectSort {


    public int[] ordenar(int[] vetor){
        for(int i=0; i<100; i++){
            int menor = i;
            for(int j=i+1; j<100; j++){
                if(vetor[j]<vetor[menor]){
                    menor = j;
                }
            }
            trocar(vetor, i, menor);
        }
       return vetor;
    }

    public void trocar(int[] vetor, int i, int menor){
        int aux = vetor[i];
        vetor[i] = vetor[menor];
        vetor[menor] = aux;
    }
    
}
