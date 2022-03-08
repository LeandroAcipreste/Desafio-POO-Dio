import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

        /**System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);**/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Conluídos:" + devCamila.get);
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("---------------");

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devLeandro.getConteudosInscritos());
        devLeandro.progredir();
        devLeandro.progredir();
        devLeandro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devLeandro.getConteudosInscritos());
        System.out.println("Conteúdos Conluídos:" + devLeandro.getConteudosConcluidos());
        System.out.println("XP:" + devLeandro.calcularTotalXp());
    }
}
