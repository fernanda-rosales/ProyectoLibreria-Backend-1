package mx.edu.uacm.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class IVA {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double valor;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//@OneToOne(mappedBy = "iva", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	//private Edicion edicion;

}
