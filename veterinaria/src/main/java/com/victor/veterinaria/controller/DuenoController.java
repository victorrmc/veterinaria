/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victor.veterinaria.controller;

import com.victor.veterinaria.model.Dueno;
import com.victor.veterinaria.service.IDuenoService;
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
public class DuenoController {
    
    @Autowired
    private IDuenoService duenoService;
    
    @PostMapping("/dueno/crear")
    public String createDueno(@RequestBody Dueno dueno){
        duenoService.createDueno(dueno);
        return "Se ha creado correctamente el Dueño";
    }
    
    @GetMapping("/dueno/traer")
    @ResponseBody
    public List<Dueno> listDueno(){
       return duenoService.listDueno();
    }
    
    @PutMapping("/dueno/actualizar")
    public String updateDueno(@RequestBody Dueno dueno){
        duenoService.updateDueno(dueno);
        return "Se ha actualizado correctamente el Dueño";
    }
    
    @DeleteMapping("/dueno/delete/{id}")
    public String deleteDueno(@PathVariable Long id){
        duenoService.deleteDueno(id);
        return "Se ha eliminado correctamente el Dueño";
    }

}
