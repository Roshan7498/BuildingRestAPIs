package org.roshan.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
//@AllArgsConstructor
public class BaseModel {

    private Long id;
    private Date createdAt;
    private Date lastpdatedAt;
    private boolean isDeleted;
}
