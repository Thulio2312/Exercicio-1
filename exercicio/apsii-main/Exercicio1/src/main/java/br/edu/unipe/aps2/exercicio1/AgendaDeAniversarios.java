
package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
	public void adicionarAniversariante(String nome, int dia, int mes);
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes);
	public void removerAniversariante(String nomeAniversariante);
}
