/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.TicketDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergiojc
 */
public class testGarantia {
    
    public testGarantia() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
     TicketDAO tdao=new TicketDAO();
     
             tdao.saveTicket(1, "a","b","c","d", "e");
             
            // tdao.saveTicket(int idticket, String nombre, String falla, 
         // String comentario, String correo, String status
     
     
     
     
     }
}
