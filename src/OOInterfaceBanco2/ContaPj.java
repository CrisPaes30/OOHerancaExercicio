package OOInterfaceBanco2;

public class ContaPj<contaCorrente> extends Conta implements TiposDeConta {


    public ContaPj(int numero, int agencia, String banco, double saldo) {
        super(numero, agencia, banco, saldo);
    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void setSaldo(double saldo) {

    }

    @Override
    public double impostos() {
        return this.getSaldo() * 0.07;
    }

    public void pjConta() {
        ContaCorrente pJ = new ContaCorrente(20, 3, "BancoCC", 100.00, 1000.00);
        pJ.EfetuarSaque();
        pJ.EfetuarDeposito();

    }

}
