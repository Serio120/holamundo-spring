# Proyecto Hola Mundo con Spring Boot

## 1. Crear el proyecto en IntelliJ

1. Abre IntelliJ IDEA Community Edition.

2. Ve a File > New > Project.

3. Selecciona Maven en el panel izquierdo.

4. Haz clic en Next.

**Configura:**

1. GroupId: com.ejemplo

2. ArtifactId: holamundo

3. Version: 1.0-SNAPSHOT

4. Haz clic en Next, luego en Finish.

5. Espera a que se cree el proyecto y se abra en IntelliJ.

## 2. Configurar el archivo pom.xml (archivo de dependencias)

1. Abre el archivo **pom.xml** y reemplaza su contenido con lo siguiente:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ejemplo</groupId>
    <artifactId>holamundo</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <java.version>17</java.version>
    </properties>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.1.2</version> <!-- Usa la versión estable más reciente -->
        <relativePath/> <!-- lookup parent from repository -->
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

```
Haz clic en el ícono de Maven reload para que IntelliJ descargue las dependencias.

## 3. Crear estructura de paquetes

1. Crea las siguientes carpetas dentro de src/main/java:

**Ejecuta lo siguiente en la raíz del proyecto: Ejemplo: C:\Users\davinia\IdeaProjects\HolaMundo**

```
mkdir src/main/java/com/ejemplo/holamundo
mkdir src/main/java/com/ejemplo/holamundo/controller
```

2. También asegúrate de tener: src/main/resources/application.properties

```
mkdir src/main/resources

Y luego crea el fichero: 

application.properties

```
## 4. Código del controlador

1. Crea el archivo HolaController.java dentro de com.ejemplo.holamundo.controller:

```java
package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Hola Mundo desde Spring Boot!";
    }
}
```
## 5. Clase principal
1. Crea el archivo HolamundoApplication.java dentro de com.ejemplo.holamundo:

```java
package com.ejemplo.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolamundoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolamundoApplication.class, args);
    }
}
```
## 6. Ejecutar la aplicación

Configura la ejecución del siguiente modo: 

<img width="817" height="692" alt="image" src="https://github.com/user-attachments/assets/3cd797dc-ec8b-4151-a599-4f9f9a5eabbd" />


Debes, al ejecutar ver algo como esto: 

<img width="858" height="446" alt="image" src="https://github.com/user-attachments/assets/a899283b-af11-444a-9db4-5fac8df737f8" />


7. Probar el endpoint
Abre tu navegador y visita:

```
http://localhost:8080/saludo
```

Deberías ver:

```
¡Hola Mundo desde Spring Boot!
```

## Ejercicio (En un proyecto nuevo, llamado Ejercicios_Spring)

1. Crea una petición GET a /sort que permita ordenar alfabéticamente un array con 7 palabras, puedes usar el algoritmo de la burbuja, se deben devolver como respuesta, las palabras ordendas.

2. Crea una petición get a /invert que devuelva un número entero con sus cifras invertidas.
