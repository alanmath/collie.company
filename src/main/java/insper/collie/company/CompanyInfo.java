package insper.collie.company;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record CompanyInfo(
    Long id,
    String name,
    String description
) {
    
}
