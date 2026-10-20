/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.br3n0.mpbb0128.hibernate.entidadades;


import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Bombeiro")
public class Bombeiro {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="bom_id", unique= true)
    private Integer id;
    @Column(name="bom_cpf", length = 11, unique = true, nullable = false)
    private String cpf;
    @Column(name="bom_data_nascimento",  nullable = false)
    private LocalDate dataNascimeto;
    @Column(name="bom_nome_completo", length = 45,  nullable = false)
    private String nome;
    @Column(name="bom_nome_guerra", length = 45, unique = true,  nullable = false)
    private String nomeGuerra;
//    @OneToOne(mappedBy = "bombeiro")
//    private Usuario usuario;
//    @OneToMany(mappedBy = "bombeiro")
//    private Set<TelefoneContato> telefone = new HashSet<TelefoneContato>();
//    @ManyToMany(mappedBy = "bombeiro")
//    @JoinTable(name = "Bombeiro_has_Patente", joinColumns = @JoinColumn(name = "bom_id"),inverseJoinColumns = @JoinColumn(name = "pat_id"))
//    private Set<Patente> patente = new HashSet<Patente>();
    
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
    @Override
    public int hashCode() {
        return getClass().hashCode();
    } 
    
}
