# Desafio DIO Banco

Este projeto é uma simulação de um sistema bancário básico desenvolvido em Java, como parte de um desafio proposto pela Digital Innovation One (DIO). O sistema implementa funcionalidades básicas de contas correntes e poupança, incluindo abertura e fechamento de contas, saques, depósitos, transferências e impressão de extratos.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos principais:

- **Cliente.java**: Classe que representa um cliente do banco, contendo informações básicas como nome.
- **Banco.java**: Classe que representa o banco, contendo uma lista de contas e métodos para acessar e modificar essas informações.
- **Conta.java**: Classe abstrata que define a estrutura básica de uma conta bancária e implementa a interface IConta.
- **ContaCorrente.java**: Classe que estende a classe Conta, representando uma conta corrente e implementando a impressão de extrato específico.
- **ContaPoupanca.java**: Classe que estende a classe Conta, representando uma conta poupança e implementando a impressão de extrato específico.
- **IConta.java**: Interface que define os métodos básicos que uma conta deve implementar, como sacar, depositar, transferir, abrir e fechar conta, e imprimir extrato.
- **Main.java**: Classe principal que contém o método `main`, onde são criados objetos das classes Cliente, ContaCorrente, e ContaPoupanca, e são realizadas operações básicas como abertura de contas e impressão de extratos.

## Funcionalidades

1. **Abertura de Conta**: Permite abrir contas correntes e poupança para clientes.
2. **Fechamento de Conta**: Permite fechar contas desde que não tenham saldo positivo ou negativo.
3. **Saque**: Permite realizar saques, verificando se a conta possui saldo suficiente.
4. **Depósito**: Permite realizar depósitos em contas.
5. **Transferência**: Permite transferir valores entre contas.
6. **Impressão de Extrato**: Permite imprimir extratos contendo informações da conta, como status, titular, agência, número e saldo.

## Exemplo de Uso

```java
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
