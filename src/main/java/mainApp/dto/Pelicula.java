package mainApp.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "calificacion_edad")
	private int calificacion_edad;
	
	@OneToMany
	@JoinColumn(name="pelicula")
	private List<Pelicula> pelicula;

	/**
	 * 
	 */
	public Pelicula() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param calificacion_edad
	 * @param pelicula
	 */
	public Pelicula(int codigo, String nombre, int calificacion_edad, List<Pelicula> pelicula) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
		this.pelicula = pelicula;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the calificacion_edad
	 */
	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	/**
	 * @param calificacion_edad the calificacion_edad to set
	 */
	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	/**
	 * @return the pelicula
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Pelicula> getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(List<Pelicula> pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad
				+ ", pelicula=" + pelicula + "]";
	}
	
	
}
