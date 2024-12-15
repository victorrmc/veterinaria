/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victor.veterinaria.service;

import com.victor.veterinaria.model.Dueno;
import com.victor.veterinaria.repository.IDuenoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenoService implements IDuenoService{
    
    @Autowired
    private IDuenoRepository duenoRepo;

    @Override
    public void createDueno(Dueno dueno) {
        duenoRepo.save(dueno);
    }

    @Override
    public List<Dueno> listDueno() {
        return duenoRepo.findAll();
    }

    @Override
    public void updateDueno(Dueno dueno) {
        duenoRepo.save(dueno);
    }

    @Override
    public void deleteDueno(Long id) {
        duenoRepo.deleteById(id);
    }
    
}
