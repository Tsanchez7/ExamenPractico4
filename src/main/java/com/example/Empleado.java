package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@ToString(callSuper=true)

public class Empleado extends Persona {
	private Dpto departamento; 
	private double salario;
	
}
