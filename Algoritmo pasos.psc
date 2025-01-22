Algoritmo por_casos
	imprimir "capture un numero"
	leer x
	imprimir "capture otro numero cualquiera"
	leer r
	Borrar Pantalla
	imprimir "Menu inicial"
	imprimir "1.- Suma"
	Imprimir "2.- Resta"
	Imprimir "3.- Multiplicacion"
	imprimir "Elige una opcion del uno al tres"
	leer b
	segun b Hacer
		1:
			a=x+r
			Imprimir "el resultado de la suma es:  " , a
	        2:
			e=x-r
			imprimir "el resultado de la resta es: "  , e
		3:
			m=x*r
			imprimir "el resultado de la multiplicacion es:  " , m
	FinSegun
FinAlgoritmo
