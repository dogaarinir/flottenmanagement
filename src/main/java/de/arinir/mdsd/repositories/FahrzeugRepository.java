package de.arinir.mdsd.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import de.arinir.mdsd.entities.*;

public interface FahrzeugRepository extends JpaRepository<Fahrzeug, Integer> {

}
