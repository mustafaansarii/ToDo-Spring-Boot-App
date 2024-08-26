package advanced_todo.advanced_todo.Repository;

import advanced_todo.advanced_todo.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}
