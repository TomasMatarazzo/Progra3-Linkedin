package modelo.Usuarios;

public class PersonaJuridica extends Empleador{

    public PersonaJuridica(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    public PersonaJuridica(String nombreUsuario, String contrasena, String tipoPersona, String razonSocial, String rubro) {
        super(nombreUsuario, contrasena, tipoPersona, razonSocial, rubro);
    }

    @Override
    public String getTipo() {
        return "Persona juridica";
    }

    @Override
    public double calculaPorcentajeComision() {
        if (this.getRubro().equalsIgnoreCase("SALUD"))
            return 0.80;
        else if (this.getRubro().equalsIgnoreCase("COMERCIO LOCAL"))
            return  0.90;
        else //Es rubro COMERCIO INTERNACIONAL
            return  1.00;
    }
}