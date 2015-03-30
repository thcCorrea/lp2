package verificadorcpf;

import java.util.Scanner;

public class VerificadorCPF {

   
    public static void main(String[] args) {
        String cpf;
        int cpfvet[] = new int[11];
        int i, j;
        int a=0, b=0; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Os 9 primeiros dígitos do CPF: ");
        cpf = input.next();
        
        while (cpf.length() != 9){
            System.out.print("São 9 dígitos: ");
            cpf = input.next();
        }
        
        //convertendo para vetor
        for (i=0; i<9; i++){
            cpfvet[i] = Character.getNumericValue(cpf.charAt(i));
        }
        
        //fazendo os calculos
        for (i=8, j=2; i>=0; i--, j++){
            a += j * cpfvet[i];
        }
        if((a % 11) < 2){
            a = 0;
        } else {
            a = 11 - (a % 11);
        }
        cpfvet[9] = a;
                
        for(i=9, j=2; i>=0; i--, j++){
            b += j * cpfvet[i];
        }
        if ((b% 11)<2){
            b = 0;
        } else {
            b = 11 - (b % 11);
        }
         cpfvet[10] = b;   
         
    //Imprimindo o cpf
    
    System.out.print("CPF completo: ");
    System.out.print("CPF: ");
        for(i=0; i<11; i++){
            System.out.print(cpfvet[i]);
        }
        System.out.println("");
    }
       
}
