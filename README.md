

# Sistema de Entregas con Drones Autónomos

## Descripción del Proyecto
Este sistema fue desarrollado aplicando Programación Orientada a Objetos en Java para simular el funcionamiento de drones autónomos utilizados en entregas inteligentes.

## Decisiones de Diseño
- Se creó una clase abstracta `Dron` para almacenar atributos y métodos comunes de todos los drones.
- Se aplicó herencia mediante las clases `DronLiviano`, `DronCarga` y `DronEmergencia`.
- Los métodos `calcularCostoEntrega()` y `validarDatos()` fueron sobrescritos utilizando `@Override`.
- Se implementaron setters con validaciones para controlar peso, horas de vuelo y nivel de prioridad.
- Se utilizaron constructores con valores quemados usando `super` para facilitar las pruebas.
- Se empleó `Scanner` para el ingreso de datos y un arreglo de tipo `Dron` para demostrar polimorfismo.
## VIDEO
https://drive.google.com/file/d/148_G-F69YhoJ69S6nKvjfuTBV2PZxgUf/view?usp=sharing

