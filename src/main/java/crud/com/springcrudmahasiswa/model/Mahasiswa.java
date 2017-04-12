package crud.com.springcrudmahasiswa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mahasiswa database table.
 * 
 */
@Entity
@NamedQuery(name="Mahasiswa.findAll", query="SELECT m FROM Mahasiswa m")
public class Mahasiswa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nama;

	private String nim;

	//bi-directional many-to-one association to Jurusan
	@ManyToOne
	@JoinColumn(name="id_jurusan")
	private Jurusan jurusan;

	public Mahasiswa() {
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

	public String getNim() {
		return this.nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public Jurusan getJurusan() {
		return this.jurusan;
	}

	public void setJurusan(Jurusan jurusan) {
		this.jurusan = jurusan;
	}

}