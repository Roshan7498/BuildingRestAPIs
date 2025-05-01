package org.roshan.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {
    @GetMapping("/category")
    public String GetCategories(){
        return "GetCategory";
    }

}
