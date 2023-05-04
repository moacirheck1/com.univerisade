
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Disciplina biologia = new Disciplina(101, "Biologia", 10);
        Disciplina historia = new Disciplina(102, "História", 10);
        Disciplina geografia = new Disciplina(103, "geografia", 10);
        Disciplina matematica = new Disciplina(104, "Matematica", 10);
        Disciplina filosofia = new Disciplina(105, "Filosofia", 10);
        Disciplina portugues = new Disciplina(106, "Português", 10);
        Disciplina literatura = new Disciplina(107, "Literarura", 10);
        Disciplina informatica = new Disciplina(108, "Informática", 10);
        Disciplina matematica2 = new Disciplina(109, "Matematica II", 10);
        Disciplina religiao = new Disciplina(110, "Religião", 10);

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(religiao);
        disciplinas.add(historia);
        disciplinas.add(matematica);
        disciplinas.add(filosofia);
        disciplinas.add(biologia);
        disciplinas.add(matematica2);
        disciplinas.add(literatura);
        disciplinas.add(portugues);
        disciplinas.add(informatica);
        disciplinas.add(geografia);

        Curso tecnicoInformatica = new Curso(1000, "Técnico Iformatica", disciplinas);

        Aluno henrique = new Aluno(10, "Henrique", "100", tecnicoInformatica);
        Aluno moacir = new Aluno(10, "Moacir", "1100", tecnicoInformatica);
        Aluno vinicios = new Aluno(10, "Vinícios", "900", tecnicoInformatica);
        Aluno eduardo = new Aluno(10, "Eduardo", "800", tecnicoInformatica);
        Aluno gean = new Aluno(10, "Gean", "700", tecnicoInformatica);
        Aluno luan = new Aluno(10, "Luan", "600", tecnicoInformatica);
        Aluno kaiane = new Aluno(10, "Kaiane", "500", tecnicoInformatica);
        Aluno luisa = new Aluno(10, "Luisa", "100", tecnicoInformatica);
        Aluno estefani = new Aluno(10, "Estfany", "200", tecnicoInformatica);
        Aluno eduarda = new Aluno(10, "Éduarda", "400", tecnicoInformatica);
        Aluno tauan = new Aluno(10, "Tauan", "300", tecnicoInformatica);

        henrique.matricularDiciplina(biologia);
        henrique.matricularDiciplina(geografia);
        henrique.matricularDiciplina(informatica);
        henrique.matricularDiciplina(matematica2);
        henrique.matricularDiciplina(portugues);

        moacir.matricularDiciplina(historia);
        moacir.matricularDiciplina(biologia);
        moacir.matricularDiciplina(filosofia);
        moacir.matricularDiciplina(religiao);
        moacir.matricularDiciplina(informatica);

        moacir.listarDisciplinas();

    }
}
