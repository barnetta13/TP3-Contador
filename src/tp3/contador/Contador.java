/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.contador;

import static tp3.contador.ContadorElectricidade.totalContaElect;
import static tp3.contador.ContadorGas.idMaiorConsumoGas;
import static tp3.contador.ContadorGas.maiorConsumoGas;

/**
 *
 * @author Daniel Martins
 */
public abstract class Contador {
    
    String identificador;
    int consumo;
    String cliente;
    
    static int contadoreselect = 0;
    
    static final int CONSUMO_POR_OMISSAO = 0;
    static final String CLIENTE_POR_OMISSAO = "N/A";
    
    public static void main(String[] args) {
        
        Object[] contentor = new Object[100];
        
        ContadorGas cgas1 = new ContadorGas("Gas","Daniel",50);
        System.out.println(cgas1);
        contentor[0] = cgas1;
        
        ContadorElectSimples celectsim1 = new ContadorElectSimples("Elect","Maria",30);
        System.out.println(celectsim1);
        contentor[1] = celectsim1;
        
        ContElectBiHorario celectbih1 = new ContElectBiHorario("Elect","Ana",20,50);
        System.out.println(celectbih1);
        contentor[2] = celectbih1;
        
        System.out.println("Contadores:");
        for (int i = 0; i < contentor.length; i++)
        {
            if (contentor[i] != null)
            {
                System.out.println(((Contador)contentor[i]).getIdentificador());
                System.out.println(((Contador)contentor[i]).getCliente());
                System.out.println();
            }
        }
        
        System.out.println("Foram criados " + totalContaElect + " contadores de electricidade.");
        System.out.println();
        
        for ( int i = 0; i < contentor.length; i++)
        {
            if (contentor[i] instanceof ContElectBiHorario)
            {
                System.out.println(contentor[i].toString());
                System.out.println();
            }
        }
        
        for (int i = 0; i < contentor.length; i++)
        {
            if (contentor[i] != null)
            {
                if (contentor[i] instanceof ContElectBiHorario)
                {
                    System.out.println("Contador: " + ((Contador)contentor[i]).getIdentificador());
                    System.out.println("Consumo em horas de vazio: " + ((ContElectBiHorario)contentor[i]).getConsumoHorasVazio());
                    System.out.println("Consumo em horas fora de vazio: " + ((ContElectBiHorario)contentor[i]).getConsumoHorasForaVazio());
                    System.out.println();
                }
                else 
                        {
                System.out.println("Contador: " + ((Contador)contentor[i]).getIdentificador());
                System.out.println("Consumo: " + ((Contador)contentor[i]).getConsumo());
                System.out.println();
                        }
            }
        }
        
        System.out.println("O contador de gás com o consumo mais alto é de: " + maiorConsumoGas + ", correspondente ao contador " + idMaiorConsumoGas);
    }
    
    public abstract float custo();
    
    public Contador(String identificador, String cliente, int consumo)
    {
        this.identificador = identificador;
        this.cliente = cliente;
        this.consumo = consumo;
        contadoreselect++;
    }
  
    public Contador()
    {
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public float getConsumo() {
        return consumo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString()
    {
        return "Identificador: " + identificador + "\nCliente: " + cliente + "\nConsumo: " + consumo + "\n";
    }
    
}
