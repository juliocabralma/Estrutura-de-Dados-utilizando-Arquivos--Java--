public class Hashing {
    String[]palavrasNormal = new String[100];
    int[] numOcorr = new int[100];
   // Tweets aux = new Tweets();


    public String[] InserirHash(String[] txt, int[]num){
        this.palavrasNormal = txt;
        this.numOcorr = num;      
        int[] ocupado = new int[100];  
        String[]palavrasHash = new String[100];

        for(int i=0; i<100; i++){
            ocupado[i] = 0;
        }
        int limiteVetor;
        int pos=0;
        int i=0;
        while(i<100){
            pos = (this.numOcorr[i]%100);
            limiteVetor = 0;
            if(pos>99){
                pos = 0;
            }
            if(ocupado[pos]==0){
                ocupado[pos] = 1;
                palavrasHash[pos] = this.palavrasNormal[i] + ", " +  num[i];
                //System.out.println(palavrasHash[pos];
            }
            else{
                while(ocupado[pos]!=0 && limiteVetor<100){
                    pos++;    
                    limiteVetor++; 
                }
                if(ocupado[pos]==0){
                    palavrasHash[pos] = this.palavrasNormal[i] + ", " +  num[i];
                    ocupado[pos] = 1;
                }        
            }
            i++;            
        }
        return palavrasHash;
    }
}