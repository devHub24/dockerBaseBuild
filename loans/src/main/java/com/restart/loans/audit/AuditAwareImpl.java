package com.restart.loans.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditor")
public class AuditAwareImpl  implements AuditorAware {
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("LOANS_MS");
    }
}
