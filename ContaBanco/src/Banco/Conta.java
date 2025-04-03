package Banco;

public class Conta {
    private String nomeTitular;
    private double saldo;
    private int numeroConta;

    public Conta(String nomeTitular, double saldo, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Removed duplicate unimplemented method 'transferir'

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                ", numeroConta=" + numeroConta +
                '}';
    }

    // Método para transferir valor para outra conta
    
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }
}
