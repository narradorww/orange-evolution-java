package squad28.web.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import squad28.web.api.modelo.Curso;

public interface CursoRepository extends MongoRepository<Curso, String> {

}

