package advanced_todo.advanced_todo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
@Data
public class Todo {

    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;


}
