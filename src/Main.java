import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSansao = new Dev();
        devSansao.setNome("Sansao");
        devSansao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Sansao:" + devSansao.getConteudosInscritos());

        devSansao.progredir();
        devSansao.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Sansao:" + devSansao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Sansao:" + devSansao.getConteudosConcluidos());
        System.out.println("XP:" + devSansao.calcularTotalXp());

        System.out.println("------------");


        Dev devBruce = new Dev();
        devBruce.setNome("Bruce");
        devBruce.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bruce:" + devBruce.getConteudosInscritos());

        devBruce.progredir();
        devBruce.progredir();
        devBruce.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Bruce:" + devBruce.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Bruce:" + devBruce.getConteudosConcluidos());
        System.out.println("XP:" + devBruce.calcularTotalXp());

    }
}