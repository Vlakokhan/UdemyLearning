package com.kokhan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Roq");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Apple");
        l2.setModel("Mac");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Acer");
        l3.setModel("Nitro 5");
        l3.setRam(8);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Vladyslav");
        a1.setTech("Java");


        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Vasyl");
        a2.setTech("JavaScript");


        Alien a3 = new Alien();
        a3.setAid(103);
        a3.setAname("Roman");
        a3.setTech("Python");


        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l2,l3));
        a3.setLaptops(Arrays.asList(l1));

        l1.setAliens(Arrays.asList(a1,a3));
        l2.setAliens(Arrays.asList(a1,a2));
        l3.setAliens(Arrays.asList(a2));




        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.kokhan.Alien.class)
                .addAnnotatedClass(com.kokhan.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();


        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);
        session.persist(a3);

        transaction.commit();

        Alien a5 = session.get(Alien.class,102);
        System.out.println(a5);

        session.close();
        sf.close();

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
    }
}