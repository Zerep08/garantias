/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


//import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Ticket;
import hbm.HibernateUtil;
import java.util.List;


/**
 *
 * @author ol
 */
public class TicketDAO {
     Session session;
    
    public TicketDAO(){
        session=HibernateUtil.getLocalSession();
    }
    
    public  Ticket getTicketById(int id){
        return (Ticket)session.load(Ticket.class, id);
    }
    
        public List<Ticket> getAllRows() {
        List<Ticket> listaTipo = (List<Ticket>) session.createCriteria(Ticket.class).list();
        return listaTipo;
    }
    
  public void saveTicket(int idticket, String nombre, String falla, 
          String comentario, String correo, String status){
        Ticket ticket=new Ticket();
        //ticket.setIdticket(idticket);
        ticket.setNombre(nombre);
        ticket.setComentario(comentario);
        ticket.setCorreo(correo);
        ticket.setFalla(falla);
        ticket.setStatus(status);
        
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(ticket);
            transaccion.commit();
            
        }catch(Exception e){
            
        }finally{
            
        }
        
    }
}