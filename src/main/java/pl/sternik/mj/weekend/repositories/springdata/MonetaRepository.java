package pl.sternik.mj.weekend.repositories.springdata;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.sternik.mj.weekend.repositories.MonetyRepository;
import pl.sternik.mj.weekend.entities.Moneta;


@Repository
public interface MonetaRepository
        extends JpaRepository<Moneta, Long>{
    public Moneta findByNumerKatalogowy(Long id);
}