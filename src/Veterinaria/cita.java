/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class cita {
    String Fecha;
    String Hora;
    String TipoCita;
    Date fecha;
    

    public cita(String Fecha, String Hora, String TipoCita) throws ParseException {
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.TipoCita = TipoCita;
        SimpleDateFormat dateFormatter =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.fecha = dateFormatter.parse(Fecha+" "+Hora+":00");

    }
    private static final Logger LOG = Logger.getLogger(cita.class.getName());

    @Override
    public String toString() {
        return "cita{" + "Fecha=" + Fecha + ", Hora=" + Hora + ", TipoCita=" + TipoCita + ", fecha=" + fecha + '}';
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public void setTipoCita(String TipoCita) {
        this.TipoCita = TipoCita;
    }
            
}
