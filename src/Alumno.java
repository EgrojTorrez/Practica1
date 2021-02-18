import java.util.Arrays;

class Alumno {
 String nombre, telefono, correo, genero;
 Calificaciones califs[];
 int promedio;

	public void setNombre(String nom){
	  nombre = nom;
	}

	public void setTelefono(String tel){
	  telefono = tel;
	}

	public void setDireccion(String corr){
	  correo = corr;
	}

	public void setGenero(String gen){
	  genero = gen;
	}

	public void setPromedio(int prom){
	  promedio = prom;
	}
	
	public void setCalificaciones(int nummat){
	  califs = new Calificaciones[nummat];
	  
	  /*
	  for (int i = 0; i < nummat; i++){
		  califs[i]= new Calificaciones();
	  }
	  */
	  
	  for (int i = 0; i < nummat; i++){
		  califs[i]= new Calificaciones();
		  califs[i].materia = CapturaEntrada.capturarString("Nombre de materia");
		  califs[i].calificacion = CapturaEntrada.capturarEntero("Calificación");

	  }
	} 

	public String getNombre(){
	  return nombre;
	} 

	public String getTelefono(){
	  return telefono;
	} 

	public String getCorreo(){
	  return correo;
	} 

	public String getGenero(){
	  return genero;
	} 



}