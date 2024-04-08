package insper.collie.company.exceptions;


public class CompanyNotFoundException extends RuntimeException{
    
    public CompanyNotFoundException(String id){
        super("Company not found with id: " + id);
    }
}
