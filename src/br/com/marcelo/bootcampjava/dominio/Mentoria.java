package br.com.marcelo.bootcampjava.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria {
	private String titulo;
	private String descricao;
	private LocalDate data;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + DATE_FORMATTER.format(data) + "]";
	}
}
