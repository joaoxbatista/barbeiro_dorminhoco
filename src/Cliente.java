
public class Cliente {
	public String nome;
	public int tempo;
	public Cliente(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tempo=" + tempo + "]";
	}
	
}
