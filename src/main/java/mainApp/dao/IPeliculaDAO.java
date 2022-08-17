package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

}
