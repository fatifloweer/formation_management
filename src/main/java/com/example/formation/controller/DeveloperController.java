//package com.example.formation.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.ui.Model;
//
//import com.example.formation.entity.Developer;
//import com.example.formation.service.DeveloperService;
//
//@Controller
//public class DeveloperController {
//	
//	 @Autowired
//     private DeveloperService service;
//	 
//     @GetMapping("/")
//     public String viewHomePage(Model model) {
//         List<Developer> listdevelopers= service.listAll();
//         model.addAttribute("listdevelopers", listdevelopers);
//         System.out.print("Get / ");    
//         return "index";
//     }
//     
//     @GetMapping("/new")
//     public String add(Model model) {
//         model.addAttribute("developer", new Developer());
//         return "new";
//     }
//     
//     @RequestMapping(value = "/save", method = RequestMethod.POST)
//     public String saveDeveloper(@ModelAttribute("developer") Developer dev) {
//         service.save(dev);
//         return "redirect:/";
//     }
//     
//     @RequestMapping("/edit/{id}")
//     public ModelAndView showEditDeveloperPage(@PathVariable(name = "id") int id) {
//         ModelAndView mav = new ModelAndView("new");
//         Developer dev = service.get(id);
//         mav.addObject("developer", dev);
//         return mav;
//         
//     }
//     
//     @RequestMapping("/delete/{id}")
//     public String deleteDeveloper(@PathVariable(name = "id") int id) {
//         service.delete(id);
//         return "redirect:/";
//     }
//
//}
