package mx.edu.uacm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tarjeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private @Getter @Setter Long id;

	@Column(length = 45)
	private @Getter @Setter String numeroTarjeta;

	private @Getter @Setter double sobrecoste;

}
