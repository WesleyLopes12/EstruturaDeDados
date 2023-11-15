
package EstruturaDeDados;

import java.util.Scanner;

public class VetorLinear {
    
    public static void main(String[] args) {
        
        String[] estados = new String[10];
        estados[0] =  "AC";
        estados[1] =  "BA";
        estados[2] =  "CE";
        estados[3] =  "DF";
        estados[4] =  "AM";
        estados[5] =  "AP";
        estados[6] =  "PB";
        estados[7] =  "RN";
        estados[8] =  "MS";
        estados[9] =  "SP";
        
        for (int i = 0; i < estados.length; i++){
            System.out.println("Estado" + i + ":" + estados[i]);
        }
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado Voce que buscar?");
        String siglaBusca = leitor.nextLine();
        
        //Busca linear
         boolean encotrou = false;
         for (int i = 0; i < estados.length; i++){
             String elemento = estados[i];
             if (elemento.equals(siglaBusca)){
                 encotrou = true;
                 break;
         
         }
                     
    }
       if (encotrou == true)  {
           System.out.println("Encotrou");
       }else{
            System.out.println(" Nao Encotrou");
       }
           
    }
}
