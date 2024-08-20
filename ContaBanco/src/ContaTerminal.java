import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		String cliente;
		String agencia;
		int num;
		float saldo;
		
		System.out.println("Insira seu nome: ");
		cliente = tec.nextLine();
		
		System.out.println("Olá " + cliente + " Por Favor, digite o número da Agência: ");
		agencia = tec.nextLine();
		
		System.out.println("Insira o número de Usuário: ");
		num = tec.nextInt();
		
		System.out.println("Saldo Atual: ");
		saldo = tec.nextFloat();
		
		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco,"
				+ "sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + 
				" já está disponível para saque.");
		
		tec.close();
		
	}

}
