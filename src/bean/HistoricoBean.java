/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author 104935
 */
public class HistoricoBean {
    private int totalCarrosAbastecidos;
    private Double valorTotalArrecadado,totalLitrosGasolina,totalLitrosEtanol,totalLitrosDiesel;

    public int getTotalCarrosAbastecidos() {
        return totalCarrosAbastecidos;
    }

    public void setTotalCarrosAbastecidos(int totalCarrosAbastecidos) {
        this.totalCarrosAbastecidos = totalCarrosAbastecidos;
    }

    public Double getValorTotalArrecadado() {
        return valorTotalArrecadado;
    }

    public void setValorTotalArrecadado(Double valorTotalArrecadado) {
        this.valorTotalArrecadado = valorTotalArrecadado;
    }

    public Double getTotalLitrosGasolina() {
        return totalLitrosGasolina;
    }

    public void setTotalLitrosGasolina(Double totalLitrosGasolina) {
        this.totalLitrosGasolina = totalLitrosGasolina;
    }

    public Double getTotalLitrosEtanol() {
        return totalLitrosEtanol;
    }

    public void setTotalLitrosEtanol(Double totalLitrosEtanol) {
        this.totalLitrosEtanol = totalLitrosEtanol;
    }

    public Double getTotalLitrosDiesel() {
        return totalLitrosDiesel;
    }

    public void setTotalLitrosDiesel(Double totalLitrosDiesel) {
        this.totalLitrosDiesel = totalLitrosDiesel;
    }
    
}
