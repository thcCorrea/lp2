
package calculadora;
public class Calculadora {

        int variavel1;
    int variavel2;

    public void soma() {
        int valor = (this.variavel1 + this.variavel2);
        System.out.println("A soma dos dois números são: " + valor);
    }

    public void subtracao() {
        int valor = (this.variavel1 - this.variavel2);
        System.out.println("A subtração dos dois números são: " + valor);
    }

    public void multiplicacao() {
        int valor = (this.variavel1 * this.variavel2);
        System.out.println("A multiplicação dos dosi números são: " + valor);
    }

    public void divisao() {
        int valor = (this.variavel1 / this.variavel2);
        System.out.println("A divisÃo dos dois nÚmeros são: " + valor);
    }

    public static void main(String[] args) {
        Calculadora um = new Calculadora();
        Calculadora dois = new Calculadora();
        Calculadora tres = new Calculadora();
        
        um.variavel1 = 69;
        um.variavel2 = 69;
        dois.variavel1 = 24;
        dois.variavel2 = 69;
        tres.variavel1 = 24;
        tres.variavel2 = 69;
        
        um.soma();
        um.subtracao();
        um.multiplicacao();
        um.divisao();
        
        dois.soma();
        dois.subtracao();
        dois.multiplicacao();
        dois.divisao();
        
        tres.soma();
        tres.subtracao();
        tres.multiplicacao();
        tres.divisao();
        
    }
}
