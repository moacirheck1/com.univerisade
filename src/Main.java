
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
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
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Main {
    
    public static void main(String[] args) {
        
       Disciplina Geometria = new Disciplina(30,"geometria",10);
       Disciplina Biologia = new Disciplina(31,"Biologia",10);
       Disciplina Literatura = new Disciplina(32,"Literatura",10);
       Disciplina Quimica= new Disciplina(33,"Química",10);
       Disciplina Programacao= new Disciplina(34,"Programação",10);
       Disciplina Biotecnologia = new Disciplina(35,"Biotecnologia",10);
       Disciplina Farmacologia = new Disciplina(36,"Farmacologia",10);
       Disciplina Estatistica = new Disciplina(37,"Estatística",10);
       Disciplina Historia = new Disciplina(38,"História",10);
       Disciplina Filosofia = new Disciplina(39,"Filosofia",10);
              
       List <Disciplina> disciplinas = new ArrayList<>();
       disciplinas.add(Geometria);
       disciplinas.add(Biologia);
       disciplinas.add(Literatura);
       disciplinas.add(Quimica);
       disciplinas.add(Programacao);
       disciplinas.add(Biotecnologia);
       disciplinas.add(Farmacologia);
       disciplinas.add(Estatistica);
       disciplinas.add(Historia);
       disciplinas.add(Filosofia);
              
       Curso Arquitetura  = new Curso(30,"Arquitetura",disciplinas);
       
       Aluno estefani = new Aluno (30,"Vinicius","Sim",Arquitetura);
       Aluno luiza = new Aluno (30,"Vinicius","Sim",Arquitetura);
       Aluno mauri = new Aluno (30,"mauri","Sim",Arquitetura);
       Aluno luan = new Aluno (30,"luan","Sim",Arquitetura);
       Aluno eduardo = new Aluno (30,"eduardo","Sim",Arquitetura);
       Aluno henrique = new Aluno (30,"henrique","Sim",Arquitetura); 
       Aluno gean = new Aluno (30,"gean","Sim",Arquitetura);
       Aluno eduarda = new Aluno (30,"eduarda","Sim",Arquitetura);
       Aluno tauhan = new Aluno (30,"tauhan","Sim",Arquitetura);
       Aluno vinicius = new Aluno (30,"Vinicius","Sim",Arquitetura);   
       
       vinicius.matricularDiciplina(Filosofia);
       vinicius.matricularDiciplina(Biologia);
       vinicius.matricularDiciplina(Estatistica);
       vinicius.matricularDiciplina(Farmacologia);
       vinicius.matricularDiciplina(Geometria);
       
       Aluno moacir = new Aluno(31,"moacir","Sim",Arquitetura);
       moacir.matricularDiciplina(Filosofia);
       moacir.matricularDiciplina(Biologia);
       moacir.matricularDiciplina(Estatistica);
       moacir.matricularDiciplina(Programacao);
       moacir.matricularDiciplina(Farmacologia);
       moacir.matricularDiciplina(Geometria);
       
       vinicius.listarDisciplinas(Historia);
       moacir.listarDisciplinas(Historia);
>>>>>>> 0c104b79249045501c8a518de15b5cc0010e2de7
    }
}
