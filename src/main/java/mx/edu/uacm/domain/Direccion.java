package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

import lombok.Data;

@Embeddable
@Data
public class Direccion {

	private String calle;
	private String manzana;
	private String lote;
	private String codigoPostal;
	private String ciudad;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // siempre se pondra del lado donde esta el array //
																// orphanRemoval espara que no este relacionado a otra
																// cosa
	// @JoinColumn(name = "fk_clienteDireccion") // ese espara el nombre de la
	// relacion
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
}
