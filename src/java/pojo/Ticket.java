/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author ol
 */


@Entity
@Table(name="ticket",catalog="garantias")
public class Ticket {
    @Id @GeneratedValue
    @Column(name="idticket")
    private  int idticket;
    
    @Column(name="nombre",nullable=false)
    private String nombre;
    
    @Column(name="falla",nullable=false)
    private String falla;
    
    @Column(name="comentario",nullable=false)
    private String comentario;
    
    @Column(name="correo",nullable=false)
    private String correo;
    
    @Column(name="status",nullable=false)
    private String status;

    /**
     * @return the idticket
     */
    public int getIdticket() {
        return idticket;
    }

    /**
     * @param idticket the idticket to set
     */
    public void setIdticket(int idticket) {
        this.idticket = idticket;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the falla
     */
    public String getFalla() {
        return falla;
    }

    /**
     * @param falla the falla to set
     */
    public void setFalla(String falla) {
        this.falla = falla;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }


    
}