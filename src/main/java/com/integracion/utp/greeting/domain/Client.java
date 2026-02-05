package com.integracion.utp.greeting.domain;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Client {
    private Integer id;
    private String nombre;
    private String correo;

    public Client() {}

    public Integer getId() {
        return id;
    }
    public void setId(Integer id)  {
        if (id==null){
            throw new NullPointerException("El id del cliente es null");
        }else if (id>0) {
            this.id = id;
        }else{
            throw new IllegalArgumentException("El id del cliente es negativo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
