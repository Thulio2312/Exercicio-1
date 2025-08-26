package br.edu.unipe.aps2.exercicio1;

public class Aniversariante {
	@Override
	public int hashCode() {
		int result = nome != null ? nome.hashCode() : 0;
		result = 31 * result + (dataAniversario != null ? dataAniversario.hashCode() : 0);
		return result;
	}
	public String getNome() {
		return nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}
	
	private final String nome;
	private final DataAniversario dataAniversario;

	public Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}


	public Aniversariante(String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Aniversariante outro = (Aniversariante) obj;
		return nome.equals(outro.nome) && dataAniversario.equals(outro.dataAniversario);
	}
}
