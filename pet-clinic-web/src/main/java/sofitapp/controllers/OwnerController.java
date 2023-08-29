package sofitapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sofitapp.model.Owner;
import sofitapp.services.OwnerService;

import java.util.Set;
import java.util.stream.Stream;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","owners/index"})
    public String listOwners(Model model)

    {

        model.addAttribute("owners",ownerService.findAll());

        return "owners/index";

    }

}
