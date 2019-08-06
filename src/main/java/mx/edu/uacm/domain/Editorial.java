package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Editorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter	@Setter Long id;

	@Column(length = 45)
	private @Getter	@Setter String nombre;
	
	@OneToMany
	private @Getter @Setter List<Edicion> ediciones =new ArrayList<Edicion>();
	
	

}
