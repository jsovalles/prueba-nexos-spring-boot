package com.nexos.springboot.web.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="personas")
@EntityListeners({AuditingEntityListener.class})
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull(message = "{person.data.notnull}")
	private int id;
	
	@NotEmpty(message = "{person.data.notempty}")
	private String nombre;
	
	@NotEmpty(message = "{person.data.notempty}")
	private String apellido;
	
	@NotEmpty(message = "{person.data.notempty}")
	@Email(message = "{person.email.invalid}")
	private String email;
	
	@NotEmpty(message = "{person.data.notempty}")
	private String recidencia;
	
	@NotEmpty(message = "{person.data.notempty}")
	private String parentezco;
	
	@Column(name ="fecha_nacimiento")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past
	private Date fechaNacimiento;
	
	@Column(name ="tipo_documento")
	@Size(max = 2, message="{person.documenttype.length}")
	@NotEmpty(message = "{person.data.notempty}")
	private String tipoDocumento;
	
	@Column(name ="numero_documento")
	@NotNull(message = "{person.data.notnull}")
	private int numeroDocumento;
	
	@Column(name = "created_date", nullable = false, updatable = false)
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "modified_date")
	@LastModifiedDate
	private Date modifiedDate;
	
	@Column(name = "created_by", nullable = false, updatable = false)
	@CreatedBy
	private String createdBy;
	
	@Column(name = "modified_by")
	@LastModifiedBy
	private String modifiedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRecidencia() {
		return recidencia;
	}

	public void setRecidencia(String recidencia) {
		this.recidencia = recidencia;
	}

	public String getParentezco() {
		return parentezco;
	}

	public void setParentezco(String parentezco) {
		this.parentezco = parentezco;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", recidencia=" + recidencia + ", parentezco=" + parentezco + ", fechaNacimiento=" + fechaNacimiento
				+ ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + ", createdBy=" + createdBy + ", modifiedBy="
				+ modifiedBy + "]";
	}


}
