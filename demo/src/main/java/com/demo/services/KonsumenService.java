package com.demo.services;

import com.demo.models.entities.Konsumen;
import com.demo.models.repos.KonsumenRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class KonsumenService {

    @Autowired
    private KonsumenRepo konsumenRepo;

    public Konsumen save(Konsumen konsumen) {
        return  konsumenRepo.save(konsumen);
    }

    public Konsumen findOne(Long id) {
        Optional<Konsumen> product = konsumenRepo.findById(id);
        if(!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    public Iterable<Konsumen> findAll() {
        return konsumenRepo.findAll();
    }

    public void removeOne(Long id) {
        konsumenRepo.deleteById(id);
    }

    public List<Konsumen> findByName(String name) {
        return  konsumenRepo.findByNameContains(name);
    }
}
