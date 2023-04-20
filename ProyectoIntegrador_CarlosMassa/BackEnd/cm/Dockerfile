FROM amazoncorretto:11-alpine-jdk //de que imagen partimos
MAINTAINER CM // quien es el dueño
COPY target/cm-0.0.1-SNAPSHOT.jar cm-app.jar //copia el empaquetado y lo sube a github
ENTRYPOINT ["JAVA","-jar","/cm-app.jar"]       //es la instruccion que se va a ejecutar primero