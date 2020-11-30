package OOHerancaBanco1;

import java.util.Scanner;

public class ContaPoupanca extends Conta {


    //private int diaAniversario;
    private final double taxaDeJuros;
    protected  double saldoContaPoupanca;
    protected  double saldoConta;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double saldoContaPoupanca, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.taxaDeJuros = taxaDeJuros;
       // this.saldoContaPoupanca = saldo;
        this.saldoConta = saldo;
        this.saldoContaCorrente = saldoContaPoupanca;
        this.saldoConta = saldoContaPoupanca;
    }


    public boolean ValorDepositoPoupanca() {


        System.out.println("Seu saldo em conta corrente "+ saldoContaCorrente);
        System.out.println("Informe o valor de investimento R$ ");


        Scanner scanner = new Scanner(System.in);
        double valorDeposito = scanner.nextInt();

        this.saldoContaCorrente = saldoContaCorrente - valorDeposito;

        if (this.saldoContaCorrente >= valorDeposito) {

            this.saldoContaPoupanca = this.saldoContaPoupanca + valorDeposito;

            System.out.println("Saldo mais taxa R$ " + this.saldoContaPoupanca);
            System.out.println( "Juros " + this.saldoContaPoupanca * taxaDeJuros);
            //System.out.println(this.saldoContaPoupanca);
            System.out.println("Transação realizada com sucesso \n "+
                    "Deseja fazer nova operaçao? Escolha 1 para (Sim) ou aperte 2) para sair: ");
            return true;
        }else{
            System.out.println("Saldo insulficiente ");
            return false;
        }
    }

    @Override
    public double getSaldo() {
        return this.saldoContaPoupanca + this.taxaDeJuros * this.saldoContaPoupanca;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
