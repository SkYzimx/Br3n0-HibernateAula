    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.br3n0.mpbb0128.hibernate.entidadades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author aluno
 */

@Entity
@Table(name="Viatura")
public class Viatura {
        @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="via_id", unique= true)
    private Integer id;
    @Column(name="via_placa", length = 45, unique = true, nullable = false)
    private String placa;
    @Column(name="via_ultima_revisao",nullable = false)
    private LocalDate ultimaRevisao;
    @Column(name="via_combustivel", length = 45,  nullable = false)
    private String combustivel;
    @Column(name="via_km", nullable = false)
    private Integer km;

    public Viatura() {
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setUltimaRevisao(LocalDate ultimaRevisao) {
        this.ultimaRevisao = ultimaRevisao;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public LocalDate getUltimaRevisao() {
        return ultimaRevisao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public Integer getKm() {
        return km;
    }


    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura) obj;

            if (!(aux.getId().equals(this.id)) || !(aux.getPlaca().equals(this.placa))) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    } 

    

}