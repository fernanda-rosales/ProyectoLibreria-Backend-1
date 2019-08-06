package mx.edu.uacm.domain;

import javax.persistence.Column;
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
public class Tarjeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private @Getter @Setter Long id;

	@Column(length = 45)
	private String numeroTarjeta;

	private double sobrecoste;

	@ManyToOne
	private MetodoDePago metodoDePago;

}
