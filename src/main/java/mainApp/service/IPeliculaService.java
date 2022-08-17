package mainApp.service;

import java.util.List;

import mainApp.dto.Pelicula;

public interface IPeliculaService {

	//Metodos del CRUD
	public List<Pelicula> listarPeliculas(); // Listar All 
	
	public Pelicula guardarPelicula(Pelicula pelicula);	// CREATE
	
	public Pelicula peliculaXID(int codigo); // READ
	
	public Pelicula actualizarPeliculas(Pelicula pelicula); // UPDATE
	
	public void eliminarPeliculas(int codigo); // DELETE
}
