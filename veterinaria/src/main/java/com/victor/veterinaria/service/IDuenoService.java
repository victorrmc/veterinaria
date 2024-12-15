/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.victor.veterinaria.service;

import com.victor.veterinaria.model.Dueno;
import java.util.List;

/**
 *
 * @author victo
 */
public interface IDuenoService {
    
    //CRUD
    public void createDueno(Dueno dueno);
    public List<Dueno> listDueno();
    public void updateDueno(Dueno dueno);
    public void deleteDueno(Long id);
    
}
