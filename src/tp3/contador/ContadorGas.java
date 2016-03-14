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
public class ContadorGas extends Contador{
    static int totalContadoresGas = 0; 
    static int contadorGasId = 1;
    private static float custounitario = (float) 0.8;
    
    public static float maiorConsumoGas = 0;
    public static String idMaiorConsumoGas = null;
    
    public ContadorGas(String identificador, String cliente, int consumo)
    {
        this.identificador = identificador + "-" + contadorGasId;
        this.cliente = cliente;
        this.consumo = consumo;
        contadorGasId++;
        totalContadoresGas++;
        if (consumo > maiorConsumoGas)
        {
            maiorConsumoGas = consumo;
            idMaiorConsumoGas = this.identificador;
        }
    }
    
    @Override
        public String toString()
    {
        return "Identificador: " + identificador + "\nCliente: " + cliente + "\nConsumo: " + consumo + "\n";
    }
    
    @Override
    public void setConsumo(int consumo)
    {
        this.consumo = consumo;
        if (consumo > maiorConsumoGas)
        {
            maiorConsumoGas = consumo;
        }
    }
    
    public float getMaiorConsumoGas()
    {
        return maiorConsumoGas;
    }
    
    @Override
    public float custo()
    {
        return (custounitario * getConsumo());
    }
}
