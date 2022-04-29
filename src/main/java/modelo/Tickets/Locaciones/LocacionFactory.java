package modelo.Tickets.Locaciones;

public class LocacionFactory {

    public LocacionFactory(){
    }

    public Locacion getLocacion(String tipo){

        if (tipo == null){
            return null;
        }
        else if (tipo.equalsIgnoreCase("HOME OFFICE")){
            return new LocacionHomeOffice();
        }
        else if (tipo.equalsIgnoreCase("PRESENCIAL")){
            return new LocacionPresencial();
        }
        else if (tipo.equalsIgnoreCase("INDISTINTO"))
            return new LocacionIndistinto();

        return null;



    }
}