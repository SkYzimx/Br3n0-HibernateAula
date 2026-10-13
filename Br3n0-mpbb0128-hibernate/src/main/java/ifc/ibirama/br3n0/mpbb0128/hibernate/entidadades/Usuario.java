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
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
    
    private Bombeiro bombeiro;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usu_id", unique = true)
    private Integer id;
    @Column(name = "usu_login", length = 20, unique = true, nullable = false)
    private String login;
    @Column(name = "usu_senha", length = 45, unique = true, nullable = false)
    private String senha;

    public Usuario(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }

    
    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario aux = (Usuario) obj;

            if (!(aux.getId().equals(this.id)) || !(aux.getLogin().equals(this.login))) {
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
