package co.edu.unab.administrador_com.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.administrador_com.modelos.PropietarioModel;

@Repository
public interface PropietarioRepositorio extends MongoRepository<PropietarioModel,String>{
    
}
