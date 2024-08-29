# Usar una imagen de base con Node.js
FROM node:18-alpine AS build

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar los archivos necesarios al contenedor
COPY package.json .
COPY package-lock.json .
COPY . .

# Instalar las dependencias y construir la aplicación
RUN npm install
RUN npm run build

# Crear una segunda etapa más pequeña para servir la aplicación
FROM nginx:stable-alpine

# Copiar los archivos construidos desde la primera etapa
COPY --from=build /app/build /usr/share/nginx/html

# Exponer el puerto en el que se ejecuta la aplicación
EXPOSE 80

# Ejecutar Nginx
CMD ["nginx", "-g", "daemon off;"]


