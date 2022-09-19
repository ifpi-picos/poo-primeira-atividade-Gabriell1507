import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String nivel;
    private int ch;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome8, String nivel, int ch, Professor p) {
        this.nome = nome8;
        this.nivel = nivel;
        this.ch = ch;
        this.professor = p;
        this.alunos = new ArrayList<>();
    }

    public int getAlunosMatriculados() {
        return this.alunos.size();
    }

    public void realizarMatricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getCh() {
        return ch;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNomeProfessor() {
        return this.professor.getNome();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}