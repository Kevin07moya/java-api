package com.prueba.crud.controller;

import com.prueba.crud.modelo.Persona;
import com.prueba.crud.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;
    @PostMapping("/nuevo")
    public Persona newperson(@RequestBody Persona newperson){
        return this.personaService.newPerson(newperson);
    }
    @GetMapping("/mostrar")
    public Iterable<Persona> getAll(){
        return this.personaService.getAll();
    }
    @PostMapping("/update/{id}")
    public Persona updateperson(@RequestBody Persona persona){
        return this.personaService.modifyPerson(persona);
    }
    @PostMapping(value ="/{id}")
    public Boolean deletePersona(@PathVariable(value = "id") Long id){
        return this.personaService.deletePerson(id);
    }
}
