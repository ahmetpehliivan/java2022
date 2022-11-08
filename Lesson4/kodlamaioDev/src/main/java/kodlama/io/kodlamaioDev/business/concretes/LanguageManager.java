package kodlama.io.kodlamaioDev.business.concretes;

import kodlama.io.kodlamaioDev.business.abstracts.LanguageService;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.CreateLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.DeleteLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.UpdateLanguage;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetLanguageById;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetListLanguage;
import kodlama.io.kodlamaioDev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlamaioDev.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    @Override
    public void add(CreateLanguage createLanguage) throws Exception {
        if (createLanguage.getName().isBlank() || isNameExist(createLanguage.getName())){
            throw new Exception("Girilen isim zaten var.Yeniden deneyiniz..");
        }
        Language language = new Language();
        language.setName(createLanguage.getName());

        languageRepository.save(language);
    }

    @Override
    public void delete(DeleteLanguage deleteLanguage) throws Exception {
        if (!isIdExist(deleteLanguage.getId())){
            throw new Exception("Silinecek dilin Id si bulunamadı.");
        }
        Language language = new Language();
        language.setId(deleteLanguage.getId());

        languageRepository.delete(language);
    }

    @Override
    public void update(UpdateLanguage updateLanguage) {
        if (isNameExist(updateLanguage.getName()) || !isIdExist(updateLanguage.getId())){

        }
    }

    @Override
    public List<GetListLanguage> getAll() {
        return null;
    }

    @Override
    public GetLanguageById getLanguageById(int id) {
        return null;
    }

    private boolean isNameExist(String name){
        for (Language l:languageRepository.findAll()){
            if(l.getName().equals(name))
                return true;
        }
        return false;
    }

    private boolean isIdExist(int id){
        for (Language l:languageRepository.findAll()){
            if (l.getId() == id){
                return true;
            }
        }
        return false;
    }


}
