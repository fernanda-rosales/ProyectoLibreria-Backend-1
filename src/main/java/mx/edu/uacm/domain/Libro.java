package mx.edu.uacm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int isbn;

	@Column(length = 45)
	private String nombre;

	@Column(length = 45)
	private String autor;

	@Column(length = 500)
	private String sipnosis;

	private byte descatalogado;

	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Publicacion publicacion;

	@ManyToOne
	private Valoracion valoracion;

	@ManyToOne
	private Stock stock;
	
	

	

}
