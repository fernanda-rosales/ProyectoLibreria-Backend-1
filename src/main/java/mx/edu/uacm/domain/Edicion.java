
package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class Edicion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@OneToMany
	@JoinColumn(name="edicionId")
	private List<Libro> listaLibro=new ArrayList<Libro>();
	
	private int numeroEdicion;
	private String foto;
	private double precioSinIva;
	private Date fechaPublicacion;

}