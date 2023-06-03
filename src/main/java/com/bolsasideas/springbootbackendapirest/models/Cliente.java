package com.bolsasideas.springbootbackendapirest.models;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class Cliente implements Serializable{
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String nombre;
    private String apellido;
    private String email;
    @Temporal(TemporalType.DATE)
    @Column(name="create_at")
    private Date fecha;
    @PrePersist
	public void prePersist() {
		fecha =new Date();
	}
	private static final long serialVersionUID = 1L;
	
	
}
