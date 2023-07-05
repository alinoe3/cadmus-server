FROM eclipse-temurin:18

EXPOSE 8080
LABEL pl.xyz.cadmus.author="Maciej Dresler"

HEALTHCHECK --interval=30s --timeout=3s --retries=1 CMD wget -qO- http://localhost:8080/actuator/health | grep UP || exit 1

WORKDIR /opt/app

RUN addgroup --system javauser && adduser --system --shell /usr/sbin/nologin --ingroup javauser javauser
RUN chown -R javauser:javauser .

ARG JAR_FILE
COPY target/${JAR_FILE} app.jar

USER javauser

ENTRYPOINT ["java", "-jar", "app.jar"]
