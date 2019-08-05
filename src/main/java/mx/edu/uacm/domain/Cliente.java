package edu.uacm.com.security.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	private String apellidoP;

	private String apellidoM;

	private String email;

	private int telefono;

	private String contrasena;

	@ManyToOne(fetch = FetchType.LAZY) // para que se la bidireccionalidad
	@JoinColumn(name = "fk_clienteDireccion") // ese espara el nombre de la relacion
	@Embedded
	private Direccion direcion;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // siempre se pondra del lado donde esta el array //
																// orphanRemoval espara que no este relacionado a otra
																// cosa
	private List<Compra> listCompra = new ArrayList<Compra>();

}
