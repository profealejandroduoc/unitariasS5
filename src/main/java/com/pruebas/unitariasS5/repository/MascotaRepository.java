package com.pruebas.unitariasS5.repository;

import com.pruebas.unitariasS5.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {}