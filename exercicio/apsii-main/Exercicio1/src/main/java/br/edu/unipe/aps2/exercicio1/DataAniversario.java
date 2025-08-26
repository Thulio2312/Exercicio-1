

package br.edu.unipe.aps2.exercicio1;

public class DataAniversario {
	private final int dia;
	private final int mes;

	public DataAniversario(int dia, int mes){
		this.dia = dia;
		this.mes = mes;
	}

	@Override
	public boolean equals(Object outraData){
		if (this == outraData) return true;
		if (outraData == null || getClass() != outraData.getClass()) return false;
		DataAniversario outraDataAniversario = (DataAniversario) outraData;
		return outraDataAniversario.dia == this.dia && outraDataAniversario.mes == this.mes;
	}

	@Override
	public int hashCode() {
		int result = Integer.hashCode(dia);
		result = 31 * result + Integer.hashCode(mes);
		return result;
	}

	@Override
	public String toString(){
		return this.dia+"/"+this.mes;
	}
}
