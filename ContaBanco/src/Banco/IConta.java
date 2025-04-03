package Banco;

public class IConta {
    private String nome;
    private double saldo;
    private double limite;
    private int numeroConta;
    private String tipoConta;

    public IConta(String nome, double saldo, double limite, int numeroConta, String tipoConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void transferir(IConta contaDestino, double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Valor inválido para transferência.");
        }
    }

    @Override
    public String toString() {
        return "IConta{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", numeroConta=" + numeroConta +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta:");
        System.out.println("Nome: " + nome);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }

    public void imprimirDados() {
        System.out.println("Dados da conta:");
        System.out.println("Nome: " + nome);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }

    public void imprimirDadosSimples() {
        System.out.println("Nome: " + nome);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Tipo de conta: " + tipoConta);
    }

    public void imprimirDadosSimplesComSaldo() {
        System.out.println("Nome: " + nome);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
    }

    

    
}
