package crud.com.springcrudmahasiswa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import crud.com.springcrudmahasiswa.DAO.JurusanDAO;
import crud.com.springcrudmahasiswa.DAO.MahasiswaDAO;
import crud.com.springcrudmahasiswa.DAOImpl.JurusanDAOImpl;
import crud.com.springcrudmahasiswa.DAOImpl.MahasiswaDAOImpl;
import crud.com.springcrudmahasiswa.model.Jurusan;
import crud.com.springcrudmahasiswa.model.Mahasiswa;

@Controller
public class JurusanController {
	@RequestMapping(value="/jurusan", method = RequestMethod.GET)
	public String index(ModelMap modelmap){
		JurusanDAOImpl j = new JurusanDAOImpl();
		List<Jurusan> listJurusan = j.getAll();
		modelmap.put("listJur", listJurusan);
		return "jurusan/homejurusan";
	}
	
	@RequestMapping(value ="/jurusan", method = RequestMethod.POST)
	public void addJurusan(HttpServletResponse respon, @ModelAttribute("Jurusan")Jurusan j) throws IOException, ServletException{
		JurusanDAO ji = new JurusanDAOImpl();
		ji.insert(j);
		respon.sendRedirect("jurusan");
	}
	
	@RequestMapping(value = "/jurusan/{id}/show", method = RequestMethod.GET)
	public String showJurusan(ModelMap modelmap,@PathVariable("id") int id) throws IOException, ServletException{
		System.out.println("show id jurusan " + id);
		JurusanDAOImpl ji = new JurusanDAOImpl();
		Jurusan j = ji.getById(id);
		modelmap.put("j", j);
	    return "jurusan/show";
	}
	
	@RequestMapping(value="jurusan/{id}/detail", method=RequestMethod.GET)
	public String showdetail(@PathVariable("id")Integer id, ModelMap modelmap){
		JurusanDAO ji = new JurusanDAOImpl();
		MahasiswaDAO mhs = new MahasiswaDAOImpl();
		Jurusan j = ji.getById(id);
		List<Mahasiswa> m = mhs.getByJurusan(id);
		modelmap.put("j", j);
		// untuk list mahasiswa
		modelmap.put("mhs", m);
		System.out.println("id jurusan" + id);
		for (Mahasiswa mi : m) {
			System.out.println("list" + mi.getNama());
		}
		
		return "jurusan/show_mhs";
	}
	
	@RequestMapping(value = "/jurusan/{id}", method = RequestMethod.GET)
	public String editJurusan(ModelMap modelmap,@PathVariable("id") int id) throws IOException, ServletException{
		System.out.println("edit jurusan " + id);
		JurusanDAOImpl ji = new JurusanDAOImpl();
		Jurusan j = ji.getById(id);
		modelmap.put("j", j);
	    return "jurusan/edit";
	}
	
	@RequestMapping(value = "/jurusan/{id}", method = RequestMethod.POST)
	public String updateJurusan(HttpServletRequest request,HttpServletResponse respon,@ModelAttribute("Jurusan")Jurusan j, @PathVariable("id") Integer id) throws IOException, ServletException{
		System.out.println("update jurusan " + id);
		JurusanDAOImpl ji = new JurusanDAOImpl();
//		j = ji.getById(id);
		ji.update(j);
		return "redirect:/jurusan";
//	    respon.sendRedirect("/jurusan");
	}
	@RequestMapping(value="jurusan/{id}/delete", method=RequestMethod.POST)
	public String deleteJurusan(HttpServletRequest request,HttpServletResponse respon, @ModelAttribute("Jurusan")Jurusan j, @PathVariable("id")Integer id) throws IOException, ServletException{
		System.out.println("Delete jurusan id"+ j);
		JurusanDAOImpl ji = new JurusanDAOImpl();
		j = ji.getById(id);
		ji.delete(j);
		return "redirect:/jurusan";
//		respon.sendRedirect(request.getContextPath()+"jurusan");
	}
	
}
