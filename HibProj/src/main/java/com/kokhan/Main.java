package com.kokhan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.kokhan.Laptop.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.get(Laptop.class,2);
        System.out.println(l1);


        session.close();

        Session session1 = sf.openSession();

        Laptop l2 = session1.get(Laptop.class,2);
        System.out.println(l2);

        session1.close();

        sf.close();
    }
}

//        Student s1 = new Student();
//        s1.setrollNo(100);
//        s1.setName("Vlad");
//        s1.setAge(25);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.kokhan.Student.class);
//        cfg.configure();


// s2 = session.get(Student.class,102); //fetch data
// s1 = session.get(Student.class,100);    // the method for return/select/fetch data from DB
//session.remove(s1);             // the method for delete data from DB
//session.merge(s1);           //the method check data and if data not exist then method insert data in DB. Or if data in DB then method update data in DB

//Transaction transaction = session.beginTransaction(); // need to change our data in DB
//session.persist(s1);              // save data (create!)
//transaction.commit();   //commit our changes




//        Session session1 = sf.openSession();
//        Alien a5 = session1.get(Alien.class, 101);
//         System.out.println(a5); // if we don't use sout that's lazy fetching and we fetch the data from Alien and that's all
// but if we use it - it's called Eager fetching and we fetch data from alien and laptop
// Also we can use  @OneToMany(fetch = FetchType.EAGER) , by default FetchType.LAZY
//        session1.close();


//select * from laptop where ram=32 -> SQL
//from Laptop where ram = 32 -> HQL

//String brand = "Asus";
//
//
//Query query = session.createQuery("select brand, model from Laptop where brand like ?1");
//        query.setParameter(1,brand);
//
//List<Object[]> laptops = query.getResultList();
//
//        for (Object[] data : laptops){
//        System.out.println((String)data[0] + " " + (String) data[1]);
//        }

// Laptop l1 = session.get(Laptop.class,4);
//        System.out.println(laptops);


// 
//        Laptop laptop = session.get(Laptop.class,2);
//        Laptop laptop = session.byId(Laptop.class).getReference(2);
//        Laptop laptop = session.load(Laptop.class,2);
// System.out.println(laptop);
