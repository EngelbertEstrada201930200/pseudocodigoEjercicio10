Algoritmo EJERCICIO10
	
	Definir suma, n, resta, multi, sumab Como Entero
	
	multi=0
	Mientras suma<1000 Hacer
		
		Escribir "Ingrese un numero"
		leer n
		suma= suma+n
		resta= 1000-suma
		Escribir "Disponible " resta
		
		
		Si n mod 6 = 0 Entonces
			multi= multi+1
		Fin Si
		
		Si n >= 1 & n<=10 Entonces
			sumab= sumab+n
		Fin Si
		
		
	Fin Mientras
	
	Escribir " a) La cantidad de numeros multiplos de 6 son: " multi
	Escribir " b) La suma entre 1 a 10 es: " sumab
	
FinAlgoritmo
