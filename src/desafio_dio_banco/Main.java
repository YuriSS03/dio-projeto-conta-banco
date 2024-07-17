package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente yuri = new Cliente();
		Cliente sabrina = new Cliente();
		Cliente nathan = new Cliente();
		
		yuri.setNome("Yuri Soares Silva");
		sabrina.setNome("Sabrina Soares Silva");
		nathan.setNome("Nathan de Godoi Soares");
		
		
		ContaCorrente cc = new ContaCorrente(yuri);
		cc.abrirConta();
		ContaPoupanca cp = new ContaPoupanca(sabrina);
		cp.abrirConta();
		ContaCorrente cc2 = new ContaCorrente(nathan);
		cc2.abrirConta();
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cc2.imprimirExtrato();
		
		
		
	}

}
