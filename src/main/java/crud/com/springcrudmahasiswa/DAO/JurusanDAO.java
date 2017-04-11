package crud.com.springcrudmahasiswa.DAO;

import java.util.List;

import crud.com.springcrudmahasiswa.model.Jurusan;

public interface JurusanDAO extends GeneralDAO{
	public Jurusan getById(Integer id);
	public List<Jurusan> getAll();
}
