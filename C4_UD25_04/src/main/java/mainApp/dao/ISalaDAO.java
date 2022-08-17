package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Integer>{

}
