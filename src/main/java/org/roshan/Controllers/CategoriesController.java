package org.roshan.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/category")
public class CategoriesController {
    @GetMapping()
    public String GetCategories(){
        return "GetCategory";
    }
    @GetMapping("/{categoryId}")
    public String getProductsInCategory(@PathVariable ("categoryId") Long categoryId){
        return "Get products in Category with id :" + categoryId;
    }


}
