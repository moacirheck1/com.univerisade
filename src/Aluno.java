
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private int codigo;
    private String nome;
    private String matricula;
    private Curso curso;
    private List<Disciplina> disciplinaMatriculas;

    public Aluno(int codigo, String nome, String matricula, Curso curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
<<<<<<< HEAD
        this.disciplinaMatriculas = new ArrayList<>();
=======
        disciplinaMatriculas = new ArrayList<>();
>>>>>>> 0c104b79249045501c8a518de15b5cc0010e2de7
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
<<<<<<< HEAD

    public void listarDisciplinas(){
        System.out.println(this.disciplinaMatriculas);
        System.out.println("Faltam " +(curso.getDisciplinas().size() - this.disciplinaMatriculas.size()));
    }
  
=======
>>>>>>> 0c104b79249045501c8a518de15b5cc0010e2de7

    public Aluno() {
        disciplinaMatriculas = new ArrayList<>();
    }

  


<<<<<<< HEAD
    public void matricularDiciplina(Disciplina disciplina) {
        if ((disciplinaMatriculas.size()<5)&& (!disciplinaMatriculas.contains(disciplina))){
        disciplinaMatriculas .add(disciplina);

        }else{
            System.out.println("Disciplina não pode ser adicionada!");
        }
=======
    public void listarDisciplinas(Disciplina disciplina) {
>>>>>>> 0c104b79249045501c8a518de15b5cc0010e2de7

        System.out.println(this.disciplinaMatriculas);
        System.out.println("Faltam " + (curso.getDisciplinas().size() - this.disciplinaMatriculas.size()));

<<<<<<< HEAD
=======
    public void listarDisciplinas(Disciplina disciplina){
 
          System.out.println(disciplinaMatriculas);
                
                }


    }
>>>>>>> 0c104b79249045501c8a518de15b5cc0010e2de7
}
