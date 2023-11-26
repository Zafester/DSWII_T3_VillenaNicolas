package pe.edu.cibertec.CL3_DSW_NicolasVillena.exception;

public class MaxUploadSizeExceedException extends RuntimeException{
    public MaxUploadSizeExceedException (String message){
        super(message);
    }
}
