package darty.nd.api.infra.dto;

import java.util.Set;

public record FormDto(Long id, String name, Set<String> options) {
}
