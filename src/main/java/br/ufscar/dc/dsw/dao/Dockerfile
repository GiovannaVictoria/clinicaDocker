FROM mysql:8.0.41

LABEL maintainer="giovannavictoriarossetto@gmail.com"

ENV MYSQL_ROOT_PASSWORD=p4sswd2DSW1!
ENV MYSQL_DATABASE=ClinicaSpring

COPY schema.sql /docker-entrypoint-initdb.d/

EXPOSE 3306
