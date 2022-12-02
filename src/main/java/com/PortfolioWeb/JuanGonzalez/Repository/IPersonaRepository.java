package com.PortfolioWeb.JuanGonzalez.Repository;

import com.PortfolioWeb.JuanGonzalez.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
