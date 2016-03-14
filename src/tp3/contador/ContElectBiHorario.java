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
public class ContElectBiHorario extends ContadorElectricidade{

    float consumoHorasVazio;
    float consumoHorasForaVazio;
    
    private static float custoHorasVazio = 0.066f;
    private static float custoHorasForaVazio = 0.14f;
    
    static final int CONSUMO_HORAS_VAZIO_POR_OMISSAO = 0;
    static final int CONSUMO_HORAS_FORA_VAZIO_POR_OMISSAO = 0;
    
    public ContElectBiHorario(String identificador, String cliente, int consumoHorasVazio, int consumoHorasForaVazio){
    this.identificador = identificador + "-" + contadorElectId;
    this.cliente = cliente;
    this.consumoHorasVazio= consumoHorasVazio;
    this.consumoHorasForaVazio = consumoHorasForaVazio;
    totalContaElect++;
    contadorElectId++;
    }
    
    public ContElectBiHorario() {
    this.identificador = "Elect" + "-" + contadorElectId;
    this.cliente = CLIENTE_POR_OMISSAO;
    this.consumoHorasVazio= CONSUMO_HORAS_VAZIO_POR_OMISSAO;
    this.consumoHorasForaVazio = CONSUMO_HORAS_FORA_VAZIO_POR_OMISSAO;
    totalContaElect++;
    contadorElectId++;
    }
    
    public String toString()
    {
        return "Identificador: " + identificador + "\nCliente: " + cliente + "\nConsumo Hora Vazio: " + consumoHorasVazio + "\nConsumo Horas Fora Vazio: " + consumoHorasForaVazio + "\n";
    }
    
    public float getConsumoHorasForaVazio()
    {
        return consumoHorasForaVazio;
    }
    
    public float getConsumoHorasVazio()
    {
        return consumoHorasVazio;
    }
          
    @Override
    public float custo() {
        
        float custo;
        custo = consumoHorasVazio * custoHorasVazio + consumoHorasForaVazio * custoHorasForaVazio;
        return custo;
    }
}
