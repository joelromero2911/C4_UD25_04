package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Sala;
import mainApp.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaServiceImpl.guardarSala(sala);
	}
	
	@GetMapping("/salas/{codigo}")
	public Sala salaXID(@PathVariable(name="codigo") int codigo) {
		
		Sala sala_xid= new Sala();
		sala_xid=salaServiceImpl.salaXID(codigo);
		System.out.println("Pelicula XID: "+sala_xid);
		return sala_xid;
	}

	@PutMapping("/salas/{codigo}")
	public Sala actualizarSalas(@PathVariable(name="codigo")int codigo,@RequestBody Sala sala) {
		
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= salaServiceImpl.salaXID(codigo);
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
		sala_actualizado = salaServiceImpl.actualizarSalas(sala_seleccionado);
		
		System.out.println("La sala actualizada es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSalas(@PathVariable(name="codigo")int codigo) {
		salaServiceImpl.eliminarSalas(codigo);
	}
}
