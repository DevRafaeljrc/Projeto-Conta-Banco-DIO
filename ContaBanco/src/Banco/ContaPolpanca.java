package Banco;

public class ContaPolpanca {
    private String nomeCliente;
    private double saldo;
    private double taxaJurosMensal;

    public ContaPolpanca(String nomeCliente, double taxaJurosMensal) {
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
        this.taxaJurosMensal = taxaJurosMensal;
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

    public void renderJuros() {
        saldo += saldo * taxaJurosMensal / 100;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    
}
