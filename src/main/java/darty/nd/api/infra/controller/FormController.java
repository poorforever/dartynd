package darty.nd.api.infra.controller;

import darty.nd.api.infra.dto.CreateFormDto;
import darty.nd.api.infra.dto.FormDto;
import darty.nd.api.infra.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    @Autowired
    private FormService formService;

    @PostMapping
    public ResponseEntity<FormDto> add(CreateFormDto createFormDto) {
        return ResponseEntity.ok(formService.create(createFormDto));
    }
}
