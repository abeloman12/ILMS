/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Controller.JDBC;
import Entity.Librarian;

/**
 *
 * @author biruk
 */
public class Test {
    
    public static void main(String[] args)
    {
        JDBC conn = new JDBC();
        
        String username = "Abel Mandefro";
        String password = "123456";
        
        Object ob = conn.login(username, password);
        
        
        if (ob.getClass().toString().equals("class Entity.Librarian"))
        {
            Librarian lib = (Librarian) ob;
            System.out.print(lib.getName());
            System.out.print(lib.getEmail());
        }
        
        else if (ob.getClass().toString().equals("class Entity.Administrator"))
        {
            
        }
        
        else
        {
            
        }
            
    }
    
}
