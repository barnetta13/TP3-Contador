/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.contador;

/**
 *
 * @author Daniel Martins
 */
public abstract class ContadorElectricidade extends Contador{
    
        static int totalContaElect = 0;
        static int contadorElectId = 1;
        
        @Override
        public String toString()
    {
        return "Identificador: " + identificador + "\nCliente: " + cliente + "\nConsumo: " + consumo + "\n";
    }
    
  }
