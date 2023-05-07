package com.demo.models.repos;

import com.demo.models.entities.Konsumen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KonsumenRepo extends CrudRepository<Konsumen, Long>{

    List<Konsumen> findByNameContains(String name);
}
