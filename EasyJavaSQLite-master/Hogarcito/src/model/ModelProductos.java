/*
 * Copyright (C) 2015 Steven Rod.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package model;

/**
 *
 * @author Steven
 */
public class ModelProductos {

    public String idProducto;
    public String nombre;
    public String descripcion;
    public String cantidad;
    public String cantidad_minima;
    public String cantidad_maxima;
    public String fecha_vencimiento;
    public String usuario_registra;
    public String usuario_actualiza;
    public String unidad_medida;
    
    public ModelProductos() {
    }

    //Constructor ModelProductos SobreCargado Minimo
    public ModelProductos(String idProducto, String nombre, String descripcion, String cantidad, String unidad_medida) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.unidad_medida = unidad_medida;
    }
    //Constructor ModelProductos SobreCargado Maximo
    public ModelProductos(String idProducto, String nombre, String descripcion, String cantidad, String cantidad_minima, String cantidad_maxima, String fecha_vencimiento, String usuario_registra, String usuario_actualiza, String unidad_medida) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.cantidad_minima = cantidad_minima;
        this.cantidad_maxima = cantidad_maxima;
        this.fecha_vencimiento = fecha_vencimiento;
        this.usuario_registra = usuario_registra;
        this.usuario_actualiza = usuario_actualiza;
        this.unidad_medida = unidad_medida;
    }
    //=============================================================================

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidad_minima() {
        return cantidad_minima;
    }

    public void setCantidad_minima(String cantidad_minima) {
        this.cantidad_minima = cantidad_minima;
    }

    public String getCantidad_maxima() {
        return cantidad_maxima;
    }

    public void setCantidad_maxima(String cantidad_maxima) {
        this.cantidad_maxima = cantidad_maxima;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getUsuario_registra() {
        return usuario_registra;
    }

    public void setUsuario_registra(String usuario_registra) {
        this.usuario_registra = usuario_registra;
    }

    public String getUsuario_actualiza() {
        return usuario_actualiza;
    }

    public void setUsuario_actualiza(String usuario_actualiza) {
        this.usuario_actualiza = usuario_actualiza;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
    
    
    
}
