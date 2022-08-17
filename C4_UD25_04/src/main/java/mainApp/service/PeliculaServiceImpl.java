package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IPeliculaDAO;
import mainApp.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaDAO iPeliculaDAO;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(int codigo) {
		return iPeliculaDAO.findById(codigo).get();
	}

	@Override
	public Pelicula actualizarPeliculas(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPeliculas(int codigo) {
		iPeliculaDAO.deleteById(codigo);
	}

}
