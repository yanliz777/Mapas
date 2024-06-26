package co.edu.uniquindio.mapas.modelo;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter

/*
Esta clase no es un @Document, es decir, no se convertirá en una colección propia en
MongoDB sino que hará parte de la colección transacciones. Esto se hace así ya que el pago
depende exclusivamente de una transacción. Sin una transacción el pago no
tendría sentido, por lo tanto tener una colección para solo los pagos no es recomendable.
 */
public class Pago {
    private String codigo;
    private LocalDateTime fecha;
    private float totalPagado;
    private String estado;
    private String metodoPago;
}

