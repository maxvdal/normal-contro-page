package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
//ESTUDIAR LOGICA DE PROGRAMACION
@Data
@Entity
@Table(name="personas")
public class Persona implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idpersonas;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotEmpty
    @Email
    private String email;

    private String telefono;
}
