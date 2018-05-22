package tim.project.lab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tim.project.lab.Services.AverageServiceInterface;

import java.util.List;


@RestController
@RequestMapping("/api")
public class AverageController {
    private final AverageServiceInterface Interface;

    @Autowired
    public AverageController(AverageServiceInterface Interface){
        this.Interface = Interface;
    }

    @GetMapping("getAverage")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Double> getAverage(@ModelAttribute("flashList") List<Integer> list) {
        return new ResponseEntity<Double>(
                Interface.average(list),
                HttpStatus.OK);
    }
}
