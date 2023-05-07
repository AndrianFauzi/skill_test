package com.demo.services;

import com.demo.models.entities.Konsumen;
import com.demo.models.repos.KonsumenRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class KonsumenService {

    @Autowired
    private KonsumenRepo konsumenRepo;

    public Konsumen save(Konsumen konsumen) {
        return  konsumenRepo.save(konsumen);
    }

    public Iterable<Konsumen> findAll() {
        return konsumenRepo.findAll();
    }

}
