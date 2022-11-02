package kodlama.io.kodlamaioDev.business.concretes;

import kodlama.io.kodlamaioDev.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaioDev.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlamaioDev.entities.concretes.ProgrammingLanguages;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguages getById(int id) {
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public void create(ProgrammingLanguages programmingLanguages) {

    }

    @Override
    public void update(ProgrammingLanguages programmingLanguages, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
