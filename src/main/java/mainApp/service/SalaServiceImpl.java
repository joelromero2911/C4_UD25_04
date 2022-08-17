package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ISalaDAO;
import mainApp.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDAO iSalaDAO;
	
	@Override
	public List<Sala> listarSalas() {
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(int codigo) {
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public Sala actualizarSalas(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSalas(int codigo) {
		iSalaDAO.deleteById(codigo);
	}

}
