package com.portfolio.gda.Repository;

/**
 *
 * @author guill
 */
import com.portfolio.gda.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}