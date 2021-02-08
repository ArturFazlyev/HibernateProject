package auto.main;

import auto.config.HibernateSessionFactoryUtil;
import auto.model.HomeAddress;
import auto.model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NewTable {

    public static void main(String[] args) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        HomeAddress homeAddress = new HomeAddress("Spb", "Nevsky");
        Person person = new Person("Max", homeAddress);

        session.saveOrUpdate(homeAddress);
        session.saveOrUpdate(person);

        tx.commit();
        session.disconnect();
    }
}
