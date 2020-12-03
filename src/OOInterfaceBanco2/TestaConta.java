package OOInterfaceBanco2;

import java.util.Scanner;

public class TestaConta {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente(22,1,"banco CC", 100.00, 1000.00);
        System.out.println(cc1);

        System.out.println("O saldo da OOHerancaBanco1.Conta corrente é R$"+ cc1.getSaldo());

        ContaPoupanca p1 = new ContaPoupanca(33,3,"banco CCC,",0.00,100.00,0.05);
        System.out.println("O saldo da OOHerancaBanco1.Conta Poupança é R$"+ p1.getSaldo());


        ContaSalario cS = new ContaSalario(22,1,"Banco CC",100.00,1000.00);
        System.out.println("Saldo OOHerancaBanco1.Conta Salario"+ cS);


        MenuPrincipal menuPrincipal = new MenuPrincipal();

        Menu menu = new Menu(scanner, cc1,cS, p1);

        do {
            menuPrincipal.imprimeMenu();
            menu.Menu();
        } while (true);

    }

}