package backend.backend;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    //create
    public Doctor save(Doctor entity)
    {
        return doctorRepository.save(entity);
    }

    //read
    public Doctor findById(long id)
    {
        return doctorRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteByID (long id)
    {
        doctorRepository.deleteById(id);
    }
    
    //select all
    public List <Doctor> findAll()
    {
        return doctorRepository.findAll();
    }
}
