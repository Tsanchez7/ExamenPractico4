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
				.salario(2500.20)
		    	.build(),
				Empleado.builder()
				.nombre("Tamara")
				.primerApellido("Santos")
				.segundoApellido("Font") 
				.genero(Genero.MUJER)
				.departamento(Dpto.RRHH)
				.salario(2580.40)
				.build(),
				Empleado.builder()
				.nombre("Sandra")
				.primerApellido("Llorens")
				.segundoApellido("Lopez")
				.genero(Genero.OTRO)
				.departamento(Dpto.JURIDICO)
				.salario(4059.50)
				.build()
				
		};
			 for (Empleado empleado : empleados) {
		    	System.out.println(empleado);
			 }
				/*Recorrer el array de empleados y que aparezca en consola el Salario promedio 
				  agrupado por cada dpto y genero del empleado*/
    
		/*POR GENERO */
    	double sumatorioDeLosSalarios = 0.0;
		double sumatorioDeLosSalariosMujer = 0.0;
		double sumatorioDeLosSalariosHombre = 0.0;
		double sumatorioDeLosSalariosOtro = 0.0;
		
		int totalGeneroHombre = 0;
		int totalGeneroMujer = 0;
		int totalGeneroOtro = 0;
		
		double salarioPromedioHombres = 0.0;
		double salarioPromedioMujer = 0.0;
		double salarioPromedioOtro = 0.0;
		
		for (Empleado e : empleados) 
		{
			if (e.getGenero().equals(Genero.HOMBRE)) {
			sumatorioDeLosSalariosHombre +=e.getSalario();
			totalGeneroHombre++;}
	
		else if (e.getGenero().equals(Genero.MUJER)) {
			sumatorioDeLosSalariosMujer +=e.getSalario();
			totalGeneroMujer++;}
		else {
			sumatorioDeLosSalariosOtro +=e.getSalario();
			totalGeneroOtro++;} 
		}
		
		salarioPromedioHombres = sumatorioDeLosSalariosHombre / totalGeneroHombre;
		salarioPromedioMujer = sumatorioDeLosSalariosMujer / totalGeneroMujer;
		salarioPromedioOtro = sumatorioDeLosSalariosOtro / totalGeneroOtro;
		
		System.out.println("Salario promedio de los Hombres: " +salarioPromedioHombres);
		System.out.println("Salario promedio de las Mujeres: " +salarioPromedioMujer);
		System.out.println("Salario promedio de otros Géneros: " +salarioPromedioOtro);
		
		/*POR DPTO */	
    }			
};
    

