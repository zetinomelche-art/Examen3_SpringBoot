package com.example.Examen3_EmersonZ.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_empleado;

    private String nombre;
    private String apellido;

    @Column(unique = true, length = 10)
    private String dui;

    private String telefono;
    private String correo;
    private String direccion;
    private LocalDate fecha_contratacion;
    private String puesto;
    private Double salario;
    private String estado;
    // Constructor vacío (requerido por JPA)
    public Empleado() {

    }

    public Empleado(String nombre,
                    String apellido,
                    String dui,
                    String telefono,
                    String correo,
                    String direccion,
                    LocalDate fecha_contratacion,
                    String puesto,
                    Double salario,
                    String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_contratacion = fecha_contratacion;
        this.puesto = puesto;
        this.salario = salario;
        this.estado = estado;
    }


    public Empleado(Integer id_empleado,
                    String nombre,
                    String apellido,
                    String dui,
                    String telefono,
                    String correo,
                    String direccion,
                    LocalDate fecha_contratacion,
                    String puesto,
                    Double salario,
                    String estado) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_contratacion = fecha_contratacion;
        this.puesto = puesto;
        this.salario = salario;
        this.estado = estado;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(LocalDate fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
