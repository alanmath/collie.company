package insper.collie.company;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record CompanyInfo(
    String id,
    String name,
    String description
) implements Serializable{
    
}
