package br.com.marcelo.bootcampjava.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

	private LocalDate data;

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		
		final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + DATE_FORMATTER.format(data) + "]";
	}

}
