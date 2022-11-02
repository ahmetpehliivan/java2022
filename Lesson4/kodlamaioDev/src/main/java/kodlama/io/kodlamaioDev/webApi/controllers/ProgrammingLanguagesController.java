package kodlama.io.kodlamaioDev.webApi.controllers;

import kodlama.io.kodlamaioDev.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaioDev.entities.concretes.ProgrammingLanguages;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguages> getAll(){
        return programmingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgrammingLanguages getById(@PathVariable int id){
        return ProgrammingLanguageService.getById();
    }

    
}
