Algoritmo por_casos
	imprimir "capture un numero"
	leer x
	imprimir "capture otro numero"
	leer r
	Borrar Pantalla
	imprimir "Menu principal"
	imprimir "1.- suma"
	Imprimir "2.- resta"
	Imprimir "3.- multiplicacion"
	imprimir "Elige una opcion"
	leer z
	segun z Hacer
		1:
			a=x+r
			Imprimir "el resultado de la suma es " , a
	    2:
			e=x-r
			imprimir "el resultado de la resta es " , e
		3:
			m=x*r
			imprimir "el resultado de la multiplicacion es " , m
	FinSegun
FinAlgoritmo