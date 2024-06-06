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
		
		double sumatorioSalarioRRHH= 0.0;
		double sumatorioSalarioINFORMATICA= 0.0;
		double sumatorioSalarioJURIDICO = 0.0;
	
		
		int totalSalarioRRHH = 0;
		int totalSalarioINFORMATICA = 0;
		int totalSalarioJURIDICO = 0;
		
		double salarioPromedioRRHH = 0.0;
		double salarioPromedioINFORMATICA = 0.0;
		double salarioPromedioJURIDICO= 0.0;
		
		for (Empleado e : empleados) 
		{
			if (e.getDepartamento().equals(Dpto.RRHH)) {
			sumatorioSalarioRRHH +=e.getSalario();
			totalSalarioRRHH++;}
	
		else if (e.getDepartamento().equals(Dpto.INFORMATICA)) {
			sumatorioSalarioINFORMATICA +=e.getSalario();
			totalSalarioINFORMATICA++;}
		else {
			sumatorioSalarioJURIDICO+=e.getSalario();
			totalSalarioJURIDICO++;} 
		}
		

		salarioPromedioRRHH = sumatorioSalarioRRHH / totalSalarioRRHH;
		salarioPromedioINFORMATICA = sumatorioSalarioINFORMATICA / totalSalarioINFORMATICA;
		salarioPromedioJURIDICO = sumatorioSalarioJURIDICO / totalSalarioJURIDICO;
	
		
		System.out.println("Salario promedio en RRHH: " +salarioPromedioRRHH);
		System.out.println("Salario promedio en INFORMATICA: " +salarioPromedioINFORMATICA);
		System.out.println("Salario promedio en JURIDICO: " +salarioPromedioJURIDICO);
	
		
		/* PUNTO 6- CREAR UN ARRAY QUE PERMITA ALMACENAR OBJETOS EMPLEADOS Y ESTUDIANTES*/
		/*Esta creado ya el constructor de empleado

		Empleado emp1=new Empleado String ("Luis", "50");
		Empleado emp2=new Empleado (String "Lorena", "38");}
    
		
		Estudiante[] estudiante= {
		Estudiante arr[]= {
				new Estudiante("Tamara","41"), 
				new Estudiante("Carlos","34"), 
				new Estudiante ("Pepe")};
		};
			
		for (int i=0; i <arr.legth;i++)
	
		{}
			System.out.println(arr[i]);
		
	
		}*/
				
		    
		
    }			
};
    


