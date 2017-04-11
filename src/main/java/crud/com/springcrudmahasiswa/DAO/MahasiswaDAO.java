package crud.com.springcrudmahasiswa.DAO;

import java.util.List;

import crud.com.springcrudmahasiswa.model.Mahasiswa;

public interface MahasiswaDAO {
	public Mahasiswa getById(Integer id);
	public List<Mahasiswa> getAll();
}
