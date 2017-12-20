/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
    
        
        try {
            String sql="SELECT (ID_VENTA, FECHA_CONTRATACION, FECHA_TERMINO_OPCIONAL, FECHA_TERMINO_CONTRATO,\n" +
"    ID_TIPO, VALOR_VENTA, RUT) FROM VENTA";
            PreparedStatement preparedStatement =Conexion.obtenerInstancia().prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery(); 
            lista = new ArrayList();
            while (rs.next()){
                ventaObjeto = new Venta();
                ventaObjeto.setId(rs.getInt("ID_VENTA"));
                ventaObjeto.setFechaContratacion(rs.getString("FECHA_CONTRATACION"));
                ventaObjeto.setFechaTerminoOp(rs.getString("FECHA_TERMINO_OPCIONAL"));
                ventaObjeto.setFechaTerminoCon(rs.getString("FECHA_TERMINO_CONTRATO"));
                ventaObjeto.setTipoVenta(rs.getInt("ID_TIPO"));
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
