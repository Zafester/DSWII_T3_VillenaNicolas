package pe.edu.cibertec.CL3_DSW_NicolasVillena.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.CL3_DSW_NicolasVillena.model.bd.Usuario;
@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);
}
