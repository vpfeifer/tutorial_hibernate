package br.rc.unesp.tutorialhibernate.service;

import br.rc.unesp.tutorialhibernate.beans.Pessoa;
import br.rc.unesp.tutorialhibernate.utils.HibernateUtil;
import org.hibernate.Session;

public class PessoaService {

 /**
  * Insere uma pessoa no banco de dados.
  *
  * @param pessoa
  */
 public void inserir(Pessoa pessoa) {
  Session session = HibernateUtil.getSessionFactory().getCurrentSession();
  session.beginTransaction();
  
  session.save(pessoa);

  session.getTransaction().commit();
 }
}