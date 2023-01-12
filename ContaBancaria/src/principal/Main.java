package principal;

import java.util.Scanner;
import entidades.ContaPF;
import entidades.ContaPJ;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja criar uma conta Pessoa Fisica(1) ou Pessoa Juridica(2)? ");
		int resp = sc.nextInt();
		sc.nextLine();
		
		if (resp == 1) {		
		
			System.out.print("Nome do titular: ");
			String nome = sc.nextLine();
			System.out.print("Numero da Conta: ");
			int conta = sc.nextInt();
			sc.nextLine();
			System.out.print("Deposito Inicial: ");
			double deposito = sc.nextDouble();
			
			ContaPF acc = new ContaPF(nome, conta, deposito);
			System.out.println(acc);
			
			System.out.print("Digite um valor para deposito: ");
			double dep = sc.nextDouble();
			
			acc.deposito(dep);
			System.out.print("Saldo atualizado: " + acc.getSaldo());
		
		}
		else if (resp == 2) {
			System.out.print("Nome da Empresa: ");
			String nome = sc.nextLine();
			System.out.print("Numero da Conta: ");
			int conta = sc.nextInt();
			sc.nextLine();
			System.out.print("Deposito Inicial: ");
			double deposito = sc.nextDouble();
			System.out.print("Limite de emprestimo: ");
			double limEmprestimo = sc.nextDouble();
			
			ContaPJ acc1 = new ContaPJ(nome, conta, deposito, limEmprestimo);
			System.out.println(acc1);
			
			System.out.print("Digite um valor de emprestimo: ");
			double emprestimo = sc.nextDouble();
			
			acc1.emprestimo(emprestimo);
		}
		
		sc.close();
	}

}
