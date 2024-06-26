package darty.nd.api.infra.dto;

import java.util.Set;

public record CreateFormDto(String name, Set<String> options) {
}
