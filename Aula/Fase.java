package Aula;

public class Fase {
	protected Curso curso;
	private int semestre;
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [curso=");
		builder.append(curso);
		builder.append(", semestre=");
		builder.append(semestre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
