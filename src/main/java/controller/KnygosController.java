package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.AutoriausRepository;
import repository.KategorijosRepository;
import repository.KnygosRepository;
import repository.VartotojoReposiroty;

@Controller
public class KnygosController {
    @Autowired
    KnygosRepository knygosRepository;
    @Autowired
    VartotojoReposiroty vartotojoReposiroty;
    @Autowired
    KategorijosRepository kategorijosRepository;
    @Autowired
    AutoriausRepository autoriausRepository;


    @GetMapping("/knygos/testas")
    String testineFuncija(Model model) {
        //model.addAttribute("vardas", vardas);
        return "testinis.html";
    }

}
