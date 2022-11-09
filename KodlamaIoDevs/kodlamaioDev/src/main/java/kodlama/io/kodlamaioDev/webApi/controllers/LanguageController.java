package kodlama.io.kodlamaioDev.webApi.controllers;

import kodlama.io.kodlamaioDev.business.abstracts.LanguageService;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.CreateLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.DeleteLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.UpdateLanguage;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetLanguageById;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetListLanguage;
import kodlama.io.kodlamaioDev.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/languages")
public class LanguageController {

    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<GetListLanguage> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public GetLanguageById getById(@PathVariable int id){
        return languageService.getLanguageById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateLanguage createLanguage) throws Exception{
        languageService.add(createLanguage);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody DeleteLanguage deleteLanguage, @PathVariable int id) throws Exception{
        languageService.delete(deleteLanguage);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateLanguage updateLanguage){
        languageService.update(updateLanguage);
    }


}
