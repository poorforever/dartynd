package darty.nd.api.infra.repository;

import darty.nd.api.infra.repository.entity.FormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface FormRepository extends JpaRepository<FormEntity, Long> {
}
