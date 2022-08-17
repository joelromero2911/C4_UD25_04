package mainApp.service;

import java.util.List;

import mainApp.dto.Sala;

public interface ISalaService {

	//Metodos del CRUD
	public List<Sala> listarSalas(); // Listar All 
	
	public Sala guardarSala(Sala sala);	// CREATE
	
	public Sala salaXID(int codigo); // READ
	
	public Sala actualizarSalas(Sala sala); // UPDATE
	
	public void eliminarSalas(int codigo); // DELETE
}
