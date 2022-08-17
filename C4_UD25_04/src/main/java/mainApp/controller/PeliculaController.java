package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Pelicula;
import mainApp.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula peliculaXID(@PathVariable(name="codigo") int codigo) {
		
		Pelicula pelicula_xid= new Pelicula();
		pelicula_xid=peliculaServiceImpl.peliculaXID(codigo);
		System.out.println("Pelicula XID: "+pelicula_xid);
		return pelicula_xid;
	}

	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPeliculas(@PathVariable(name="codigo")int codigo,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		
		pelicula_seleccionado= peliculaServiceImpl.peliculaXID(codigo);
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacion_edad(pelicula.getCalificacion_edad());
		pelicula_actualizado = peliculaServiceImpl.actualizarPeliculas(pelicula_seleccionado);
		
		System.out.println("La pelicula actualizada es: "+ pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPeliculas(@PathVariable(name="codigo")int codigo) {
		peliculaServiceImpl.eliminarPeliculas(codigo);
	}
}
