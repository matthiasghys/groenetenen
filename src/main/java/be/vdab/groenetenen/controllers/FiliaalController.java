package be.vdab.groenetenen.controllers;

import be.vdab.groenetenen.forms.VanTotPostcode;
import be.vdab.groenetenen.services.FiliaalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("filialen")
public class FiliaalController {
    private final FiliaalService filiaalService;

    public FiliaalController(FiliaalService filiaalService) {
        this.filiaalService = filiaalService;
    }

    @GetMapping("vantotpostcodeform")
    public ModelAndView vanTotPostcodeForm(){
        return new ModelAndView("vantotpostcode").addObject(new VanTotPostcode(1000,1000));
    }
}
