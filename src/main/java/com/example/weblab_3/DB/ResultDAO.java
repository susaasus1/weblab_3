package com.example.weblab_3.DB;

import com.example.weblab_3.points.Result;
import com.example.weblab_3.utilities.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ResultDAO {
    public void save(Result result){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(result);
        transaction.commit();
        session.close();
    }

    public List<Result> findAll(){
        System.out.println(HibernateSessionFactory.getSessionFactory().openSession()
                .createQuery("From Result"));
        List<Result> results = HibernateSessionFactory.getSessionFactory().openSession()
                .createQuery("From Result").list();
        return results;
    }

    public void deleteAll(){
        String stringQuery = "DELETE FROM Result";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();
        session.createQuery(stringQuery).executeUpdate();
        session.getTransaction().commit();

        session.close();
    }
}