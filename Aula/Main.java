package Aula;

public class Main {

	public static void main(String[] args) {
			Aluno al = new Aluno();
			Professor pr = new Professor();
			Curso cur = new Curso();
			al.setCpf(123516);
			al.setNome("Edu");
			
			pr.setCpf(524735);
			pr.setNome("Vitor");
			
			cur.setNome("BCC");
			Fase fas = new Fase();
			fas.setCurso(cur);
			fas.setSemestre(3);
			Disciplina dis = new Disciplina();
			
			dis.setFase(fas);
			dis.setNome("POO");
			
			DisciplinaLecionada dl = new DisciplinaLecionada();
			dl.setDisciplina(dis);
			dl.setAno(2017);
			dl.setProfessor(pr);
			dl.setSem(4);
			
			System.out.println(dl);
	}

}
