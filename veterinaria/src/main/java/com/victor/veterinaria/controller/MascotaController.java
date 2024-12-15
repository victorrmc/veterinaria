/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victor.veterinaria.controller;

import com.victor.veterinaria.dto.MascoDueno;
import com.victor.veterinaria.model.Mascota;
import com.victor.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
     @Autowired
    private IMascotaService mascoService;
    
    @PostMapping("/masco/crear")
    public String createMascota(@RequestBody Mascota masco){
        mascoService.createMascota(masco);
        return "Se ha creado correctamente la Mascota";
    }
    
    @GetMapping("/masco/traer")
    @ResponseBody
    public List<Mascota> listMascota(){
       return mascoService.listMascota();
    }
    
    @PutMapping("/masco/actualizar")
    public String updateMascota(@RequestBody Mascota masco){
        mascoService.updateMascota(masco);
        return "Se ha actualizado correctamente la Mascota";
    }
    
    @DeleteMapping("/masco/delete/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascoService.deleteMascota(id);
        return "Se ha eliminado correctamente la Mascota";
    }
    
    @GetMapping("/masco/caniche")
    @ResponseBody
    public List<Mascota> listCaniche(){
        return mascoService.listCaniche();
    }
    @GetMapping("/masco/mascoDueno")
    @ResponseBody
    public List<MascoDueno> listMascoDueno(){
        return mascoService.listMascoDueno();
    }
    
     //listar mascotas que sean perros y caniches
//    public List<Mascota> listCaniche();
//    //listar dto MascoMascota
//    public List<MascoDeuno> listMascoMascota();
//    //CRUD
//    public void createMascota(Mascota masco);
//    public List<Mascota> listMascota();
//    public void updateMascota(Mascota masco);
//    public void deleteMascota(Mascota masco);
//    
//    //listar mascotas que sean perros y caniches
//    public List<Mascota> listCaniche();
//    //listar dto MascoMascota
//    public List<MascoDeuno> listMascoMascota();
}
