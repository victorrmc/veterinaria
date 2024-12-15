/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victor.veterinaria.service;

import com.victor.veterinaria.dto.MascoDueno;
import com.victor.veterinaria.model.Mascota;
import com.victor.veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public void createMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public List<Mascota> listMascota() {
       return mascoRepo.findAll();
    }

    @Override
    public void updateMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public List<Mascota> listCaniche() {
        List<Mascota> listMasco = mascoRepo.findAll();
        List<Mascota> listCaniche = listMasco.stream()
                .filter(masco-> masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche"))
                .collect(Collectors.toList());
        return listCaniche;
    }

    @Override
    public List<MascoDueno> listMascoDueno() {
        List<Mascota> listMasco = this.listMascota();
        List<MascoDueno> listMascoDueno = new ArrayList<MascoDueno>();
        for (Mascota mascota : listMasco) {
            MascoDueno mascoDueno = new MascoDueno();
            mascoDueno.setNombre_mascota(mascota.getNombre()); 
            mascoDueno.setRaza(mascota.getRaza());
            mascoDueno.setEspecie(mascota.getEspecie());
            mascoDueno.setNombre_duenio(mascota.getDueno().getNombre());
            mascoDueno.setApellido_duenio(mascota.getDueno().getApellido());
            listMascoDueno.add(mascoDueno);
        }
        return listMascoDueno;
    }
    
}
