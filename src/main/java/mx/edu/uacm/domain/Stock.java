package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private int cantidadEjemplar;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "stock")

	private List<Libro> libros = new ArrayList<Libro>();

}
