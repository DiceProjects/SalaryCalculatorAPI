# Calcular Sueldo

## Visión del Producto

El producto final será una aplicación móvil diseñada para permitir a los usuarios, ya sean invitados o registrados, calcular su sueldo neto después de deducciones fiscales y otros factores específicos según el país. Se enfoca en proporcionar una interfaz intuitiva y una experiencia de usuario eficiente para facilitar cálculos rápidos y precisos.

## Objetivos del Producto

- **Cálculo de Sueldo Neto**: Facilitar a los usuarios el ingreso de su sueldo bruto y otros detalles relacionados para calcular automáticamente el sueldo neto basado en regulaciones fiscales específicas del país seleccionado.
- **Sesión de Usuario**: Opción para ingresar como invitado o registrarse para funciones adicionales en versiones futuras.
- **Historial de Cálculos**: Mantener un historial accesible de cálculos para usuarios registrados e invitados.
- **Almacenamiento de Datos**: Guardar detalles de cada cálculo en formato JSON para uso interno.
- **Configuraciones Dinámicas**: Permitir al administrador configurar parámetros específicos de países, impuestos y deducciones sin necesidad de modificar el código fuente.
- **Backoffice para Configuraciones**: Facilitar la administración interna con un backoffice para la configuración dinámica.
- **Segmentación y Análisis de Datos**: Analizar la información del usuario para segmentar, crear KPIs e indicadores.

## Flujo de Uso

1. **Inicio de Sesión/Registro/Invitado**: Opciones de autenticación segura para los usuarios.
2. **Formulario de Cálculo**: Los usuarios llenan un formulario con detalles salariales para obtener una ficha con deducciones y sueldo neto.
3. **Historial de Cálculos**: Revisión de cálculos pasados con detalles de sueldo bruto y neto.
4. **Configuración de País y Parámetros**: Administración de parámetros fiscales y deducciones por país desde el backoffice.
5. **Análisis de Datos**: Uso de datos recopilados para análisis y toma de decisiones informadas.

## Requisitos Previos

A tener en cuenta, se necesita tener instalado lo siguiente para trabajar con el repositorio.
1. **Docker Desktop - Para levantar un contenedor de MongoDB. (Requerido)
2. **Chocolatey - Para instalar Maven. (No Requerido)
3. **Maven Chocolatey - Para ejecutar comandos mvn desde la terminar. (No requerido)
4. **MogoDB Compass - Para visualizar los datos insertados en la BD. (No requerido)
5. **Java 17 - Para correr el proyecto. (Requerido)
6. **Git - Para los comandos git desde la terminar. (No requerido)

## Instalación

### Pasos Requeridos

#### Docker Desktop

- Descarga e instala Docker Desktop desde el [sitio oficial](https://www.docker.com/products/docker-desktop).
- Verifica la instalación ejecutando `docker --version` en tu terminal.
- Posterior a la instalación debemos ejecutar el siguiente comando `docker run -d --name SalaryCalculator-mongodb -p 27017:27017 -v X:/TuCarpeta/MongoBD/a/datos/mongodb:/data/db mongo` para crear el contenedor, teniendo en cuenta cambiar la ruta de la carpeta donde instalarás en tu local.

#### Java 17

- Descarga Java 17 desde [AdoptOpenJDK](https://adoptopenjdk.net/) o cualquier otra distribución de Java que prefieras.
- Instala Java y verifica la instalación con `java -version` en tu terminal.

### Pasos Opcionales

#### Chocolatey (Solo para Windows)

- Instala Chocolatey ejecutando el siguiente comando en una terminal como administrador:

  ```powershell
  Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))
  ```

- Verifica la instalación con `choco -v`.

#### Maven (Si usas Chocolatey)

- Instala Maven ejecutando `choco install maven`.
- Verifica la instalación con `mvn -v`.

#### MongoDB Compass

- Descarga e instala MongoDB Compass desde el [sitio oficial](https://www.mongodb.com/products/compass).

#### Git

- Descarga e instala Git desde [git-scm.com](https://git-scm.com/).
- Verifica la instalación con `git --version`.

### Clonar el Repositorio

- Clona el repositorio a tu máquina local con:

  ```bash
  git clone [URL del repositorio]
  ```

### Actualizar el aplication.properties

- Modificar la configuración cambiando los valores IP de `spring.data.mongodb.host=` y `spring.data.mongodb.uri=` con `localhost` o la ip de la red `[IP]`.
- Para saber la ip de la red se debe usar el comando `ipconfig` en la terminal y capturar el valor de ` Dirección IPv4. . . . . . . . . . . . . . : [IP]`.

### Ejecutar el Proyecto

- Navega al directorio del proyecto y ejecuta:

  ```bash
  mvn spring-boot:run
  ```

## Cómo Contribuir

Para contribuir a este proyecto, por favor considere los siguientes pasos:
1. **Fork el repositorio**: Realiza un fork del proyecto a tu cuenta de GitHub.
2. **Clona tu fork**: Trabaja en tu copia local del proyecto.
3. **Envía Pull Requests**: Asegúrate de describir claramente tus cambios y la razón detrás de ellos.

## Licencia

Este proyecto está licenciado bajo [MIT LICENSE] - vea el archivo [LICENSE.md](LICENSE.md) para más detalles.
