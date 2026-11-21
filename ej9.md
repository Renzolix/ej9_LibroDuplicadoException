# Ejercicio 9: LibroDuplicadoException

## Explicación Lógica
1. **Unicidad de Colección:** `agregarLibro` recorre la lista comparando los ISBN antes de insertar una nueva instancia.
2. **Interrupción Defensiva:** Si detecta coincidencia, lanza la excepción de tiempo de ejecución `LibroDuplicadoException` para impedir registros redundantes en la estructura de datos.