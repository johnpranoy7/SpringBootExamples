//package com.telusko.Exp4.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.telusko.Exp4.dao.AlienDao;
//import com.telusko.Exp4.entities.Alien;
//
//@Controller
//public class MyController {
//	
//	@Autowired
//	AlienDao dao;
//	
//	//SpringBootMVC
//	/*
//	 * @RequestMapping(value = "/") public String getHomepage() {
//	 * //System.out.println(dao.findByTech("ML"));
//	 * //System.out.println(dao.findBySidGreaterThan(1));
//	 * //System.out.println(dao.findByTechSorted("AI")); return "home"; }
//	 * 
//	 * @PostMapping(value = "/alien") public String savedetails(Alien alien) {
//	 * dao.save(alien); return "home"; }
//	 * 
//	 * @GetMapping(value = "/alien/{sid}") public ModelAndView
//	 * getdetails(@PathVariable("sid") int sid, ModelAndView mv) { Alien a =
//	 * dao.findById(sid).orElse(null); mv.addObject("a", a);
//	 * mv.setViewName("display1"); return mv; }
//	 */
//	
//	@RequestMapping(path = "/aliens", produces = "application/json")
//	@ResponseBody
//	public List<Alien> getAllAliens() {
//		System.out.println("getting all aliens");
//		return dao.findAll();
//	}
//	
//	@RequestMapping(path = "/alien/{sid}")
//	@ResponseBody
//	public Alien getOneAlien(@PathVariable("sid")int sid) {
//		return dao.findById(sid).orElse(null);
//	}
//
//	@PostMapping(path = "/alien")
//	@ResponseBody
//	public Alien saveAlien(@RequestBody Alien alien) {
//		System.out.println(alien);
//		dao.save(alien);
//		return alien;
//		 
//	}
//	
//	@DeleteMapping(path = "/alien/{sid}")
//	@ResponseBody
//	public String deleteOneAlien(@PathVariable("sid")int sid) {
//		 dao.delete(dao.findById(sid).orElse(null));
//		 return "deleted";
//	}
//	
//	@PutMapping(path = "/alien")
//	@ResponseBody
//	public Alien updateOneAlien(@RequestBody Alien alien) {
//		dao.save(alien);
//		return alien;
//	}
//}
