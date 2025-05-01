package org.roshan.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
public class Products extends BaseModel{
    private String title;
    private double price;
    private String description;
    private Categories category;
    private String imageURL;
}
