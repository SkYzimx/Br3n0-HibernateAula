/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.br3n0.mpbb0128.hibernate.entidadades;

import java.time.LocalDate;

public class Bombeiro {

    private Integer id;
    private String cpf;
    private LocalDate dataNascimeto;
    private String nome;
    private String nomeGuerra;

    public Bombeiro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(LocalDate dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;

            if (!(aux.getId().equals(this.id)) || !(aux.getCpf().equals(this.cpf))) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }
    }
}
