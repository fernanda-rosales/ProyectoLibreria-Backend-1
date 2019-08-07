package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;


@Entity
@Data
public class MetodoDePago {
	

	@Id
	private Long id;
	//duda es forzoso el join column cuando uso onetomay y tendría problema con usar el cascadeType para este ejercicio
	@OneToMany(cascade=CascadeType.ALL)
	private List<Transferencia> listaTransferencia=new ArrayList<Transferencia>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Paypal> listaPaypal=new ArrayList<Paypal>();
	

}
