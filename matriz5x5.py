# Crear matriz de 5x5 llena de ceros
# Damian Ortega #
matriz = [[0 for _ in range(5)] for _ in range(5)]

# Llenado de la matriz con validación
for i in range(5):
    for j in range(5):
        # Este bucle se repite hasta que el número sea válido
        while True:
            valor = int(input(f"Ingrese un número para [{i}][{j}] (debe ser entre 0 y 4): "))
            
            if 0 <= valor <= 4:
                matriz[i][j] = valor
                break  # Sale del bucle while porque el número es correcto
            else:
                print("¡Error! El número debe estar entre 0 y 4. Intente de nuevo.")

# Impresión de la matriz
print("\nMatriz ingresada:")
for fila in matriz:
    for elemento in fila:
        print(elemento, end="\t")
    print()