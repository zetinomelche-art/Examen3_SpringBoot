package com.example.Examen3_EmersonZ.service;

import com.example.Examen3_EmersonZ.interfaces.IEmpleado;
import com.example.Examen3_EmersonZ.interfaces.IEmpleadoService;
import com.example.Examen3_EmersonZ.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private IEmpleado data;

    @Override
    public List<Empleado> ListarEmpleados() {
        return (List<Empleado>)data.findAll();
    }

    @Override
    public Optional<Empleado> ListarPorId(int id) {
        return data.findById(id);
    }

    @Override
    public int Guardar(Empleado empleado) {
        int respuesta = 0;
        Empleado Respuesta =(Empleado) data.save(empleado);

        if (Respuesta != null) {
            respuesta = 1;}
        return respuesta;

    }

    @Override
    public void Eliminar(Empleado empleado) {
        data.delete(empleado);
    }
}
