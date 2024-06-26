package darty.nd.api.domain.form;

import java.util.Set;

public record Form(Long id, String name, Set<String> options) {
}
