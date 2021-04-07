package Com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student st =new Student();
        st.setName("abhi");
        st.setId(2);
        st.setAddress("Hyd");



        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(stgit );
        tx.commit();
        System.out.println(factory);
        session.close();


    }


}
