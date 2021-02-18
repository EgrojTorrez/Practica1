public class Practica1
{
    public static void main(String args[]) {

        Alumno alumno1 = new Alumno();
        int opcion;
        do {
            Impresiones.menu();
            opcion = CapturaEntrada.capturarEntero("Ingrese su opcion");
            switch (opcion)
            {
                case 1:
                    alumno1.setNombre(CapturaEntrada.capturarString("Nombre"));
                    alumno1.setGenero(CapturaEntrada.capturarString("Genero"));
                    alumno1.setDireccion(CapturaEntrada.capturarString("Direccion"));
                    alumno1.setTelefono(CapturaEntrada.capturarString("Telefono"));
                    alumno1.setCalificaciones(CapturaEntrada.capturarEntero("Numero de calificaciones a ingresar"));
                    break;
                case 2:
                    Impresiones.calificaciones(alumno1.califs);
                    System.out.println("El promedio de las calificaciones es: " + Operaciones.promedio(alumno1.califs));
                    break;
                case 3:
                    Impresiones.calificaciones(alumno1.califs);
                    System.out.println("La calificacion menor es: " + Operaciones.menor(alumno1.califs));
                    break;
                case 4:
                    Impresiones.calificaciones(alumno1.califs);
                    System.out.println("La calificacion mayor es: " + Operaciones.mayor(alumno1.califs));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    Impresiones.error();
                    break;

            }
            Impresiones.limpiezaPantalla();
        }while (opcion != 5);

    }
}
