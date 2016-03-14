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
public class ContadorElectSimples extends ContadorElectricidade{
    float potenciaContratada;
    
    private static float limitePotencia = 6.9f;
    private static float tarifaInferior = 0.13f;
    private static float tarifaSuperior = 0.16f;
    
    
    public ContadorElectSimples(String identificador, String cliente, int consumo)
    {
        this.identificador = identificador + "-" + contadorElectId;
        this.cliente = cliente;
        this.consumo = consumo;
        totalContaElect++;
        contadorElectId++;
    }
    @Override
    public float custo()
    {
        float custo = 0;
        if (potenciaContratada < limitePotencia)
        {
            custo = consumo * tarifaInferior;
        }
        if (potenciaContratada >= limitePotencia)
        {
            custo = consumo * tarifaSuperior;
        }
        return custo;
    }
}
