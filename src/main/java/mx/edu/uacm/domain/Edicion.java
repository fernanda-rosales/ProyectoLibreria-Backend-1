package mx.edu.uacm.domain;

<<<<<<< HEAD
import javax.persistence.Entity;
=======
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
>>>>>>> 887e2ee5dbb30be535fbcf9641f8b4ae0bc2aade
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
<<<<<<< HEAD

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
=======
import javax.persistence.OneToOne;

import lombok.Data;

>>>>>>> 887e2ee5dbb30be535fbcf9641f8b4ae0bc2aade

@Entity
@Data
public class Edicion {
	
<<<<<<< HEAD

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter	@Setter Long id;
	
	@ManyToOne
	private Editorial editorial;
=======
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@OneToOne(mappedBy = "edicion",cascade=CascadeType.ALL, fetch = FetchType.LAZY,optional = false)
	private MetodoDePago metodoPago;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private List<Editorial> listaEditorial=new ArrayList<Editorial>();
	
	private int numeroEdicion;
	private String foto;
	private double precioSinIva;
	private Date fechaPublicacion;
>>>>>>> 887e2ee5dbb30be535fbcf9641f8b4ae0bc2aade

}
