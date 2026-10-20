/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.br3n0.mpbb0128.hibernate;

import ifc.ibirama.br3n0.mpbb0128.hibernate.entidadades.Bombeiro;
import ifc.ibirama.br3n0.mpbb0128.hibernate.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Bombeiro bombeiro01 = new Bombeiro();
        
        bombeiro01.setCpf("12345678900");
        bombeiro01.setNome("Fulano da Silva");
        bombeiro01.setNomeGuerra("Silva");
        bombeiro01.setDataNascimeto(LocalDate.of(2000,Month.MARCH, 14));             
        
        Transaction transacao = null;
        try {
            transacao = session.beginTransaction();
            
            session.persist(bombeiro01);
            transacao.commit();
            
        } catch (Exception e) {
            if (transacao != null) {
                transacao.rollback();
            }
        }
 
        System.out.println("Conexão estabelecida com  muiticissisimo sucesso");
        HibernateUtil.shutdown();
        session.close();
    }
}
