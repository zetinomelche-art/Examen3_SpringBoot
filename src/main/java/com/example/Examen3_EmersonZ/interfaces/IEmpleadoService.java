package com.example.Examen3_EmersonZ.interfaces;

import com.example.Examen3_EmersonZ.modelo.Empleado;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IEmpleadoService {
    public List<Empleado> ListarEmpleados();
    public Optional<Empleado> ListarPorId(int id);
   public int Guardar(Empleado empleado);
   public void Eliminar(Empleado empleado);

    // Estadísticas
    long contarEmpleados();
    List<Map<String, Object>> empleadosPorPuesto();
    List<Map<String, Object>> empleadosPorEstado();
    double promedioSalario();
    double antiguedadPromedio();


}
