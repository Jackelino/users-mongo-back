# Users back Spring
## Especificaciones
Para poder funcionar la aplicación debes instalar java jdk >= 18, ademas utiliza MongoDB como gestor, este puedes instalar en un contenedor de Docker,
para ello se sugiere utilizar [Docker Desktop](https://www.docker.com/products/docker-desktop/)
## Instalación

1. Descargar el repositorio de git, a través de `git clone` o en zip.

2. Instalar `Maven` pára usu de las dependecias.
3. Para configurar **Docker** con el archivo  `docker-compose.yml` utiliza el siguente comando:
```
docker compose up
```
4. Para eliminar la configuración de **Docker**, utiliza el siguiente comando:
```
docker compose down
```
>[!IMPORTANT]
>
>Para poder utlizar los comando anterios debe estar en ejecución **Docker**.