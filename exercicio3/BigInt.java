

package bigint;

import java.util.Scanner;

public class BigInt {


    public static void main(String[] args) {
        String num11;
        String num22;
        int num1[] = new int[30];
        int num2[] = new int[30];
        int i, j;
        int soma=0, mult=0; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1º Número: ");
        num11= input.next();
        
        System.out.print("2º Número: ");
        num22= input.next();
        
        //convertendo para vetor
        for (i=0; i<9; i++){
            num1[i] = Character.getNumericValue(num11.charAt(i));
        }
        for (i=0; i<9; i++){
            num2[i] = Character.getNumericValue(num22.charAt(i));
        }
        
        //fazendo os calculos
        
   
    }
    
}
