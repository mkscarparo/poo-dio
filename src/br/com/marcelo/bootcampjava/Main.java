package br.com.marcelo.bootcampjava;

import java.time.LocalDate;

import br.com.marcelo.bootcampjava.dominio.Bootcamp;
import br.com.marcelo.bootcampjava.dominio.Curso;
import br.com.marcelo.bootcampjava.dominio.Dev;
import br.com.marcelo.bootcampjava.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição do curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso HTML");
		curso2.setDescricao("descrição do curso HTML");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descrição da mentoria de Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java");
		bootcamp.setDestricao("Descrição");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Bill Gates");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println(dev1.getNome());
		System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXP());
		System.out.println();
		dev1.progredir();
		System.out.println("Progressão: ");
		System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXP());
		System.out.printf("%n-------------%n%n");
		Dev dev2 = new Dev();
		dev2.setNome("Stephen Hawking");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println(dev2.getNome());
		System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXP());
		System.out.println();
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Progressão: ");
		System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXP());

	}

}
