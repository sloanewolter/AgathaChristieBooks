package com.example.AgathaChristieBooks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection="bookList")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

@Id
    private ObjectId id;
   private Integer yearOfUsPublication;
    private String title;
    private String series;
    private String notes;

//    @DocumentReference
//    private List<Reviews> reviewIds;


}
