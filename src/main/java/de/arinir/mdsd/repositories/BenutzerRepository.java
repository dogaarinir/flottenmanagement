package de.arinir.mdsd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.arinir.mdsd.entities.*;

public interface BenutzerRepository extends JpaRepository<Benutzer, Integer>{

	Benutzer findByLogin(String login);
}
