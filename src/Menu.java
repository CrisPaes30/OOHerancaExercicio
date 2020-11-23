import java.util.Scanner;

public class Menu extends MenuPrincipal {


    protected int escolha;
    private final Scanner scanner;
    private final ContaCorrente contaCorrente;
    private final ContaSalario contaSalario;
    private  final ContaPoupanca contaPoupanca;

    public Menu(Scanner scanner, ContaCorrente cc1,
                ContaSalario cS, ContaPoupanca p1) {
        super();
        this.scanner = scanner;
        this.contaCorrente = cc1;
        this.contaSalario = cS;
        this.contaPoupanca = p1;
    }

    public void Menu() {

        boolean continua = true;
        boolean repetirTransacao = false;
        String valorDecisao = "";

        while (continua) {


            if (!repetirTransacao){
                valorDecisao = scanner.next();
            }
            switch (valorDecisao) {

                case "1": {
                    System.out.println("Você escolheu sacar: ");

                    boolean resultadoSaque = contaCorrente.EfetuarSaque();

                    if (!resultadoSaque) {
                        continua = false;
                        break;
                    }
                    break;
                }


                case "2": {

                    System.out.println("Voce escolheu depósitar: ");
                    contaCorrente.EfetuarDeposito();

                    break;
                }
                case "3": {
                    System.out.println("informe o valor para investimento: ");
                    System.out.println("Voce tem saldo em conta corrente deseja investir? " );

                    contaPoupanca.ValorDepositoPoupanca();
                    break;
                }



                case "4": {
                    System.out.println("Saque conta salario");

                    boolean resultado = contaSalario.limiteSaqueSalario();
                    if (!resultado) {
                        break;
                    }
                    break;
                }

                case "0":
                    System.exit(0);


                default :
                    continua = false;
                    System.out.println("Opção inválida!");


            }
            if(continua){
                escolha = scanner.nextInt();

                if (escolha == 2) {
                    break;
                }
                if (escolha == 1){
                    repetirTransacao = true;
                }
            }

        }
    }
}
