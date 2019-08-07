package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
@Data
public class Edicion {
	
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

}
