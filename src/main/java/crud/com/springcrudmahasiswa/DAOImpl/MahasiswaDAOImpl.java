package crud.com.springcrudmahasiswa.DAOImpl;

import java.util.List;

import crud.com.springcrudmahasiswa.DAO.MahasiswaDAO;
import crud.com.springcrudmahasiswa.model.Mahasiswa;

public class MahasiswaDAOImpl extends GeneralDAOImpl implements MahasiswaDAO{
	public MahasiswaDAOImpl() {
		super();
	}
	
	@Override
	public Mahasiswa getById(Integer id) {
		Mahasiswa m = new Mahasiswa();
		m = em.find(Mahasiswa.class, id);
		return m;
	}

	@Override
	public List<Mahasiswa> getAll() {
		List<Mahasiswa> lm = em.createQuery("select m from Mahasiswa m").getResultList();
		return lm;
	}

	@Override
	public List<Mahasiswa> getByJurusan(Integer id) {
		List<Mahasiswa> lm = em.createQuery("select m from Mahasiswa m where m.jurusan.id = :id").setParameter("id", id).getResultList();
		return lm;
	}

}
