
package cursoestruturadedados;

public class Vetor {
    
    public static void main(String[] args) {
        
        int[] vertozao = new int[10];
        vertozao[0] = 3;
        vertozao[1] = 4;
        vertozao[2] = 8;
        vertozao[3] = 13;
        vertozao[4] = 51;
        vertozao[5] = 22;
        vertozao[6] = 33;
        System.out.println("Imprimindo...");
        System.out.println(vertozao [0]);
        System.out.println(vertozao [1]);
        System.out.println(vertozao [2]);
        System.out.println(vertozao [3]);
        System.out.println(vertozao [8]);
        
        for (int i = 0; i < vertozao.length; i++){ // i ++ e igual a i +1
           System.out.println(vertozao[i]);
            
        }
        
        System.out.println("Vamos que Vamos");
        
    }
        
  
}
