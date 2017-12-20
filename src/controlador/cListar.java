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
            String sql="SELECT (V.ID_VENTA, V.FECHA_CONTRATACION, V.FECHA_TERMINO_OPCIONAL, V.FECHA_TERMINO_CONTRATO,\n" +
"    TV.ID__TIPO, V.VALOR_VENTA, V.RUT) FROM VENTA V JOIN TIPO_VENTA TV";
            PreparedStatement preparedStatement =Conexion.obtenerInstancia().prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery(); 
            lista = new ArrayList();
            while (rs.next()){
                ventaObjeto = new Venta();
                ventaObjeto.setId(rs.getInt("V.ID_VENTA"));
                ventaObjeto.setFechaContratacion(rs.getString("V.FECHA_CONTRATACION"));
                
                
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
