package crud.com.springcrudmahasiswa.DAOImpl;

import java.util.List;

import crud.com.springcrudmahasiswa.DAO.JurusanDAO;
import crud.com.springcrudmahasiswa.model.Jurusan;

public class JurusanDAOImpl extends GeneralDAOImpl implements JurusanDAO{

	public JurusanDAOImpl() {
		super();
	}
	@Override
	public Jurusan getById(Integer id) {
		Jurusan j = new Jurusan();
		j = em.find(Jurusan.class, id);
		return j;
	}

	@Override
	public List<Jurusan> getAll() {
		List<Jurusan> lj = em.createQuery("Select J from Jurusan J").getResultList();
		return lj;
	}

}
