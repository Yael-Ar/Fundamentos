Algoritmo Vectores
	Imprimir "Dame la longitud del vector"
	leer x
	d=1
	Dimension vector[x]
	Mientras d<=x Hacer
		Imprimir "Ingresa un numero para la posicion --> " , d
		leer vector[d]
		d=d+1
	FinMientras
	Imprimir "Pulsa enter para continuar"
	leer z
	Imprimir "Se imprimen los valores del vector"
	r=1
	c=0
	Mientras r<=x Hacer
		Imprimir vector[r]
		c=c+vector[r]
		r=r+1
	FinMientras
	Imprimir "La suma total de todos los valores es: "
	Imprimir c
FinAlgoritmo