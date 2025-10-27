package com.example.Examen3_EmersonZ.interfaces;

import com.example.Examen3_EmersonZ.modelo.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface IEmpleado extends CrudRepository<Empleado,Integer> {

    // 1 Cantidad total de empleados
    @Query("SELECT COUNT(e) FROM Empleado e")
    Long contarEmpleados();

    // 2 Cantidad de empleados por puesto
    @Query("SELECT e.puesto AS puesto, COUNT(e) AS cantidad FROM Empleado e GROUP BY e.puesto")
    List<Map<String, Object>> empleadosPorPuesto();

    // 3 Cantidad de empleados por estado
    @Query("SELECT e.estado AS estado, COUNT(e) AS cantidad FROM Empleado e GROUP BY e.estado")
    List<Map<String, Object>> empleadosPorEstado();

    // 4 Promedio de salarios
    @Query("SELECT AVG(e.salario) FROM Empleado e WHERE e.estado = 'Activo'")
    Double promedioSalario();


    // 5 Antigüedad promedio (en años)
    @Query("SELECT AVG(YEAR(CURRENT_DATE) - YEAR(e.fecha_contratacion)) FROM Empleado e")
    Double antiguedadPromedio();

}
