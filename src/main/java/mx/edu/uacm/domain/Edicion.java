package mx.edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Edicion {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter	@Setter Long id;
	
	@ManyToOne
	private Editorial editorial;

}
