package tarjetas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
    public class InterfazUsuario implements CommandLineRunner {

        @Autowired ServicioTarjeta servicio;
         public static void main(String[] args) {
            SpringApplication.run(tarjetas.InterfazUsuario.class, args);

        }

    @Override
    public void run(String... args) throws Exception {
        servicio.obtenerSaldo().obtenerSaldo();
    }
}

