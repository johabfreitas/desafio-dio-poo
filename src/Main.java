import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 =  new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohab = new Dev();
        devJohab.setNome("Johab");
        devJohab.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Johab:" + devJohab.getConteudosInscritos());
        devJohab.progredir();
        devJohab.progredir();
        System.out.println("=");
        System.out.println("Conteúdos Inscritos Johab:" + devJohab.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Johab:" + devJohab.getConteudosConcluidos());
        System.out.println("XP:" + devJohab.calcularTotalXp());

        System.out.println("===================");

        Dev devFreitas = new Dev();
        devFreitas.setNome("Freitas");
        devFreitas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Freitas:" + devFreitas.getConteudosInscritos());
        devFreitas.progredir();
        devFreitas.progredir();
        devFreitas.progredir();
        System.out.println("=");
        System.out.println("Conteúdos Inscritos Freitas:" + devFreitas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Johab:" + devFreitas.getConteudosConcluidos());
        System.out.println("XP:" + devFreitas.calcularTotalXp());

    }
}
