FROM nginx:alpine

LABEL maintainer="giovannavictoriarossetto@gmail.com"

COPY nginx.conf /etc/nginx/nginx.conf
COPY ./static/ /usr/share/nginx/html/
COPY ./templates/ /usr/share/nginx/html/

EXPOSE 3000
