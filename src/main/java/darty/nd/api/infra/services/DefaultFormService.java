package darty.nd.api.infra.services;

import darty.nd.api.domain.form.Form;
import darty.nd.api.domain.form.api.CreateForm;
import darty.nd.api.infra.dto.CreateFormDto;
import darty.nd.api.infra.dto.FormDto;
import darty.nd.api.infra.mapper.FormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultFormService implements FormService {
    private final CreateForm createForm;
    private final FormMapper formMapper;

    @Autowired
    public DefaultFormService(CreateForm createForm, FormMapper formMapper) {
        this.createForm = createForm;
        this.formMapper = formMapper;
    }

    @Override
    public FormDto create(CreateFormDto createFormDto) {
        final var form = new Form(null, createFormDto.name(), createFormDto.options());
        return formMapper.toInfra(createForm.create(form));
    }
}
