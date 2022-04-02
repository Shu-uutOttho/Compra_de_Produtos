package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.OrdemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.PedidoStatus;

public class application {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os Dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Aniversario  Dia/M�s/Ano: ");
		Date aniversario = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, aniversario);

		System.out.println("Informe os dados do Pedido: ");
		System.out.print("Status do Pedido: ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next());

		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Quantos itens para esta compra? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do " + i + "� item: ");
			System.out.print("Nome do produto ");
			sc.nextLine();
			String produtoNome = sc.nextLine();
			System.out.print("Digite o Pre�o do produto: ");
			Double produtoPreco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			Produto produto = new Produto(produtoNome, produtoPreco);

			OrdemPedido op = new OrdemPedido(quantidade, produtoPreco, produto);

			pedido.addItem(op);
		}

		System.out.println();
		System.out.println(pedido);
		sc.close();
	}

}