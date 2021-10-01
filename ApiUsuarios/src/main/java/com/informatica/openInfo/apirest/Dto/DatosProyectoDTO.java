package com.informatica.openInfo.apirest.Dto;

import java.util.List;

import com.informatica.openInfo.apirest.models.Equipo;
import com.informatica.openInfo.apirest.models.TipoProyecto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatosProyectoDTO {
	
	private String nombre;
	
	private String problematica;
	
	private String objetivoGeneral;
	
	private String alcance;
	
	private String beneficiarios;
	
	private String valorAgregado;
	
	private String descripcion;
	
	private String banner;
	
	private String linkVideo;
	
	private String area;
	
	private Long idTipoProyecto;
	
	private List<String> objetivos;
	
}
