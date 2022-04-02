package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entities.enums.PedidoStatus;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private PedidoStatus status;
	private Cliente cliente;

	private List<OrdemPedido> itens = new ArrayList<OrdemPedido>();

	public Pedido() {

	}

	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getmoment() {
		return momento;
	}

	public void setmoment(Date momento) {
		this.momento = momento;

	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(OrdemPedido item) {
		itens.add(item);
	}

	public void removeItem(OrdemPedido item) {
		itens.remove(item);
	}

	public double Total() {
		double soma = 0.0;
		for (OrdemPedido op : itens) {
			soma += op.subtotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("status do pedido");
		sb.append("status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Lista de Pedidos:\n");
		for (OrdemPedido op : itens) {
			sb.append(op + "\n");
		}
		sb.append("Preço Total: R$ ");
		sb.append(String.format("%.2f", Total()));
		return sb.toString();

	}
}
