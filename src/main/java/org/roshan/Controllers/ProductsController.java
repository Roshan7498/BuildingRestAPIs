package org.roshan.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @GetMapping("/products")
    public String getAllProducts(){
   return "Inside GetAll prods"    ;

    }
@GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable ("productId") Long productId){
        return "inside Single product"+ productId;
    }
    @PostMapping("/products")
    public String addNewProduct(){
        return "Adding a new prod";
    }
    public String updateProduct(){
        return "Update product";

    }
    public String deleteAproduct(){
        return "deleted a product";
    }
}
