package pe.edu.cibertec.CL3_DSW_NicolasVillena.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.CL3_DSW_NicolasVillena.model.bd.response.ResponseFile;
import pe.edu.cibertec.CL3_DSW_NicolasVillena.service.ServiceFile;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/file")
public class FileController {
    private ServiceFile fileService;
    @PostMapping("/upload")
    public ResponseEntity<ResponseFile> subirArchivos(
            @RequestParam("files") List<MultipartFile> files) throws  Exception{
        fileService.guardarArchivos(files);
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        ResponseFile.builder().message("Se cargaron correctamente")
                                .build()
                );
    }
}
