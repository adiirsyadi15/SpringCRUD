package crud.com.springcrudmahasiswa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import crud.com.springcrudmahasiswa.DAOImpl.JurusanDAOImpl;
import crud.com.springcrudmahasiswa.DAOImpl.MahasiswaDAOImpl;
import crud.com.springcrudmahasiswa.model.Jurusan;
import crud.com.springcrudmahasiswa.model.Mahasiswa;

@Controller
public class MahasiswaController {
	
	
	@RequestMapping(value="/mahasiswa", method = RequestMethod.GET)
	public String index(ModelMap modelmap){
		MahasiswaDAOImpl mi = new MahasiswaDAOImpl();
		List<Mahasiswa> listmhs = mi.getAll();
		modelmap.put("listmhs", listmhs);
//		test print
		for (Mahasiswa m : listmhs) {
			System.out.println(m.getNama() +"  "+ m.getId() + m.getJurusanBean().getJurusan());
		}
//		data jurusan untuk insert
		JurusanDAOImpl jr = new JurusanDAOImpl();
		List<Jurusan> lj = jr.getAll();
		modelmap.put("jurusan", lj);
		
		System.out.println("print mahasiswa");
		return "mahasiswa/homemahasiswa";
	}
	
	@RequestMapping(value="mahasiswa", method=RequestMethod.POST)
	public void add(HttpServletResponse respon, @ModelAttribute("Mahasiswa") Mahasiswa mahasiswa) throws IOException, ServletException{
		MahasiswaDAOImpl mhs = new MahasiswaDAOImpl();
		mhs.insert(mahasiswa);
		respon.sendRedirect("mahasiswa");
	}
	
	
	@RequestMapping(value="/mahasiswa/{id}/show", method=RequestMethod.GET)
	public String show(ModelMap modelmap, @PathVariable("id") Integer id){
		MahasiswaDAOImpl mi = new MahasiswaDAOImpl();
		Mahasiswa mhs = mi.getById(id);
		modelmap.put("mhs", mhs);
		
		System.out.println("show "+id);
		
		return "mahasiswa/show";
	}
}
