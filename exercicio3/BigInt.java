import java.util.Scanner;

public class BigInt {


    public static void main(String[] args) {
        String n1;
        String n2;
        int i, j, k;
        int n11[] = new int[30];
        int n22[] = new int[30];
        int resul[] = new int[30];
        int vai = 0;
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("N1: ");
        n1 = input.next();
       
        System.out.print("N2: ");
        n2 = input.next();

        //convertendo para vetores
        for (i = 0; i < n1.length(); i++) {
            char caracter = n1.charAt(i);
            n11[i] = Character.getNumericValue(caracter);
        }
        for (i = 0; i < n2.length(); i++) {
            char caracter = n2.charAt(i);
            n22[i] = Character.getNumericValue(caracter);
        }
        
        //somando

        for(i=0; i<=29; i++){
            resul[i] = -1;
        }
        for (i = 29; i >= 0; i--) {
            resul[i] = (n11[i] + n22[i]);
            if (resul[i] > 9) {
                resul[i - 1] = (resul[i] + 1);
                resul[i] -= 10;
            }
        }
        
        //imprimindo soma
        System.out.print("Soma: ");
        for (k = 0; k < 29; k++){
            if (resul[k]>0)
            System.out.print(resul[k]);
        }
        System.out.println(" ");

        //multiplicando
        for(i=0; i<=29; i++){
            resul[i] = -1;
        }
        for (i = 29; i >= 0; i--) {
            resul[i] = (n11[i] * n22[i]);
            if (resul[i] > 9) {
                resul[i - 1] = (resul[i] + 1);
                resul[i] -= 10;
            }
        }

        //imprimindo multiplicação
        System.out.print("Multiplicação: ");
        for (k = 0; k < 29; k++){
            if (resul[k]>0)
            System.out.print(resul[k]);
               
        }

    }

}
    

