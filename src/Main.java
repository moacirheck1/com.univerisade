
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Disciplina disciplina = new Disciplina();

        Disciplina disciplina1 = new Disciplina(1001, "Matematica", 10);
        Disciplina disciplina2 = new Disciplina(1002, "Algoritmo", 10);
        Disciplina disciplina3 = new Disciplina(1003, "Portugues", 10);
        Disciplina disciplina4 = new Disciplina(1004, "Ingles", 10);
        Disciplina disciplina5 = new Disciplina(1005, "Historia", 10);
        Disciplina disciplina6 = new Disciplina(1006, "Biologia", 10);
        Disciplina disciplina7 = new Disciplina(1007, "Geografia", 10);
        Disciplina disciplina8 = new Disciplina(1008, "Filosofia", 10);
        Disciplina disciplina9 = new Disciplina(1009, "Quimica", 10);
        Disciplina disciplina10 = new Disciplina(1010, "Sociologia", 10);

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(disciplina4);
        disciplinas.add(disciplina5);
        disciplinas.add(disciplina6);
        disciplinas.add(disciplina7);
        disciplinas.add(disciplina8);
        disciplinas.add(disciplina9);
        disciplinas.add(disciplina10);
        Curso tecnicoInformatica = new Curso(1000, "Tecnico Informatica", disciplinas);
        Aluno moacir = new Aluno(1020, "Moacir", "1000", tecnicoInformatica);
        Aluno vinicius = new Aluno(1021, "Vinicius", "1500", tecnicoInformatica);
        Aluno henrique = new Aluno(1022, "Henrique", "1600", tecnicoInformatica);
        Aluno eduardo = new Aluno(1023, "Eduardo", "1700", tecnicoInformatica);
        Aluno luan = new Aluno(1024, "Luan", "1800", tecnicoInformatica);
        Aluno jean = new Aluno(1025, "Jean", "1900", tecnicoInformatica);
        Aluno tahuan = new Aluno(1026, "Tahuan", "2000", tecnicoInformatica);
        Aluno kaiane = new Aluno(1027, "Kaiane", "3000", tecnicoInformatica);
        Aluno luiza = new Aluno(1028, "Luiza", "4000", tecnicoInformatica);
        Aluno estefany = new Aluno(1029, "Estefany", "5000", tecnicoInformatica);
        Aluno eduarda = new Aluno(1030, "Eduarda", "6000", tecnicoInformatica);

        moacir.matricularDiciplina(disciplina1);
        moacir.matricularDiciplina(disciplina2);
        moacir.matricularDiciplina(disciplina3);
        moacir.matricularDiciplina(disciplina4);
        moacir.matricularDiciplina(disciplina5);

        henrique.matricularDiciplina(disciplina1);
        henrique.matricularDiciplina(disciplina2);
        henrique.matricularDiciplina(disciplina3);
        henrique.matricularDiciplina(disciplina4);
        henrique.matricularDiciplina(disciplina5);

        moacir.listarDisciplinas(disciplina);
        henrique.listarDisciplinas(disciplina);
    }

}
