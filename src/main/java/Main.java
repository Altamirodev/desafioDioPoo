import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Programação Orientada a Objeto");
        curso1.setCargaHoraria(72);

        Curso curso2 = new Curso();
        curso2.setTitulo("PHP");
        curso2.setDescricao("Programação Orientada a Objeto");
        curso2.setCargaHoraria(60);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Aprender");
        mentoria1.setDescricao("Descrição da Mentoria.");
        mentoria1.setData(LocalDate.now()); //Define a data da hora em que roda o programa.


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJunior = new Dev();
        devJunior.setNome("Altamiro Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Junior: " + devJunior.getConteudosInscritos());
        devJunior.progredir();
        devJunior.progredir();
        devJunior.progredir();
        System.out.println("Conteúdos inscritos Junior: " + devJunior.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Junior: " + devJunior.getConteudosconcluidos());
        System.out.println("XP: " + devJunior.calcularTotalXp());



        Dev devTeste = new Dev();
        devTeste.setNome("Teste de Oliveira");
        devTeste.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Teste: " + devTeste.getConteudosInscritos());
        devTeste.progredir();
        System.out.println("Conteúdos inscritos Teste: " + devTeste.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Teste: " + devTeste.getConteudosconcluidos());
        System.out.println("XP: " + devTeste.calcularTotalXp());


    }
}
