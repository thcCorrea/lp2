
package aluno;

public class Aluno {
    
    String nome;
    int idade;
    String numeroMatricula;
    
    public void imprimirDadosCadastrais(){
        System.out.println("Nome: " + this.nome + " - Idade: " + this.idade + " - Numero matricula: " + this.numeroMatricula);
    }
    public static void main(String[] args) {
        Aluno um = new Aluno();
        Aluno dois = new Aluno();
        Aluno tres = new Aluno();
        Aluno quatro = new Aluno();
        
        um.nome = "Thiago";
        um.idade = 18;
        um.numeroMatricula = "201318110262";
        
        dois.nome = "Megda";
        dois.idade = 19;
        dois.numeroMatricula = "201118110123";
        
        tres.nome = "Leonardo";
        tres.idade = 16;
        tres.numeroMatricula = "201318110369";
        
        quatro.nome = "Willian";
        quatro.idade = 16;
        quatro.numeroMatricula = "201318110258";
        
        um.imprimirDadosCadastrais();
        dois.imprimirDadosCadastrais();
        tres.imprimirDadosCadastrais();
        quatro.imprimirDadosCadastrais();
    }
    
}
