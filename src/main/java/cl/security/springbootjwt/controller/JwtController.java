package cl.security.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cristianfgr on 23-01-20.
 */
@RestController
public class JwtController {

    @RequestMapping({"/obtener"})
    public String firstPage() {
        return "Test JWT";
    }

}
