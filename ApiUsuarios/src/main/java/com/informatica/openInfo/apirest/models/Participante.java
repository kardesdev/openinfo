package com.informatica.openInfo.apirest.models;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Entity
@Data
public class Participante implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ci;
	
	private String foto;
	
	private String gradoAcademico;
	
	private String telefono;
	
	private String contacto2;
	
	private String contacto3;
	
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Usuario usuario; 
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@PrePersist
	public void prePersist() {
		createdAt=new Date();
	}
	
	
	private static final long serialVersionUID = 1L;

}
