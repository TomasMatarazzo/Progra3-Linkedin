package modelo.usuarios;

import modelo.excepciones.DatosMalIngresadosException;
import modelo.excepciones.ErrorDeUsuarioException;
import modelo.Sistema;
import modelo.usuarios.empleadores.Empleador;

public class UsuarioFactoryExtendida extends UsuarioFactory {

    public void creaUsuario(String nombreUsuario, String contrasena, String tipo, String nombre, String apellido, String telefono, int edad, String mail) throws DatosMalIngresadosException, ErrorDeUsuarioException {
        super.creaUsuario(nombreUsuario,contrasena,tipo);

        EmpleadoPretenso empleado;
        empleado = Sistema.getInstance().getEmpleadosPretensos().get(Sistema.getInstance().getEmpleadosPretensos().size()-1);

        empleado.setNombre(nombre.isEmpty()?"-":nombre);
        empleado.setApellido(apellido.isEmpty()?"-":apellido);
        empleado.setTelefono(telefono.isEmpty()?"-":telefono);
        empleado.setEdad(edad);
        empleado.seteMail(mail.isEmpty()?"-":mail);
    }

    public void creaUsuario(String nombreUsuario, String contrasena, String tipo, String razonSocial, String rubro) throws ErrorDeUsuarioException, DatosMalIngresadosException {
        super.creaUsuario(nombreUsuario,contrasena,tipo);

        Empleador empleador;
        empleador = Sistema.getInstance().getEmpleadores().get(Sistema.getInstance().getEmpleadores().size()-1);

        empleador.setRazonSocial(razonSocial);
        empleador.setRubro(rubro);
    }
}
