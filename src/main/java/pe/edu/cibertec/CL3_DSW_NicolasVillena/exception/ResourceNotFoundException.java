package pe.edu.cibertec.CL3_DSW_NicolasVillena.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
