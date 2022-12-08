package co.edu.unab.administrador_com.modelos;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("propietarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PropietarioModel {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private float telefono;
    private String correo;
    private List<String> telefonos;
    private Object direccion;
 
    
}
