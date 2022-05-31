package app;
import java.util.ArrayList;

public class Agenda {

	public ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	public Agenda() {
		
	}

	public ArrayList<Pessoa> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pessoa> lista) {
		this.lista = lista;
	}
	
	public void armazenar(Pessoa p1) {
		lista.add(p1);
	}
	public void remover(String nome) {
		lista.remove(nome);
	}
	public int buscaPessoa(String i) {
		return lista.indexOf(i);
	}
	public Pessoa buscaPosi(int i) {
		return lista.get(i);
	}
}
