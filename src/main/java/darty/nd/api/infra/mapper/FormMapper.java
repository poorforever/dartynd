package darty.nd.api.infra.mapper;

import darty.nd.api.domain.form.Form;
import darty.nd.api.infra.dto.FormDto;
import darty.nd.api.infra.repository.entity.FormEntity;
import org.springframework.stereotype.Component;

@Component
public class FormMapper {
    public FormDto toInfra(Form form) {
        return new FormDto(form.id(), form.name(), form.options());
    }

    public FormEntity toEntity(Form form) {
        final var formEntity = new FormEntity();

        formEntity.setName(form.name());
        formEntity.setOptions(form.options().toString());

        return formEntity;
    }
}
