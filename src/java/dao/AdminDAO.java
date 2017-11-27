/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


//import net.sf.ehcache.hibernate.HibernateUtil;
import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Admin;




/**
 *
 * @author ol
 */
public class AdminDAO {
      Session session;
    
    public AdminDAO(){
       
        session=HibernateUtil.getLocalSession();
    }
    
    public  Admin getAdminById(int id){
        return (Admin)session.load(Admin.class, id);
    }
    
  public void saveTicket(int idadmin, String usuario, String password){
        Admin admin=new Admin();
        admin.setIdAdmin(idadmin);
        admin.setPassword(password);
        admin.setUsuario(usuario);
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(admin);
            transaccion.commit();
           
        }catch(Exception e){
            
        }finally{
            
        }
     
    }
}