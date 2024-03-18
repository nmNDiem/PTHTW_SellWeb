/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nmnd.hibernatedemo;

//import com.nmnd.pojo.Category;
import com.nmnd.pojo.Product;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        try (Session s = HibernateUtils.getFactory().openSession()) {
            Query q = s.createNamedQuery("Product.findAll");
            
            List<Product> products = q.getResultList();
            products.forEach(p -> System.out.println(p.getName()));
            
        }
    }
}
