package crud.com.springcrudmahasiswa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the jurusan database table.
 * 
 */
@Entity
@NamedQuery(name="Jurusan.findAll", query="SELECT j FROM Jurusan j")
public class Jurusan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String jurusan;

	private String nomerjurusan;

	//bi-directional many-to-one association to Mahasiswa
	@OneToMany(mappedBy="jurusanBean")
	private List<Mahasiswa> mahasiswas;

	public Jurusan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJurusan() {
		return this.jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getNomerjurusan() {
		return this.nomerjurusan;
	}

	public void setNomerjurusan(String nomerjurusan) {
		this.nomerjurusan = nomerjurusan;
	}

	public List<Mahasiswa> getMahasiswas() {
		return this.mahasiswas;
	}

	public void setMahasiswas(List<Mahasiswa> mahasiswas) {
		this.mahasiswas = mahasiswas;
	}

	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa) {
		getMahasiswas().add(mahasiswa);
		mahasiswa.setJurusanBean(this);

		return mahasiswa;
	}

	public Mahasiswa removeMahasiswa(Mahasiswa mahasiswa) {
		getMahasiswas().remove(mahasiswa);
		mahasiswa.setJurusanBean(null);

		return mahasiswa;
	}

}