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
public class Publicacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Libro> libros = new ArrayList<Libro>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacion")
	private List<DetalleCompra> detalleCompra = new ArrayList<DetalleCompra>();
}
