package hibernateConnectivity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAO {

	public DAO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
								addAnnotatedClass(Book.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating Book Object.....");
			Book book1 = new Book(1,"OOPs Concept","Kishan Sharma");
			Book book2 = new Book(2,"java fundamental","Chunki Sharma");
			
			session.beginTransaction();
			
			System.out.println("Saving Book Object");
			
			session.save(book1);
			
			session.save(book2);
			
			session.beginTransaction().commit();
			
			System.out.println("Done....");
			
					

	}finally {
		session.close();
		
		factory.close();
	}
		
	}

}
