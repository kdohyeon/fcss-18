package fast.campus.fcss18.controller;

import fast.campus.fcss18.domain.Document;
import fast.campus.fcss18.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @GetMapping("/api/v1/document/{name}")
    public Document getDocument(@PathVariable String name) {
        return documentService.getDocument(name);
    }
}
