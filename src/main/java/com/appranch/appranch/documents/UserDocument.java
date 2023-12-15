package com.appranch.appranch.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "Users")
public class UserDocument {

    @Id
    private Long id;
    private String name;
    private String email;

    // Manually set ID when creating a new instance
    public UserDocument() {
        this.id = generateUniqueId();
    }

    private Long generateUniqueId() {
        // Implement your logic to generate a unique Long ID
        // This could involve using timestamps, sequence generators, or other custom logic
        // Here's a simple example using a timestamp
        return System.currentTimeMillis();
    }
}
