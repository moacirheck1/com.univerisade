
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private int codigo;
    private String nome;
    private String matricula;
    private Curso curso;
    private List<Disciplina> disciplinaMatriculas;

    public Aluno(int codigo, String nome, String matricula, Curso curso, List<Disciplina> disciplinaMatriculas) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinaMatriculas = disciplinaMatriculas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinaMatriculas() {
        return disciplinaMatriculas;
    }

    public void setDisciplinaMatriculas(List<Disciplina> disciplinaMatriculas) {
        this.disciplinaMatriculas = disciplinaMatriculas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", disciplinaMatriculas=" + disciplinaMatriculas + '}';
    }
//a. Além disso, crie um método "matricularDisciplina" na classe "Aluno" que
//    receba uma
//referência para a classe "Disciplina" e adicione essa disciplina na 
//    lista de disciplinas do
////aluno.

    public Aluno() {
        disciplinaMatriculas = new ArrayList<>();
    }

    public void matricularDiciplina(Disciplina disciplina) {
        disciplinaMatriculas .add(disciplina);

    }

}
