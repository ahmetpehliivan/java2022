package kodlama.io.kodlamaioDev.business.abstracts;

import kodlama.io.kodlamaioDev.business.requests.languageRequest.CreateLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.DeleteLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.UpdateLanguage;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetLanguageById;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetListLanguage;

import java.util.List;

public interface LanguageService {

    void add(CreateLanguage createLanguage) throws Exception;
    void delete(DeleteLanguage deleteLanguage) throws Exception;
    void update(UpdateLanguage updateLanguage);


    List<GetListLanguage> getAll();
    GetLanguageById getLanguageById(int id);


}
