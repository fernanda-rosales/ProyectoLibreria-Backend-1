package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class MetodoDePago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//duda es forzoso el join column cuando uso onetomay y tendría problema con usar el cascadeType para este ejercicio
	@OneToMany()
	@JoinColumn(name="MetodoDePagoTransferenciaId")
	private List<Transferencia> listaTransferencia=new ArrayList<Transferencia>();
	
	@OneToMany()
	@JoinColumn(name="MetodoDePagoTarjetaId")
	private List<Tarjeta> listaTarjeta=new ArrayList<Tarjeta>();
	
	@OneToMany()
	@JoinColumn(name="MetodoDePagoPaypalId")
	private List<Paypal> listaPaypal=new ArrayList<Paypal>();
	
	@OneToMany()
	@JoinColumn(name="MetodoDePagoCompraId")
	private List<Compra> listaCompra=new ArrayList<Compra>();
	
	@OneToMany()
	@JoinColumn(name="MetodoDePagoContrarembolsoId")
	private List<Contrarembolso> listaContra=new ArrayList<Contrarembolso>();
	
}
