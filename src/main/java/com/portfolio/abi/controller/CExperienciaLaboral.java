package com.portfolio.abi.controller;

import com.portfolio.abi.entity.ExperienciaLaboral;
import com.portfolio.abi.service.SExperienciaLaboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperienciaLaboral {
    
    @Autowired
    SExperienciaLaboral expServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <ExperienciaLaboral> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public ExperienciaLaboral verExperienciaLaboral(@PathVariable int id){
        return expServ.buscarExperienciaLaboral(id);
    }
    
    @PostMapping("/crear")
    public void agregarExperienciaLaboral(@RequestBody ExperienciaLaboral experienciaLaboral){
        expServ.crearExperienciaLaboral(experienciaLaboral);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarExperienciaLaboral(@PathVariable int id){
        expServ.borrarExperienciaLaboral(id);
    }

    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody ExperienciaLaboral experienciaLaboral){
        expServ.editarExperiencia(experienciaLaboral);
    }
    
}
