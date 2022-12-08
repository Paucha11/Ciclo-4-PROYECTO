package co.edu.unab.administrador_com.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.administrador_com.modelos.PropietarioModel;
import co.edu.unab.administrador_com.repositorios.PropietarioRepositorio;

@RestController
@RequestMapping(path="/propietarios")

public class PropietarioControlador {


    @Autowired
    PropietarioRepositorio propietarioRepositorio;

    @GetMapping
    public List<PropietarioModel>getAllPropietarios(){
        return propietarioRepositorio.findAll();
    }
    @PostMapping
    public PropietarioModel savePropietario(@RequestBody PropietarioModel propietario){
           return propietarioRepositorio.save(propietario);
    }
    @DeleteMapping(path ="/{id}")
    public void deletePropietarioById(@PathVariable("id")String id){
        propietarioRepositorio.deleteById(id);
    }
    @GetMapping(path ="/{id}")
    public Optional<PropietarioModel>findPropietarioById(@PathVariable("id")String id){
        return propietarioRepositorio.findById(id);
        
}
}