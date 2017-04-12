package crud.com.springcrudmahasiswa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import crud.com.springcrudmahasiswa.DAO.JurusanDAO;
import crud.com.springcrudmahasiswa.DAO.MahasiswaDAO;
import crud.com.springcrudmahasiswa.DAOImpl.JurusanDAOImpl;
import crud.com.springcrudmahasiswa.DAOImpl.MahasiswaDAOImpl;
import crud.com.springcrudmahasiswa.model.Jurusan;
import crud.com.springcrudmahasiswa.model.Mahasiswa;

@Controller
public class MahasiswaController {
	
	
	@RequestMapping(value="/mahasiswa", method = RequestMethod.GET)
	public String index(ModelMap modelmap, Model model){
		
//		masukkan login attribut untuk model atribut form di jsp
//		model.addAttribute("Mahasiswa", new Mahasiswa());
		
//		ambil data Mahasiswa untuk display all
		MahasiswaDAOImpl mi = new MahasiswaDAOImpl();
		List<Mahasiswa> listmhs = mi.getAll();
		modelmap.put("listmhs", listmhs);
//		test print
		for (Mahasiswa m : listmhs) {
			System.out.println(m.getNama() +"  "+ m.getId() + m.getJurusan().getNama());
		}
		
//		data jurusan untuk insert
		JurusanDAOImpl jr = new JurusanDAOImpl();
		List<Jurusan> lj = jr.getAll();
		modelmap.put("jurusanList", lj);
		
		System.out.println("print mahasiswa");
		return "mahasiswa/homemahasiswa";
	}
	
	@RequestMapping(value="mahasiswa", method=RequestMethod.POST)
	public void add(@ModelAttribute("Mahasiswa") Mahasiswa mahasiswa,HttpServletResponse respon, BindingResult result) throws IOException, ServletException{
		System.out.println("[info] add mahasiswa");
		
		if (result.hasErrors()) {
            System.out.println("errrrrooo");
        }
		
		MahasiswaDAOImpl mhs = new MahasiswaDAOImpl();
//		JurusanDAOImpl ji = new JurusanDAOImpl();
		
		//mahasiswa.setJurusan(jurusan);(ji.getById(id));
		mhs.insert(mahasiswa);
		respon.sendRedirect("mahasiswa");
		
//		tesss
//		JurusanDAOImpl ji = new JurusanDAOImpl();
//		ji.getById(id);
		
//		mahasiswa.setJurusanBean(jurusan);
//		MahasiswaDAOImpl mi = new MahasiswaDAOImpl();
//		mi.insert(mahasiswa);
//		respon.sendRedirect("mahasiswa");
		
		
	}
	
//	Edit Mahasiswa
	@RequestMapping(value="/mahasiswa/{id}", method=RequestMethod.GET)
	public String edit(ModelMap modelmap, @PathVariable("id")Integer id){
//		Jurusan List
		JurusanDAO ji = new JurusanDAOImpl();
		List<Jurusan> j = ji.getAll();
		modelmap.put("jurusanList", j);
//		data mahasiswa
		MahasiswaDAO mhs = new MahasiswaDAOImpl();
		Mahasiswa m = new Mahasiswa();
		m = mhs.getById(id);
		modelmap.put("mhs", m);
		
		System.out.println("data edit : " + m.getNama());
		return "mahasiswa/edit";
	}
	
//	update data
	@RequestMapping(value="/mahasiswa/{id}", method=RequestMethod.POST)
	public String update(@ModelAttribute("Mahasiswa")Mahasiswa mhs, @PathVariable("id")Integer id){
		MahasiswaDAOImpl mi = new MahasiswaDAOImpl();
		mi.update(mhs);
		
		return "redirect:/mahasiswa";
	}
	
	@RequestMapping(value="/mahasiswa/{id}/show", method=RequestMethod.GET)
	public String show(ModelMap modelmap, @PathVariable("id") Integer id){
		MahasiswaDAOImpl mi = new MahasiswaDAOImpl();
		Mahasiswa mhs = mi.getById(id);
		modelmap.put("mhs", mhs);
		
		System.out.println("show "+id);
		
		return "mahasiswa/show";
	}
	
	@RequestMapping(value="/mahasiswa/{id}/delete", method=RequestMethod.POST)
	public String delete(@ModelAttribute("Mahasiswa")Mahasiswa mhs, @PathVariable("id") Integer id){
		MahasiswaDAOImpl mi = new MahasiswaDAOImpl();
		mhs = mi.getById(id);
		mi.delete(mhs);
		System.out.println("delete "+id);
		return "redirect:/mahasiswa";
	}
}
