package OOInterfaceBanco2;

import java.util.Hashtable;


public class ClientesBancos extends Conta  implements TiposDeConta {


      public ClientesBancos(int numero, int agencia, String banco, double saldo) {
        super(numero, agencia, banco, saldo);
    }

    public void Clientes() {

        Hashtable<Integer, String> clientes = new Hashtable<>();

        clientes.put(21, "Carlos");
        clientes.put(50, " Vitor");
        clientes.put(39, "Samuel");
        clientes.put(15, "Pedro");
        clientes.put(26, "Eliana");
        clientes.put(68, "João");
        clientes.put(27, "Mateus");


    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void setSaldo(double saldo) {

    }


}
