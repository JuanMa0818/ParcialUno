# Parcial 1 - QuindíoExpress

Sistema que organiza los paquetes de una empresa de mensajería y los asigna a sus repartidores, usando estructuras de datos hechas por nosotros (sin las listas de Java).

## Integrantes

- Juan Manuel
- Natalia
- José Gabriel

## Requisitos

- Java 25
- Maven (o IntelliJ IDEA)

## Cómo correr

**En IntelliJ:** clic derecho > Run sobre una de estas clases:

- `co.edu.uniquindio.app.Main` (el programa principal)
- `co.edu.uniquindio.prueba.TodasLasPruebas` (todas las pruebas)

**Por consola:**

```bash
mvn compile test-compile
java -cp "target/classes;target/test-classes" co.edu.uniquindio.prueba.TodasLasPruebas
```

En Mac/Linux se usa `:` en vez de `;` en el classpath.

No usamos JUnit. Las pruebas se hacen con nuestro propio ayudante `util.Prueba`.

## Paquetes

| Paquete | Para qué sirve |
|---|---|
| `modelo` | Las clases de datos (paquetes, repartidores, etc.) |
| `comparadores` | Las reglas para comparar y ordenar |
| `estructuras` | Nuestras estructuras de datos (lista enlazada, etc.) |
| `servicio` | La lógica del sistema |
| `algoritmos` | Los algoritmos (ordenamiento, búsqueda) |
| `datos` | Los datos iniciales quemados (paquetes y repartidores) |
| `app` | El programa principal (`Main`) |
| `util` | Ayudantes, como `Prueba` |
| `prueba` | Las pruebas de cada etapa |

## Nota sobre la prioridad

Todavía falta confirmar con el profesor si la prioridad va de 0 a 10 o de 1 a 5.
Por ahora usamos de 1 a 5, con `Paquete.PRIORIDAD_MINIMA` y `Paquete.PRIORIDAD_MAXIMA`.
Nunca se escriben números fijos en el código, así si cambia solo se modifican esas dos constantes.
