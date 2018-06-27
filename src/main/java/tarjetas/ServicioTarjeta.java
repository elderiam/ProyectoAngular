package tarjetas;


import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicioTarjeta {
        Tarjeta obtenerSaldo(){
            return  new Debito();
    }
}
