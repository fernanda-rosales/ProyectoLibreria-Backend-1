package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter long id;
	
	private @Getter @Setter String descripcion;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Categoria_idCategoria")
	private List<Libro> libros =new ArrayList<Libro>();
	
	
}
