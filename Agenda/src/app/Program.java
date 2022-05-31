package app;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda e1 = new Agenda();
		int op;
		do {
			System.out.println("Escolha a opção desejada:\n1-Armazenar pessoa\n2-Remover pessoa\n3-Buscar pessoa\n"
					+ "4-Consultar agenda completa\n5-Consultar por numero na agenda\n6-Sair.");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				Pessoa p1 = new Pessoa();
				System.out.println("Digite o nome do contato: ");
				p1.setNome(sc.nextLine());
				System.out.println("Digite a idade: ");
				p1.setIdade(sc.nextInt());
				System.out.println("Digite a altura: ");
				p1.setAltura(sc.nextFloat());
				e1.armazenar(p1);
				System.out.println("Armazenado com sucesso!");
				break;
			case 2:
				System.out.println("Digite o nome da pessoa a ser removida:");
				String nome = sc.nextLine();
				e1.remover(nome);
				System.out.println("Removido com sucesso!");
				break;
			case 3:
				System.out.println("Digite o nome desejado para busca: ");
				String nome2 = sc.nextLine();
				System.out.println(e1.buscaPessoa(nome2));
				break;
			case 4:
				System.out.println("Agenda até aqui:" + e1.getLista());
				break;
			case 5:
				System.out.println("Digite a posição da lista que deseja o contato:");
				int pos = sc.nextInt();
				System.out.println(e1.buscaPosi(op));
				break;
			case 6:
				System.out.println("Até a próxima");
				break;
			default:
				System.out.println("Invalido");
			}
		} while (op != 6);
		// System.out.println("Até a próxima");
	}
}