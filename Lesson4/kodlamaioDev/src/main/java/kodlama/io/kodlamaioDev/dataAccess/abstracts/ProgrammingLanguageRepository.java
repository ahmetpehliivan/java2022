package kodlama.io.kodlamaioDev.dataAccess.abstracts;

import kodlama.io.kodlamaioDev.entities.concretes.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguages> getAll();
    ProgrammingLanguages getById(int id);
    void create(ProgrammingLanguages programmingLanguages);
    void update(ProgrammingLanguages programmingLanguages, int id);
    void delete(int id);
}
