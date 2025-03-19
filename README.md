Descripción del Proyecto
Este proyecto presenta una API REST para la administración de una estación de servicio, diseñada para la empresa CONTOSO S.L.. El sistema proporciona funcionalidades para gestionar surtidores, productos de combustible, precios, tanques y registrar operaciones de suministro de combustible.

##################################
Tecnologías Empleadas
Java 17
Spring Boot 3.x
Spring Data JPA
Hibernate
Lombok
MySQL / H2 Database
Maven
######################################
Funcionalidades Clave
Gestión de surtidores: Crear, eliminar y actualizar surtidores.
Manejo de productos de combustible: Gasolina 95, Gasolina 98, Diésel normal, Diésel Premium.
Registro histórico de precios: Control de precios mensuales por producto.
Monitoreo de niveles de combustible: Estado de los tanques en tiempo real.
Registro de operaciones de suministro: Gestión de transacciones de suministro de combustible.
########################################
Estructura del Proyecto
Producto: Definición de los combustibles disponibles.
idProducto (PK)
nombre
descripción
tipo (Gasolina, Diésel)

Precio: Historial de precios por producto.
idPrecio (PK)
idProducto (FK)
fechaInicio
fechaFin
precioPorLitro

Tanque: Representa el almacenamiento de combustible.
idTanque (PK)
código
capacidadMáxima
nivelActual
idProducto (FK)

Suministro: Registra las operaciones de suministro de combustible.
idSuministro (PK)
idSurtidor (FK)
idProducto (FK)
fechaHora
volumenLitros
importeEuros

SurtidorProducto: Relaciona los surtidores con los productos.
idSurtidorProducto (PK)
idSurtidor (FK)
idProducto (FK)
