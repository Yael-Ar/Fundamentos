Algoritmo por_casos
	imprimir "capture un numero"
	leer x
	imprimir "capture otro numero"
	leer r
	Borrar Pantalla
	imprimir "Menu inicial"
	imprimir "4.- Suma"
	Imprimir "5.- Resta"
	Imprimir "6.- Multiplicacion"
	imprimir "Elige una opcion del 1 al 3"
	leer b
	segun b Hacer
		1:
			a=x+r
			Imprimir "el resultado de la suma es: " , a
	        2:
			e=x-r
			imprimir "el resultado de la resta es: " , e
		3:
			m=x*r
			imprimir "el resultado de la multiplicacion es: " , m
	FinSegun
FinAlgoritmo
