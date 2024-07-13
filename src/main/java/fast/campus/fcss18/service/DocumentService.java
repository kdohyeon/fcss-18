package fast.campus.fcss18.service;

import fast.campus.fcss18.domain.Document;
import fast.campus.fcss18.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;

    @PostAuthorize("hasPermission(returnObject, 'ROLE_admin')")
    public Document getDocument(String name) {
        return documentRepository.findDocumentByName(name);
    }
}
