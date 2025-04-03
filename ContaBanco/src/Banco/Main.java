package Banco;

public class Main {
    public static void main(String[] args) {
        // Criação de contas
        Conta conta1 = new Conta("12345", 1000.0, 0);
        Conta conta2 = new Conta("67890", 500.0, 0);

        // Exibição de informações das contas
        System.out.println("Conta 1: " + conta1.getNumeroConta() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Conta 2: " + conta2.getNumeroConta() + ", Saldo: " + conta2.getSaldo());

        // Realizando operações
        conta1.depositar(200.0);
        conta2.sacar(100.0);

        // Exibição de informações atualizadas
        System.out.println("Após operações:");
        System.out.println("Conta 1: " + conta1.getNumeroConta() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Conta 2: " + conta2.getNumeroConta() + ", Saldo: " + conta2.getSaldo());

        // Transferência entre contas
        conta1.transferir(300.0, conta2);
        System.out.println("Após transferência:");
        System.out.println("Conta 1: " + conta1.getNumeroConta() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Conta 2: " + conta2.getNumeroConta() + ", Saldo: " + conta2.getSaldo());

        // Tentativa de saque inválido
        conta2.sacar(1000.0); // Valor maior que o saldo
        System.out.println("Após tentativa de saque inválido:");
        System.out.println("Conta 2: " + conta2.getNumeroConta() + ", Saldo: " + conta2.getSaldo());

        // Tentativa de depósito inválido
        conta1.depositar(-50.0); // Valor negativo
        System.out.println("Após tentativa de depósito inválido:");
        System.out.println("Conta 1: " + conta1.getNumeroConta() + ", Saldo: " + conta1.getSaldo());

        // Tentativa de transferência inválida
        conta1.transferir(2000.0, conta2); // Valor maior que o saldo
        System.out.println("Após tentativa de transferência inválida:");
        System.out.println("Conta 1: " + conta1.getNumeroConta() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Conta 2: " + conta2.getNumeroConta() + ", Saldo: " + conta2.getSaldo());

        // Tentativa de transferência para a mesma conta
        conta1.transferir(100.0, conta1); // Transferência para a mesma conta
        System.out.println("Após tentativa de transferência para a mesma conta:");
        System.out.println("Conta 1: " + conta1.getNumeroConta() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Conta 2: " + conta2.getNumeroConta() + ", Saldo: " + conta2.getSaldo());

        // nome do titular
        System.out.println("Nome do titular da conta 1: " + conta1.getNomeTitular());   
        System.out.println("Nome do titular da conta 2: " + conta2.getNomeTitular());
       
        // número da conta
        System.out.println("Número da conta 1: " + conta1.getNumeroConta());
        System.out.println("Número da conta 2: " + conta2.getNumeroConta());

        // saldo da conta
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());   
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());

        
    }
    
}
