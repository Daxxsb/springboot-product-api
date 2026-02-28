# Product API

Este proyecto es una API RESTful desarrollada en Java utilizando el framework Spring Boot. Permite la gestión básica de productos, incluyendo operaciones para listar, consultar por ID y agregar nuevos productos. Es ideal como ejemplo educativo para comprender la arquitectura y el desarrollo de servicios web en Java.

## Características principales

- **Listar productos:** Obtiene todos los productos registrados.
- **Consultar producto por ID:** Recupera la información de un producto específico mediante su identificador.
- **Agregar producto:** Permite crear un nuevo producto proporcionando su nombre y precio.

## Arquitectura

La aplicación sigue una arquitectura en capas, separando responsabilidades en controladores, servicios y modelos:

- **Controller:** Expone los endpoints REST y gestiona las solicitudes HTTP.
- **Service:** Contiene la lógica de negocio y manipula la lista de productos en memoria.
- **Model:** Define la estructura de los datos de producto.

```
com.daxxsb.daxxsb
│
├── controller
│   └── ProductController.java
├── model
│   └── Product.java
└── service
    └── ProductService.java
```

## Endpoints

- `GET /productos` — Lista todos los productos.
- `GET /productos/{id}` — Obtiene un producto por su ID.
- `POST /productos` — Crea un nuevo producto. Ejemplo de cuerpo JSON:

```json
{
  "name": "Producto de ejemplo",
  "price": 99.99
}
```

## Ejecución

1. **Requisitos previos:**
   - Java 17 o superior
   - Maven

2. **Clonar el repositorio:**
   ```bash
   git clone <url-del-repositorio>
   cd daxxsb
   ```

3. **Compilar y ejecutar:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Probar la API:**
   Utiliza herramientas como Postman o cURL para interactuar con los endpoints.

## Notas técnicas

- Los productos se almacenan en memoria (no persisten tras reiniciar la aplicación).
- El identificador de producto se autoincrementa automáticamente.
- El proyecto es fácilmente extensible para agregar nuevas funcionalidades o integrar una base de datos.

## Autor

Desarrollado por Daxxsb para fines educativos en la materia ARSW.

---

¡Siéntete libre de contribuir o adaptar este proyecto para tus propios fines de aprendizaje!
