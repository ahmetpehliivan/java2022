package kodlama.io.kodlamaioDev.dataAccess.abstracts;

import kodlama.io.kodlamaioDev.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

    List<Language> findAllById();
    List<Language> findAllByName();

    Language findById(int id);
    Language findByName(String name);
}
