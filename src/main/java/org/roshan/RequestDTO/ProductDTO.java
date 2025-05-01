package org.roshan.RequestDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {

       // Long id ;
        private String title;
        private  Double  price ;
        private  String description ;
        private String category ;
        private String image ;

}
