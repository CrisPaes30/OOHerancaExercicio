package OOInterfaceBanco2;

import java.util.Hashtable;


public class ClientesBancos extends Conta implements TiposDeConta {

    public ClientesBancos(int numero, int agencia, String banco, double saldo) {
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
    public String toString() {
        return "ClientesBancos{}";
    }

    public void clientes () {

        Hashtable <Integer, String>clientes = new Hashtable<>();

        clientes.put (contaCorrente(), "Carlos");
        clientes.put (contaCorrente(),  " Vitor");
        clientes.put(contaPj(), "Samuel");
        clientes.put(contaSalario(), "Pedro");
        clientes.put(contaPj(), "Eliana");
        clientes.put(contaSalario(), "João");
        clientes.put(contaPoupanca(), "Mateus");

    }


}
