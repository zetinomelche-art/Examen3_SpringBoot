package com.example.Examen3_EmersonZ.interfaces;

import com.example.Examen3_EmersonZ.modelo.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleado extends CrudRepository<Empleado,Integer> {
}
