package kodlama.io.kodlamaioDev.dataAccess.concretes;

import kodlama.io.kodlamaioDev.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlamaioDev.entities.concretes.ProgrammingLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguages> programmingLanguagesList;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguagesList = new ArrayList<>();
        programmingLanguagesList.add(new ProgrammingLanguages(1,"Java"));
        programmingLanguagesList.add(new ProgrammingLanguages(2,"CSS"));

    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return programmingLanguagesList;
    }
    //id ye göre listeleme
    @Override
    public ProgrammingLanguages getById(int id) {
        for (ProgrammingLanguages language:programmingLanguagesList) {
            if (language.getId() == id)
                return language;
        }
        return null;
    }

    @Override
    public void create(ProgrammingLanguages programmingLanguages) {
        programmingLanguagesList.add(programmingLanguages);
    }

    @Override
    public void update(ProgrammingLanguages programmingLanguages, int id) {
        ProgrammingLanguages newLanguage = getById(id);
        newLanguage.setName(programmingLanguages.getName());
    }

    @Override
    public void delete(int id) {
        ProgrammingLanguages programmingLanguages = getById(id);
        programmingLanguagesList.remove(programmingLanguages);
    }
}
