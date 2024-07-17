package desafio_dio_banco;



public abstract class Conta implements Iconta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static  int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	protected boolean status;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.status = false;
		}	
	
	@Override
	public void abrirConta() {
		this.status = true;
		System.out.println(String.format("Conta de %s", this.cliente.getNome() + " | aberta com sucesso! "));
	}
	
	@Override
	public void fecharConta(){
	    if (this.saldo > 0 ){
	        System.out.println("Conta com dinheiro");
	    }else if(this.saldo < 0){
	        System.out.println("Conta em débto");
	    }else{ 
	        this.status = false;
	        System.out.println("Conta fechada com Sucesso!");
	    }    
	}
	
	@Override
	public void sacar(double valor) {
		if (this.status == true) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Saque realizado com sucesso!");
			}else{
				System.out.println("Saldo insuficiente! ");
			}
		}else {
			System.out.println("Saque não realizado!");
		}
	}
	
	@Override
	public void depositar(double valor) {
		if (this.status == true) {
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso!");
		}else {
			System.out.println("Depósito não realizado!");
		}
		
	}
	
	@Override
	public void transferir(double valor, Iconta destinoConta) {
		if (this.status == true) {
			this.sacar(valor);
			destinoConta.depositar(valor);
			System.out.println("Transferência realizada com sucesso!");
		}else {
			System.out.println("Transferência não relizada! ");
		}
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public boolean getStatus() {
		return status;
	}

	protected void imprimirInfonsComuns() {
		System.out.println(String.format("Status Aberto: %b", this.status));
		System.out.println(String.format("Tiular %s", this.cliente.getNome()));
		System.out.println(String.format("Agência %d", this.agencia));
		System.out.println(String.format("Número %d", this.numero));
		System.out.println(String.format("Saldo %.2f", this.saldo));
		
	}
}
