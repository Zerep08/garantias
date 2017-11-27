/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbm;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author sergiojc
 */
public class HibernateUtil {

      //objeto sesion factory
    private static final SessionFactory sessionFactory;

    //objeto que representa la sesion local en un hilo
    private static final ThreadLocal localSession;
    
    //Se ejecuta al iniciar el programa
    static {
        try {
            //configura el objeto de la clase configuracion de hibernate
            
            Configuration config = new Configuration() {};
            config.configure("hibernate.cfg.xml");
            
            //conforme a la configuracion se crean las habilidades protocolos de la sesion
            //builder le da contexto a sessiofactory con la configuracion
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
            applySettings(config.getProperties());
            //inicializa el session factory
            sessionFactory = config.buildSessionFactory(builder.build());
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        localSession = new ThreadLocal();
    }
    //get the session factory
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    //da la sesion local
     public static Session getLocalSession() {
        Session session = (Session) localSession.get();
        if (session == null) {
            session = sessionFactory.openSession();
            localSession.set(session);
            System.out.println("\nsesion iniciada");
        }
        return session;
    }
     //cierra la sesion local
     public static void closeLocalSession() {
        Session session = (Session) localSession.get();
        if (session != null) session.close();
        localSession.set(null);
        System.out.println("sesion cerrada\n");
    }
    
}
