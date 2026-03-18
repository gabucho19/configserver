# Usamos una imagen ligera de Java 17
FROM eclipse-temurin:17-jre-alpine

# Directorio de trabajo
WORKDIR /app

# Copiamos el jar (ajusta el nombre según tu proyecto)
COPY target/*.jar configserver.jar

# Exponemos los dos puertos que configuramos
EXPOSE 8080 9090

# Ejecutamos la aplicación
ENTRYPOINT ["java", "-jar", "configserver.jar"]
