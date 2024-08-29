# Backend Dockerfile (ubicado en sistema-hoteles-be/Dockerfile)
FROM openjdk:17-jdk-slim AS build

WORKDIR /app

# Copiar los archivos de configuración de Maven
COPY .mvn/ .mvn/
COPY mvnw .
COPY mvnw.cmd .
COPY pom.xml .

# Copiar el código fuente
COPY src/ src/

# Compilar el proyecto
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Crear una imagen ligera para ejecutar la aplicación
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copiar el jar generado
COPY --from=build /app/target/quarkus-app/lib/ /app/lib/
COPY --from=build /app/target/quarkus-app/*.jar /app/
COPY --from=build /app/target/quarkus-app/app/ /app/app/
COPY --from=build /app/target/quarkus-app/quarkus/ /app/quarkus/

# Exponer el puerto
EXPOSE 8080

# Ejecutar la aplicación
CMD ["java", "-jar", "/app/quarkus-run.jar"]

