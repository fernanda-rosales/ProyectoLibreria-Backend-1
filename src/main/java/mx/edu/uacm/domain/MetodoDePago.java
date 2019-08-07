package mx.edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class MetodoDePago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
