package fast.campus.fcss18.repository;

import fast.campus.fcss18.domain.Document;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class DocumentRepository {
    private Map<String, Document> documents = Map.of(
            "Document A", new Document("danny.kim"),
            "Document B", new Document("steve.kim"),
            "Document C", new Document("harris.kim")
    );

    public Document findDocumentByName(String name) {
        return documents.get(name);
    }
}
