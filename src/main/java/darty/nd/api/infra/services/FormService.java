package darty.nd.api.infra.services;

import darty.nd.api.infra.dto.CreateFormDto;
import darty.nd.api.infra.dto.FormDto;

public interface FormService {
    FormDto create(CreateFormDto createFormDto);
}
