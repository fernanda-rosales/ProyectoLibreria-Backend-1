
package mx.edu.uacm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;


@Entity
@Data
public class Edicion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@ManyToOne
	private Editorial editorial;
	
	private int numeroEdicion;
	private String foto;
	private double precioSinIva;
	private Date fechaPublicacion;

}