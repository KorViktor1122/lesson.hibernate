package v.korneev.hubernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = null;
        try {


        } catch (Exception e){
            e.printStackTrace();
        } finally {
            {
                factory.close();
                if ((session != null));
                session.close();
            }
        }
    }
}
