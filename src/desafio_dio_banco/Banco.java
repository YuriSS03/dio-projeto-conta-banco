package desafio_dio_banco;

import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contasList;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContasList() {
		return contasList;
	}

	public void setContasList(List<Conta> contasList) {
		this.contasList = contasList;
	}
	
	
	
}
