//package br.com.jean.services;
//
//import br.com.jean.model.Alunos;
//import br.com.jean.model.Notas;
//import br.com.jean.repositories.AlunosRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class AlunosService {
//
//    @Autowired
//    private AlunosRepository alunosRepository;
//
//    public void situacaoAlunos(float notas) {
//        Alunos alunos = alunosRepository.findAll(notas);
//        if (alunos.getNota() >= alunos.getMedia()) {
//            System.out.println("Aprovado");
//        }
//        System.out.println("Aprovado");
//    }
//
////    public List<Alunos> alunos(){
////
////        Alunos alunos1 = new Alunos();
////
////        List<Alunos> alunosList = new ArrayList<>();
////        alunosList.add(alunos1);
////        return alunosList;
//
//
//
//
//
//
//}
