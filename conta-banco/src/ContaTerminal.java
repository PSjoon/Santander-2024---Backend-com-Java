import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
     public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Nome do Cliente"); 
        String nome = scanner.nextLine();

        System.out.println("Digite o Número da Agência"); 
        String agencia = scanner.next();

        System.out.println("Digite o Número da Conta"); 
        int numero = scanner.nextInt();
        
        System.out.println("Digite o Saldo"); 
        double saldo = scanner.nextDouble();
        

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!!", nome, agencia, numero, saldo);

        
        
        
    }
}
