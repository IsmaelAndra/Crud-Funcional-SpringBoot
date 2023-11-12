package backend.backend;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    List <Doctor> findAll();

    void updateById(long id);
}
