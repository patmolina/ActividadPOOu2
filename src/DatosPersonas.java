import javax.swing.JOptionPane;

public class DatosPersonas {


    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "B I E N V E N I D O \n Registro de datos"); // Msje bienvenida

        // Ingreso de la informaci[on solicitada. Si no cumple con las validaciones vuelve a solicitar el ingreso
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su Nombre");
        while (!validarNomAp(nombre) || nombre.isEmpty()) {
            nombre = JOptionPane.showInputDialog(null, "Debe ingresar un nombre válido");
        }
        String apellido = JOptionPane.showInputDialog(null, "Ingrese su Apellido");
        while (!validarNomAp(nombre) || apellido.isEmpty()) {
            apellido = JOptionPane.showInputDialog(null, "Debe ingresar un apellido válido");
        }
        String edad = JOptionPane.showInputDialog(null, "Ingrese su edad");
        while (!validarEdad(edad) || edad.isEmpty()) {
            edad = JOptionPane.showInputDialog(null, "Debe ingresar una edad válida (0-99)");
        }
        String hobbie = JOptionPane.showInputDialog(null, "Cuál es su hobbie?");
        while (!validarSopEdHob(hobbie) || hobbie.isEmpty()) {
            hobbie = JOptionPane.showInputDialog(null, "Debe ingresar un hobbie válido");
        }
        String editor = JOptionPane.showInputDialog(null, "Cuál es editor de código preferido?");
        while (!validarSopEdHob(editor) || editor.isEmpty()) {
            editor = JOptionPane.showInputDialog(null, "Debe ingresar un editor válido");
        }
        String sistOp = JOptionPane.showInputDialog(null, "Qué sistema operativo utiliza?"); // Ingresar Sist Operativo
        while (!validarSopEdHob(sistOp) || sistOp.isEmpty()) {
            sistOp = JOptionPane.showInputDialog(null, "Debe indicar un sistema operativo válido");
        }

        JOptionPane.showMessageDialog(null, "Gracias por completar con los datos");

        //Impresión de los datos ingresados por consola
        System.out.println("Registramos sus datos correctamente \n");
        System.out.println("Nombre: " + nombre + " - " + " Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Su editor de código preferido: " + editor);
        System.out.println("Sistema operativo utilizado: " + sistOp);

    }
    public static boolean validarNomAp(String texto){  // validar datos con caracteres de texto y espacios
            return texto.matches("[a-z,A-z, ]*");
        }
    public static boolean validarEdad (String num){  // validar datos con caracteres numéricos y hasta 2 dígitos
            return num.matches("[0-9]{1,2}");
        }
    public static boolean validarSopEdHob(String texto1) {  // validar datos con caracteres de texto y número, . y espacios
        return texto1.matches("[a-z,A-z,0-9,., ]*");
    }
} //Fin del programa