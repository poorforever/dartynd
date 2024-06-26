package darty.nd.api.infra.mapper;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class OptionMapper {
    public Set<String> toDomain(String options) {
        return Arrays.stream(options.split(",")).collect(Collectors.toSet());
    }
}
