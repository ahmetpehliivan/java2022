package kodlama.io.kodlamaioDev.dataAccess.abstracts;

import kodlama.io.kodlamaioDev.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {

    List<Technology> findAllById(int id);
    List<Technology> findAllByName(String name);

    Technology findByName(String name);
    Technology findById(int id);


}
