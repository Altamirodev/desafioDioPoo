import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
