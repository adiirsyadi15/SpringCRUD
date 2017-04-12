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

	private String nama;

	@Column(name="no_jur")
	private String noJur;

	//bi-directional many-to-one association to Mahasiswa
	@OneToMany(mappedBy="jurusan")
	private List<Mahasiswa> mahasiswas;

	public Jurusan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNoJur() {
		return this.noJur;
	}

	public void setNoJur(String noJur) {
		this.noJur = noJur;
	}

	public List<Mahasiswa> getMahasiswas() {
		return this.mahasiswas;
	}

	public void setMahasiswas(List<Mahasiswa> mahasiswas) {
		this.mahasiswas = mahasiswas;
	}

	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa) {
		getMahasiswas().add(mahasiswa);
		mahasiswa.setJurusan(this);

		return mahasiswa;
	}

	public Mahasiswa removeMahasiswa(Mahasiswa mahasiswa) {
		getMahasiswas().remove(mahasiswa);
		mahasiswa.setJurusan(null);

		return mahasiswa;
	}

}