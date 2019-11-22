package biz.cput.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class IndexController {

   @RequestMapping(value={"/","/OnOffShopping"})
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome to OnOff Shopping!", HttpStatus.OK);
    }
}