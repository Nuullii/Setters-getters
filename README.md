# Proyecto Clase Persona en Java

## Descripci  n

Este proyecto implementa una clase `Persona` en Java, que representa a una persona con atributos como nombre, edad y direcci  n.

## Clase Persona

La clase `Persona` tiene los siguientes atributos:

- `nombre`: String que almacena el nombre de la persona.
- `edad`: int que representa la edad de la persona.
- `direccion`: String que guarda la direcci  n de la persona.

## M  todos

### `Persona()`

Constructor por defecto que inicializa una persona sin valores espec  ficos.

### `Persona(String nombre, int edad, String direccion)`

Constructor que permite crear una persona con valores espec  ficos para nombre, edad y direcci  n.

### `getNombre(): String`

M  todo que devuelve el nombre de la persona.

### `setNombre(String nombre)`

M  todo que establece el nombre de la persona.

### `getEdad(): int`

M  todo que devuelve la edad de la persona.

### `setEdad(int edad)`

M  todo que establece la edad de la persona.

### `getDireccion(): String`

M  todo que devuelve la direcci  n de la persona.

### `setDireccion(String direccion)`

M  todo que establece la direcci  n de la persona.

## Ejemplo de Uso

```java
// Crear una instancia de Persona
Persona persona = new Persona("John Doe", 30, "123 Main St");

// Obtener y mostrar informaci  n
System.out.println("Nombre: " + persona.getNombre());
System.out.println("Edad: " + persona.getEdad());
System.out.println("Direcci  n: " + persona.getDireccion());

// Modificar la direcci  n
persona.setDireccion("456 Oak St");

// Mostrar la nueva direcci  n
System.out.println("Nueva Direcci  n: " + persona.getDireccion());
