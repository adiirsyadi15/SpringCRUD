package crud.com.springcrudmahasiswa.DAOImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import crud.com.springcrudmahasiswa.DAO.GeneralDAO;

public class GeneralDAOImpl implements GeneralDAO{

	protected EntityManager em;
	
	public GeneralDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SpringCRUDMahasiswa");
		em = emf.createEntityManager();
	}
	@Override
	public void insert(Object object) {
		try {
			em.getTransaction().begin();
			em.persist(object);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(Object object) {
		try {
			em.getTransaction().begin();
			em.merge(object);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(Object object) {
		try {
			em.getTransaction().begin();
			em.remove(object);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

}
