
public class Main {
	
	public static void main(String[] args) {
		
		Cliente borges = new Cliente();
		borges.setNome("Borges");
		
		Conta cc = new ContaCorrente(borges);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(borges);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
