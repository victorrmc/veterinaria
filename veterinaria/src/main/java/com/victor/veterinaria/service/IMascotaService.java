/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.victor.veterinaria.service;

import com.victor.veterinaria.dto.MascoDueno;
import com.victor.veterinaria.model.Mascota;
import java.util.List;

/**
 *
 * @author victo
 */
public interface IMascotaService {
    
    //CRUD
    public void createMascota(Mascota masco);
    public List<Mascota> listMascota();
    public void updateMascota(Mascota masco);
    public void deleteMascota(Long id);
    
    //listar mascotas que sean perros y caniches
    public List<Mascota> listCaniche();
    //listar dto MascoDueno
    public List<MascoDueno> listMascoDueno();
    
}
