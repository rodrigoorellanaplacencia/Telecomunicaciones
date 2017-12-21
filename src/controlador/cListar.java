/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Venta;

/**
 *
 * @author pase
 */
public class cListar {
    private ArrayList<Venta> lista;
    private Venta ventaObjeto;
    public ArrayList<Venta> listarVentas() {
        String sql="SELECT ID_VENTA, FECHA_CONTRATACION, FECHA_TERMINO_OPCIONAL, FECHA_TERMINO_CONTRATO, TIPO_VENTA_ID_TIPO, VALOR_VENTA, RUT FROM VENTA";
        Statement s;
        try {
            
            s = Conexion.obtenerInstancia().createStatement();
            System.out.println(" Cargando datos...");
            ResultSet rs = s.executeQuery(sql); 
            lista = new ArrayList();
            ventaObjeto = new Venta();
            while (rs.next()){
                ventaObjeto.setId(rs.getInt("ID_VENTA"));
                ventaObjeto.setFechaContratacion(rs.getString("FECHA_CONTRATACION"));
                ventaObjeto.setFechaTerminoOp(rs.getString("FECHA_TERMINO_OPCIONAL"));
                ventaObjeto.setFechaTerminoCon(rs.getString("FECHA_TERMINO_CONTRATO"));
                ventaObjeto.setTipoVenta(rs.getInt("TIPO_VENTA_ID_TIPO"));
                ventaObjeto.setValorVenta(rs.getInt("VALOR_VENTA"));
                ventaObjeto.setRut(rs.getString("RUT"));
                
                lista.add(ventaObjeto);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(cListar.class.getName()).log(Level.SEVERE, null, ex);
                return null;
        }
    }
}
