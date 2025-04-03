package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Genero;
import application.repository.GeneroRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping(value = {"/", "/genero"})
public class IndexController {

    @Autowired
    private GeneroRepository generoRepo; 
    
    @RequestMapping(value = {"", "/home"})
    public String home(Model ui) {

        ui.addAttribute("generos", generoRepo.findAll());

        return "home";
    }

    @RequestMapping("/insert")
    public String insert() {

        return "insert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("descricao") String descricao) {
        Genero genero = new Genero();
        genero.setDescricao(descricao);

        generoRepo.save(genero);
        
        return "redirect:/genero/home";
    }

    @RequestMapping("/update")
    public String update(@RequestParam("id") long id, Model ui) {
        Optional<Genero> resultado = generoRepo.findById(id);

        if(resultado.isPresent()){
            ui.addAttribute("genero", resultado.get());
            return "update";
        }

        return "redirect:/genero/home";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(
        @RequestParam("id") long id,
        @RequestParam("descricao") String descricao) {

            Optional<Genero> resultado = generoRepo.findById(id);

            if (resultado.isPresent()) {
                resultado.get().setDescricao(descricao);

                generoRepo.save(resultado.get());
            }

            return "redirect:/genero/home";
        }


    @RequestMapping("/delete")
    public String delete(@RequestParam("id") long id, Model ui) {
        Optional<Genero> resultado = generoRepo.findById(id);

        if(resultado.isPresent()){
            ui.addAttribute("genero", resultado.get());
            return "delete";
        }

        return "redirect:/genero/home";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(
        @RequestParam("id") long id) {

            generoRepo.deleteById(id);
            return "redirect:/genero/home";
        }
}