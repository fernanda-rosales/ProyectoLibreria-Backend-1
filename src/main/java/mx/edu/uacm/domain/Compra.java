package mx.edu.uacm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne (fetch = FetchType.LAZY) // para que se la bidireccionalidad 
	@JoinColumn(name = "fk_clienteCompra") // ese espara el nombre de la relacion
	private Cliente cliente;

	// private MetodoPago metodoPago;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCompra;

	private double precioTotal;
}