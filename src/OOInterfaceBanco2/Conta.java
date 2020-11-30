package OOInterfaceBanco2;

public abstract class Conta implements TiposDeConta {

    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    protected double saldoChequeEspecial;
    protected double saldoContaCorrente;

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getSaldo();

    public abstract void setSaldo(double saldo);

    @Override
    public int contaCorrente() {
        this.saldoChequeEspecial = this.saldoChequeEspecial;
        this.saldoContaCorrente = this.saldoContaCorrente;
        this.saldo = saldo;

        return 0;
    }

    @Override
    public int contaSalario() {
        this.saldo = saldo;
        return 0;
    }

    @Override
    public double impostos() {
        double cestaConta = 10.00;
        double impostoTransferencia = 0.02;
        double impostoLimite = 10.00;

        return 0;
    }

    @Override
    public int contaPj() {
        this.saldoContaCorrente = saldoContaCorrente;
        this.saldoChequeEspecial = this.saldoChequeEspecial;
        this.saldo = saldo;

        return 0;
    }

    @Override
    public int contaPoupanca() {
       this.saldoContaCorrente= saldoContaCorrente;
       this.saldo = saldo;

        return 0;
    }
}
