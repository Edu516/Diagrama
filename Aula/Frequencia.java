package Aula;

import java.util.Date;

public class Frequencia {
	protected Frequencia frequencia;
	private Date dataHora;
	private int aulas;
	private int faltas;
	public Frequencia getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public int getAulas() {
		return aulas;
	}
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [frequencia=");
		builder.append(frequencia);
		builder.append(", dataHora=");
		builder.append(dataHora);
		builder.append(", aulas=");
		builder.append(aulas);
		builder.append(", faltas=");
		builder.append(faltas);
		builder.append("]");
		return builder.toString();
	}
	
	
}
