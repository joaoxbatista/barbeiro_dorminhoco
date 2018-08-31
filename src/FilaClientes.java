import java.util.LinkedList;
import java.util.List;

public class FilaClientes {
	private LinkedList<Cliente> clientes;
	public int limite;
	public boolean status;
	
	/*
	 * Construtor
	 * */
	public FilaClientes() {
		this.clientes = new LinkedList<Cliente>();
		this.limite = 4;
	}
	
	/*
	 * Adiciona cliente a lista de clientes
	 * */
	public  synchronized void adicionaCliente(Cliente cliente) {
		
		this.status = false;
		this.clientes.add(cliente);
		System.out.println("Cliente adicionado a fila: " + cliente);
		this.status = true;
		this.notifyAll();
		try {
			Thread.sleep(cliente.tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Obtem o primeiro cliente
	 * */
	public  Cliente getCliente() {
		return this.clientes.getFirst();
	}
	
	public  void delCliente(Barbeiro b) {
		System.out.println("Barbeiro: " + b.nome + " atendeu o cliente " + this.getCliente() + " \n");
		this.clientes.removeFirst();
	}
	
	public boolean verificarLimite() {
		if(this.clientes.size() >= limite) 
			return true;
		return false;
	}
	
	public int tamanho() {
		return this.clientes.size();
	}
	
}
