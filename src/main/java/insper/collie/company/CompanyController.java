package insper.collie.company;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "collie-company")
public interface CompanyController {
    
    @PostMapping("/company")
    public ResponseEntity<CompanyInfo> create(
        @RequestBody(required = true) CompanyInfo in
    );

    @GetMapping("/company/{id}")
    public ResponseEntity<CompanyInfo> getCompany(
        @PathVariable(required = true) String id
    );

    @GetMapping("/company/exists/{id}")
    public ResponseEntity<Boolean> isCompany(
        @PathVariable(required = true) String id
    );

    @GetMapping("/company")
    public ResponseEntity<List<CompanyInfo>> getAllCompanies();


    @PutMapping("/company/{id}")
    public ResponseEntity<CompanyInfo> updateCompany(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) CompanyInfo in
    );

    @DeleteMapping("/company/{id}")
    public ResponseEntity<CompanyInfo> deleteCompany(
        @PathVariable(required = true) String id
    );
}
