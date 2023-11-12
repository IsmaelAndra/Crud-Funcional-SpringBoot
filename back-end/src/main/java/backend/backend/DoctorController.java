package backend.backend;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/doctor/")
@CrossOrigin({"*"})

public class DoctorController {
    @Autowired 
    private DoctorService doctorService;

    @PostMapping("/")

    public Doctor save(@RequestBody Doctor entity)
    {
        return doctorService.save(entity);
    }

    @GetMapping("/{id}/")
    public Doctor findDoctor(@PathVariable long id)
    {
        return doctorService.findById(id);
    }
    @PutMapping("")
    public Doctor update(@RequestBody Doctor entity)
    {
        return doctorService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteByID(@PathVariable long id)
    {
        doctorService.deleteByID(id);
    }

    @GetMapping("/")
    public List<Doctor> findAll()
    {
        return doctorService.findAll();
    }
}
