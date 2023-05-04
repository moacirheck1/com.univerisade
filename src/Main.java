
import java.util.ArrayList;
import java.util.List;

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
    }
}
