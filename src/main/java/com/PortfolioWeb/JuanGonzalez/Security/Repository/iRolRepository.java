package com.PortfolioWeb.JuanGonzalez.Security.Repository;

import com.PortfolioWeb.JuanGonzalez.Security.Entity.Rol;
import com.PortfolioWeb.JuanGonzalez.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}

