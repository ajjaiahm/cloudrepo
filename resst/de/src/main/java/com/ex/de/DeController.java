package com.ex.de;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController 
public class DeController {
@GetMapping("/") 
public String Welcome(){
    return ("<h1>go back</h1>");

}
    
}
