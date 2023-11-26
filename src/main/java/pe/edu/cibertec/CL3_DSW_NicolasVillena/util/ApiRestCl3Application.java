package pe.edu.cibertec.CL3_DSW_NicolasVillena.util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiRestCl3Application {
    public static void main(String[] args) {SpringApplication.run(ApiRestCl3Application.class, args); }
    @Bean
    public WebMvcConfigurer configCorsGlobal(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("api/v1/**")
                        .allowedMethods("GET", "POST", "PUT")
                        .allowedOrigins("https://www.cibertec.edu.pe ");
            }
        };
    }

}
