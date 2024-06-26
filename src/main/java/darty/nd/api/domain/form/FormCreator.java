package darty.nd.api.domain.form;

import darty.nd.api.domain.form.api.CreateForm;
import darty.nd.api.domain.form.spi.SaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FormCreator implements CreateForm {
    private final SaveForm saveForm;

    @Autowired
    public FormCreator(SaveForm saveForm) {
        this.saveForm = saveForm;
    }

    @Override
    public Form create(Form form) {
        return saveForm.save(form);
    }
}
