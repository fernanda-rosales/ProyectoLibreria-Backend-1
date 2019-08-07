package mx.edu.uacm.domain;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> 61850437d337e36f5bedc3005238c13eac2a322c
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
=======
import javax.persistence.OneToMany;
>>>>>>> 61850437d337e36f5bedc3005238c13eac2a322c

import lombok.Data;

@Data
@Entity
public class MetodoDePago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
<<<<<<< HEAD
=======

	//duda es forzoso el join column cuando uso onetomay y tendría problema con usar el cascadeType para este ejercicio
	@OneToMany()
	private List<Transferencia> listaTransferencia=new ArrayList<Transferencia>();
	
	@OneToMany()
	private List<Tarjeta> listaTarjeta=new ArrayList<Tarjeta>();
	
	@OneToMany()
	private List<Paypal> listaPaypal=new ArrayList<Paypal>();
	

>>>>>>> 61850437d337e36f5bedc3005238c13eac2a322c
}
