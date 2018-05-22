package tim.project.lab.Controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import tim.project.lab.Services.ListServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListController {

    private final ListServiceInterface Interface;

    @Autowired
    public ListController(ListServiceInterface Interface){
     this.Interface = Interface;
    }

    @GetMapping("getList/{amount}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Integer>> getList(@PathVariable int amount) {
         return new ResponseEntity<List<Integer>>(
                 Interface.getList(amount),
                 HttpStatus.OK);
    }

    @GetMapping("/redirect")
    @CrossOrigin(origins = "http://localhost:4200")
    public RedirectView redirectAttributes(RedirectAttributes attributes) {
        attributes.addFlashAttribute("flashList", Interface.getAL());
        return new RedirectView("getAverage");
    }
}
