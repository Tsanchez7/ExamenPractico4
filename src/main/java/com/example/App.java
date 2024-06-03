package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Empleado[] empleados = {
				Empleado.builder()
				.nombre("Adrian")
				.primerApellido("Sanchez")
				.segundoApellido("Diaz")
				.genero(Genero.HOMBRE)
				.departamento(Dpto.INFORMATICA)
		    	.build(),
				Empleado.builder()
				.nombre("Tamara")
				.primerApellido("Santos")
				.segundoApellido("Font") 
				.genero(Genero.MUJER)
				.departamento(Dpto.RRHH)
				.build(),
				Empleado.builder()
				.nombre("Sandra")
				.primerApellido("Llorens")
				.segundoApellido("Lopez")
				.genero(Genero.OTRO)
				.departamento(Dpto.JURIDICO)
				.build()
				
		};
			 for (Empleado empleado : empleados)
		    	System.out.println(empleado);
    }
				
		
		
  
		
		
		
    			
		};
    

