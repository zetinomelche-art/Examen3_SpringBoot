package com.example.Examen3_EmersonZ.controlador;

import com.example.Examen3_EmersonZ.interfaces.IEmpleadoService;
import com.example.Examen3_EmersonZ.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://127.0.0.1")
@RestController
@RequestMapping("examen3")

public class Controlador {

    @Autowired
    private IEmpleadoService IEmpleadoService;
    @Autowired
    private ResourceLoader resourceLoader;


    @PostMapping("/guardar")
    public ResponseEntity<?> guardarEmpleado(@RequestBody Empleado empleado) {
        int respuesta = IEmpleadoService.Guardar(empleado);

        if (respuesta == 1) {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Empleado guardado exitosamente");
        } else {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error al guardar el empleado");
        }
    }

    @GetMapping("/listarEmpleados")
    public List<Empleado> verTodos(){
        return IEmpleadoService.ListarEmpleados();
    }

    @GetMapping("/editar/{id}")
    public ResponseEntity<?> editarEmpleado(@PathVariable("id") int id) {
        Optional<Empleado> empleado = IEmpleadoService.ListarPorId(id);
        if (empleado.isPresent()) {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(empleado.get());
        }else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("No existe el empleado");
        }
    }


    @DeleteMapping("/elim/{id}")
    public ResponseEntity<Void> elimiarEmpleado(@PathVariable("id") int id) {
        Optional<Empleado> empleado = IEmpleadoService.ListarPorId(id);

        if (empleado.isPresent()) {
            IEmpleadoService.Eliminar(empleado.get());
            return ResponseEntity.ok().build(); //200 OK
        }else  {
            return ResponseEntity.notFound().build();//Not found
        }
    }


}
