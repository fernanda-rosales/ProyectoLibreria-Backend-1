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
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String calle;
	private String manzana;
	private String lote;
	private String codigoPostal;
	private String ciudad;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,mappedBy = "direcion")
	// siempre se pondra del lado donde esta el array //
	// orphanRemoval espara que no este relacionado a otra
	// cosa
	// @JoinColumn(name = "fk_clienteDireccion") // ese espara el nombre de la
	// relacion
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
}
