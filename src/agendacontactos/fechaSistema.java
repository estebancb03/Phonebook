/*
    Descripción: Clase que genera la fecha actual del sistema para desplegarla
                 al usuario.
    Autor: Esteban Castañeda Blanco
*/
package agendacontactos;
import java.util.Date; //Clase para manejar los comandos de fecha

public class fechaSistema {
    
    //Método para obtener la fecha del sistema
    public String formatoFecha()
    {
        int dia, mes, año;
        Date f = new Date();
        dia = f.getDate(); //Se obtiene el dia
        mes = f.getMonth() + 1; //Se obtiene el mes
        año = f.getYear() + 1900; //Se obtiene el año
        return dia + "/"+ mes+"/"+año; //Retorna la fecha con formato "dia/mes/año"
    }
}
