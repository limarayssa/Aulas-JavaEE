package br.com.rafaelcosta.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.rafaelcosta.application.ejb.PedidoBean;
import br.com.rafaelcosta.application.model.Pedido;


@Named
@RequestScoped
//lista todos os pedidos
public class ListPedidosBean implements Serializable {

	@EJB
	private PedidoBean pedidoBean;
	
	private List<Pedido> pedidos;
	//carrega todos os pedidos, iniciando eles
	@PostConstruct
	public void init() {
		pedidos = pedidoBean.listar();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	//escolhe o formato de pagamento
	public String pagar(Integer pedidoId, String tipo) throws Exception  {
		pedidoBean.pagar(pedidoId, tipo);
		//atualiza a página com as informações novas, por isso um redirect
		return "pedidos?faces-redirect=true";
	}
	
	public String excluir(Integer pedidoId) {
		//usa o id pra carregar as informações e excluir
		pedidoBean.excluir(pedidoId);
		//atualiza a página 
		return "pedidos?faces-redirect=true";
	}
}
