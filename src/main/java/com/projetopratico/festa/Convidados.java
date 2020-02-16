package com.projetopratico.festa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopratico.festa.model.Convidado;


public interface Convidados extends JpaRepository<Convidado,Long> {

}
