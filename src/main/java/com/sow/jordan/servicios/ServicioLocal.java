/*
 * Paquete que contiene los servicios.
 */
package com.sow.jordan.servicios;

import com.sow.jordan.modelos.Comentario;
import com.sow.jordan.modelos.Local;
import com.sow.jordan.modelos.Lugar;
import com.sow.jordan.modelos.Servicio;
import com.sow.jordan.modelos.Transporte;
import com.sow.jordan.modelos.Usuario;
import java.util.List;

/**
 * Interfaz de los servicios de los locales.
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
public interface ServicioLocal {
    
    /**
     * Método para guardar la información de los locales.
     * @param local El local a guardar.
     */
    void guardarLocal(Local local);
    
    /**
     * Método para guardar la información de los lugares.
     * @param lugar El lugar a guardar.
     */
    void guardarLugar(Lugar lugar);
    
    /**
     * Método para guardar la información de los servicios.
     * @param servicio El servicio a guardar.
     */
    void guardarSercivio(Servicio servicio);
    
    /**
     * Método para guardar la información de los transportes.
     * @param transporte El transporte a guardar.
     */
    void guardarTransporte(Transporte transporte);
    
    /**
     * Método que carga la información de los locales.
     * @return Una lista con la información.
     */
    List<Local> cargarLocales();
    
    /**
     * Metodo que carga ls informacion de los lugares
     * @return 
     */
    List<Lugar> cargarLugares();
    
    /**
     * Método que carga la información de los servicios
     * @return Una lista con la información
     */
    List<Servicio> cargarServicios();
    
    /**
     * Método que carga la información de los tranportes.
     * @return Una lista con la información.
     */
    List<Transporte> cargarTransportes();
    
    /**
     * Método para eliminar un local.
     * @param local El local a eliminar.
     */
    void eliminarLocal(Local local);
    
    /**
     * Método que busca un local mediante su id.
     * @param id El id del local.
     * @return Un local.
     */
    Local buscarLocal(int id);
    
    /**
     * Método que busca un lugar mediante su id.
     * @param id El id del lugar.
     * @return Una lista con la información
     */
    Lugar buscarLugar(int id);
    
    /**
     * Método que busca un transporte mediante su id.
     * @param id El id del transporte.
     * @return Un transporte.
     */
    Transporte buscarTransporte(int id);
    
    /**
     * Método que regres una lista de los tipos de transporte.
     * @return Una lista con la información.
     */
    List<String> tipos();
    
    /**
     * Método que regresa los transportes de acuerdo al tipo seleccionado.
     * @param tipo El tipo de transporte
     * @return Una lista con la información.
     */
    List<Transporte> porTipos(String tipo);
    
    /**
     * Método que carga los comentarios del local que resibe como parametro.
     * @param local El local que se desea obtener los comentarios.
     * @return Una lista con la información.
     */
    List<Comentario> cargarComentarios(Local local);
    
    /**
     * Método que busca el comentario de un local que fuere realizado por un
     * usuario.
     * @param local El local del que se desea obtener el comentario.
     * @param usuario El usuario que realiza el comentario.
     * @return Un comentario.
     */
    Comentario buscarComentario(Local local, Usuario usuario);
    
    /**
     * Método que regresa los comentarios de un local, que no sean del usuario 
     * que recibe como parametro.
     * @param local El local.
     * @param usuario El usuario del que no se agrega el comentario.
     * @return Una lista con la información.
     */
    List<Comentario> comentarios(Local local, Usuario usuario);
    
    /**
     * Método que elimina comenmtario de un local.
     * @param local El local.
     * @param id  El comentario a eliminar.
     * @return Los comentarios del local sin el comentario a eliminar.
     */
    List<Comentario> eliminarComentario(Local local, Integer id);
    
}
