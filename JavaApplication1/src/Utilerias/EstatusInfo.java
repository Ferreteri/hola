/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

/**
 *
 * @author sistema
 */
public class EstatusInfo {
    
    
      public enum MenuPrincipal
        {
            Ventas(0),
            Admin(1), 
            Info(2);
            
            private final int value;

             private MenuPrincipal(int value) {
             this.value = value;}
        }
      
      
       public enum TipoUsuario
        {
            Administrador(0),
            Vendedor(1), 
            Cajero(2);
            private final int value;

             private TipoUsuario(int value) {
             this.value = value;}
        }
      
}
