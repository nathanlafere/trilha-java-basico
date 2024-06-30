import java.math.BigDecimal;
import java.util.Scanner;
// Importando a classe Scanner e BigDecimal


public class Alternativa {
    public static void main(String[] args) throws Exception {
        // Iniciando a classe Scanner
        Scanner ler = new Scanner(System.in);
        try {
            // Exibindo as mensagens solicitando as informações da conta para o nosso usuário
            System.out.println("Por favor, digite o número da sua conta!");
            int numeroConta = ler.nextInt();
            ler.nextLine();
            System.out.println("Por favor, digite o código de sua agência!");
            String agencia = ler.nextLine();
            System.out.println("Por favor, digite seu nome!");
            String nomeCliente = ler.nextLine();
            System.out.println("Por favor, digite seu saldo!");
            BigDecimal saldo = ler.nextBigDecimal();

            // Exibindo mensagem com as informações do usuário
            System.out.println(String.format("Olá, %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo de R$ %s já está disponível para saque!",nomeCliente,agencia,numeroConta,saldo));

            //Captando entradas inválidas
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida, por favor digite somente o solicitado!");
            ler.nextLine();
        } finally {
            ler.close();
        }
    }
}
