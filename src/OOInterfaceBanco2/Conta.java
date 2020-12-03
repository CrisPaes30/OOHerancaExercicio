package OOInterfaceBanco2;

public abstract class Conta implements TiposDeConta {

    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    protected static double saldoChequeEspecial;
    protected static double saldoContaCorrente;

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
    public double impostos() {

        return getSaldo() * 0.05;
    }

}