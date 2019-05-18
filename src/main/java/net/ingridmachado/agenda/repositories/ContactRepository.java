package net.ingridmachado.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.ingridmachado.agenda.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
	
}