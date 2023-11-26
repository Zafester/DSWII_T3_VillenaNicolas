package pe.edu.cibertec.CL3_DSW_NicolasVillena.service;

import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ServiceFile {
    private final Path rootFolder = Paths.get("archivos");

    public void guardar(MultipartFile archivo) throws Exception{
        Files.copy(archivo.getInputStream(),
                this.rootFolder.resolve(archivo.getOriginalFilename()));
    }

    public void guardarArchivos(List<MultipartFile> archivos) throws Exception {
        for (MultipartFile archivo : archivos){
            this.guardar(archivo);
        }
    }
}
