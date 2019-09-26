package Aula;

public class DisciplinaLecionada {
	private int ano;
	private int sem;
	protected Professor professor;
	protected Disciplina disciplina;

	
	public DisciplinaLecionada() {
		professor = new Professor();
		disciplina = new Disciplina();
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DisciplinaLecionada [ano=");
		builder.append(ano);
		builder.append(", sem=");
		builder.append(sem);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}
	
	
}
