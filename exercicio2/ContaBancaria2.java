
package contabancaria2;


public class ContaBancaria2 {

    
        int agencia;
	int contaCorrente;
	double saldo;
	double limiteExtra;
	String titularConta;

	public void imprimirSaldo(){
		System.out.println("Saldo atual da conta é de: " + this.saldo);
	}

	public void imprimirSaldoTotal(){
		double saldoTotal = this.saldo + this.limiteExtra;
		System.out.println("Saldo total da conta é de: " + saldoTotal);
	}

	public void imprimirAgencia(){
		System.out.println("A agencia deste cliente é: " + this.agencia);
	}

	public void imprimirContaCorrente(){
		System.out.println("A conta-corrente deste cliente é: " + this.contaCorrente);
	}

	public void imprimirTitular(){
		System.out.println("O nome do titular da conta e: " + this.titularConta);
	}

	public static void main (String[] args){
		ContaBancaria2 fulano = new ContaBancaria2();
                ContaBancaria2 cicrano = new ContaBancaria2();
                
                fulano.agencia = 36969;
                fulano.contaCorrente = 6969;
                fulano.saldo = 69.24;
                fulano.limiteExtra = 80.00;
                fulano.titularConta = "Fulano";
                
                cicrano.agencia = 2424;
                cicrano.contaCorrente = 2469;
                cicrano.saldo = 24.68;
                cicrano.limiteExtra = 69.00;
                cicrano.titularConta = "Cicrano";
                
                fulano.imprimirTitular();
                fulano.imprimirAgencia();
                fulano.imprimirContaCorrente();
                fulano.imprimirSaldo();
                fulano.imprimirSaldoTotal();
                
                System.out.println("");
                
                cicrano.imprimirTitular();
                cicrano.imprimirAgencia();
                cicrano.imprimirContaCorrente();
                cicrano.imprimirSaldo();
                cicrano.imprimirSaldoTotal();
	}

}
    }
    
}
