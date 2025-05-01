package org.roshan.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products extends BaseModel{
    private String title;
    private double price;
    private String description;
    private Categories category;
    private String imageURL;
}
