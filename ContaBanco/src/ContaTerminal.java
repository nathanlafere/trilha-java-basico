import java.math.BigDecimal;
import java.util.Scanner;
// Importando a classe Scanner e BigDecimal


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String Agencia, nomeCliente;
        BigDecimal Saldo;

        // Iniciando a classe Scanner
        Scanner ler = new Scanner(System.in);
        // Exibindo as mensagens solicitando as informações da conta para o nosso usuário 
        numeroConta = Integer.parseInt(solicitarValores("Por favor, digite o número da sua conta!", ler, "Integer"));
        Agencia = solicitarValores("Por favor, digite o código de sua agência!", ler, "String");
        nomeCliente = solicitarValores("Por favor, digite seu nome!", ler, "String");
        nomeCliente = nomeCliente.substring(0, 1).toUpperCase() + nomeCliente.substring(1);
        Saldo = new BigDecimal(solicitarValores("Por favor, digite seu saldo!", ler, "Decimal"));
        ler.close();
        // Exibindo mensagem com as informações do usuário
        System.out.println(String.format("Olá, %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo de R$ %s já está disponível para saque!",nomeCliente,Agencia,numeroConta,Saldo));
    }

    private static String solicitarValores (String textoSolicitacao,Scanner ler,String tipoScanner) {
        do {
            try {
                System.out.println(textoSolicitacao);
                System.out.print(" -> ");
                switch (tipoScanner) {
                    case "Integer":
                        String valorInteger = Integer.toString(ler.nextInt());
                        ler.nextLine();
                        return valorInteger;
                    case "String":
                        String valorString = ler.nextLine();
                        return valorString;
                    case "Decimal":
                        String valorShort = ler.nextBigDecimal().toString();
                        return valorShort;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite somente o solicitado!");
                ler.nextLine();
            }
        } while (true);
    }
}
