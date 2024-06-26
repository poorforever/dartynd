package darty.nd.api.infra;

import darty.nd.api.domain.form.Form;
import darty.nd.api.domain.form.spi.SaveForm;
import darty.nd.api.infra.mapper.FormMapper;
import darty.nd.api.infra.mapper.OptionMapper;
import darty.nd.api.infra.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FormSaver implements SaveForm {
    private final FormRepository formRepository;
    private final FormMapper formMapper;
    private final OptionMapper optionMapper;

    @Autowired
    public FormSaver(FormRepository formRepository, FormMapper formMapper, OptionMapper optionMapper) {
        this.formRepository = formRepository;
        this.formMapper = formMapper;
        this.optionMapper = optionMapper;
    }

    public Form save(Form form) {
        final var entity = formRepository.save(formMapper.toEntity(form));

        return new Form(entity.getId(), entity.getName(), optionMapper.toDomain(entity.getOptions()));
    }
}
