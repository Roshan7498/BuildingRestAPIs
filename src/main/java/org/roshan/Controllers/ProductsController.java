package org.roshan.Controllers;

import org.roshan.RequestDTO.ProductDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping()
    public String getAllProducts(){
   return "Inside GetAll prods"    ;

    }
    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable ("productId") Long productId){
        return "inside Single product with id "+ productId;
    }
    @PostMapping()
    public String addNewProduct(@RequestBody ProductDTO productDTO ){
        return "Adding a new prod with following details :"+ productDTO;
    }
    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable ("productId") Long productId){
        return "Updated product with id" +productId;

    }
    @DeleteMapping("/{productId}")
    public String deleteAproduct(@PathVariable ("productId") Long productId){
        return "deleted a product with id " + productId;
    }
}
