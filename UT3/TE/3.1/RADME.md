# TE3.1 - Configuración de Eclipse y JetBrains IntelliJ IDEA

En esta tarea de aprendizaje, aprenderás a instalar el JDK y JREs en Windows y Linux, y a configurar Eclipse y JetBrains IntelliJ IDEA.

## Recursos

- [Instalación del JDK en Linux](https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html)
- [Instalación del JDK en Windows](https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html)

### Objetivos

- Conocer cómo instalar el JDK/JRE en Windows y Linux.
- Conocer cómo configurar Eclipse y JetBrains IntelliJ IDEA para utilizar un JDK.
- Conocer cómo configurar Windows y Linux a nivel de sistema para utilizar diferentes versiones de Java.
- Conocer cómo instalar y usar la herramienta SDKMan para instalar diferentes versiones de Java en Linux/MacOS/Windows.

### Recursos

**GIF Videos**

- [Software crear GIFs animados para Windows](https://www.screentogif.com/)
- [Software crear GIFs animados para Linux](https://github.com/phw/peek)
- [Herramienta Online GIF](https://ezgif.com/video-to-gif)

### Entrega

El documento justificativo de la realización de la tarea se realizará en formato `Markdown`, el nombre del fichero será `readme.md` y estará dentro de la carpeta `UT3\TE3.1` dentro del repositorio oficial del alumno para la asignatura.

El fichero `readme.md` debe contener los siguientes apartados:

- Cada uno de los puntos de la tarea.

### 1. Configuración de Java en Windows y Linux

1. Revisa la configuración de tu máquina a través del terminal e indica la versión de Java que tienes instalada.

```bash
# Comprueba la versión de Java instalada
$> java -version
# Comprueba donde está instalado Java
$> where java
# Busca todas las versiones de Java instaladas
$> which java
```

📎 _Adjunta una imagen de los comandos anteriores y responde a las siguientes preguntas_
[01](img/01.png)

    ¿Qué versión de Java tienes instalada?
    
    la version 23.0.2

    ¿Cuantas versiones de Java tienes instaladas? ¿ Por qué?

    tengo dos versiones, porque las instalé en clase, pero solo me aparece una en git bash

    Si tienes más de una versión indica todas las versiones y rutas de instalación.

    tengo tambien insatalada la 21

2. Variables de entorno.

   📎 _Adjunta una imagen de las variables de entorno de tu sistema, tanto a nivel de usuario como a nivel de sistema._

   [02](img/02.png)

   - Muestra a través de interfaz (Ventana de windows) (Usuarios y sistema) [02](img/03.png)
   - Muestra a nvel de comandos (Solo usuario) (`set`) [02](img/04.png)
   - Muestra el contenido de la variable `PATH` (`echo %PATH%`) y de la variable `JAVA_HOME` (`echo %JAVA_HOME%`)
  [05](img/05.png)

3. Instala el JDK 19 la implementación de Adoptium (Windows)

   - Ves a la página de [Adoptium](https://adoptium.net/) y descarga la versión de Java 19 para Windows y la arquitectura de tu PC (x32/x64).
     (Incluye un gif de la instalación)[05](img/06.png)

   - Una vez instalado, muestra la versión de Java instalada y la ruta de instalación. (a través de comandos y adjunta una imagen)
     (`java -version` y `where java`)[05](img/07.png)

   - ¿ La versión de Java que te muestra es la 19? ¿ Por qué?
   - la version qeu aparece es la 21, porque en las variabs de entorno, en java_home tiene la ruta a la version 21.

4. Configura tu sistema para que utilice la versión de Java 19 como versión por defecto a nivel de usuario. (Si ya lo tienes explica por qué)

   - ¿ Cómo has configurado tu sistema para que utilice la versión de Java 19 como versión por defecto?
  

he cambiado la ruta de la variable de entorno JAVA_HOME , y le he puesto la ruta de la version 19.[08](img/08.PNG)

### 2. Utilización de SDKMan

5. Instala SDKMan en Windows. (_Para ello puedes seguir la guía disponible [aquí](../docs/doc_sdkman.md)_)

   - Instala SDKMan en Windows e explica los pasos que has seguido, adjunta una captura final de SDK funcionando.
[2.1](img/2.1.PNG)
   - Muestra la versión de SDKMan instalada
[2.2](img/2.2.PNG)
   - ¿ Dónde se ha instalado SDKMan? ¿ Por qué?
  
se ha intalado aqui:
C:\Users\mario\.sdkman

   - Muestra las versiones de Java que tienes instaladas a través de SDKMan
  
actualmente no me aparece que tenga ninguna version que aparezaca en sdkman

   - ¿ Qué ventajas tiene instalar SDKMan?
  
la rapidez a la hora de descargar versiones de java,etc

   - ¿ Instala la versión de Jara 8.0_302-zulu a través de SDKMan ?
[2.3](img/2.3.PNG)

   - ¿ Instala la versión de Java 11.0.12-zulu a través de SDKMan ?
[2.4](img/2.4.PNG)

   - ¿ Instala la versión de Java 17.0.0-zulu a través de SDKMan ?
[2.5](img/2.5.PNG)

1. Configura tu sistema para que utilice la versión de Java 17.0.0 como versión por defecto a nivel de usuario. (Para que las aplicaciones que ejecutes utilicen esta versión de Java)

he cambio la ruta de JAVA_home,para que utilice las versiones de java de sdkman, la ruta es la siguiete:
C:\Users\mario\.sdkman\candidates\java\current
[2.6](img/2.6.PNG)

   - ¿ Qué tienes hacer o comando tienes que utilizar (SDKMAN) para que una aplicación ejecutada desde la interfaz (Windows o Linux) utilize esa versión de Java?

sdk default java <version que desees>.

   - ¿ Qué variable de Entorno tienes que modificar para que una aplicación ejecutada desde la interfaz (Windows o Linux) utilize esa versión de Java?

java_home, como ya he explicado anteriormente, poniendole la ruta C:\Users\mario\.sdkman\candidates\java\current
ya utilizaria la verion qeu tiene el sdkman predefinida.

1. Si necesitas compilar una aplicación de Java desde la terminal, fuera del IDE, y necesita compilarse con la version de Java 8, ¿ Cómo lo harías?

   - ¿ Qué comando de SDKMAN tienes que utilizar para que a nivel de la terminal actual use la versión de Java 8?
  
  suponiendo que el sdkamn tiene instalada la version java 8, utilizaria : sdk use java 8

   - ¿ Qué comando utilizas para compilar una aplicación de Java ?
   - 
  el comando seria : javac <nombreDelaAplicacion>

1. Un proyecto en el que estas trabajando, neceseita la versión de Java 11, pero requieres compilarlo con esa versión, pero no quieres tener siempre que recordar esto, y quieres que se active automáticamente esa versión una vez accedas al directorio del proyecto.

   - ¿ Cómo puedes realizar esto con SDKMAN ? (indica los comandos que tienes que utilizar y la configuración de la herramienta)
tengo que crear lo siguient:
cd /ruta/a/tu/proyecto
touch .sdkmanrc
nano .sdkmanrc
en nano ponemos lo siguiente : java=11.0-open 
guardamos y cerramos nano
   - Haz una captura de pantalla entrando y saliendo del directorio del proyecto, para ver cono se activa y desactiva una versión y otra de Java.
[2.6](img/2.7.PNG) [2.6](img/2.8.PNG), LO HE HECHO CON ESTAS VERSIONES POR QEU SON LAS QEU TENIA YA DESCARGADAS, Y NO TENGO MAS MEMORIA.

1. Ahora en Eclipse, configura el JDK 17 descargado con SDKMAN, como JDK por defecto.

   - ¿ Cómo has configurado Eclipse para que utilice el JDK 17 descargado con SDKMAN? (Muestra una captura de pantalla)
   [2.9](img/2.9.PNG)

   - Inicia un nuevo proyecto (TE21-Paso9) en Eclipse y muestra la versión de Java que aparece por defecto para el Workspace. (Muestra una captura de pantalla)
   [2.9](img/2.10.PNG)

   - Cambia la versión de Java del proyecto para que utilize la versión de Java 8. (Muestra una captura de pantalla)
   [2.9](img/2.11.PNG)

### 3. Utilización de JetBrains IntelliJ IDEA y Eclipse

10. Crea un nuevo proyecto en IntelliJ IDEA (TE21-Paso10) y configura en ese directorio, con SDKMAN para que utilize la versión de Java 11.

- Ahora al abrir IntellJ IDEA, debe activar esa versión automaticamente, pues detectar la configuración. (Incluye una captura de panntalla o GIF de la configuración))

[3.1](img/3.1.PNG)

11. Importar el proyecto TE21-Paso9 en IntelliJ IDEA que has creado en Eclipse.

- Revisa la configuración de la versión de Java que utiliza el proyecto ¿Es la misma que utiliza Eclipse?. (Muestra una captura de pantalla)
  Explica según tu opinión y en base a la configuración aplicada al proyecto de Eclipse realizada en el paso 9, si debe ser la misma versión de JDK en ambos proyectos o si esto depende de otras configuraciones extenas al proyecto.

  me deja abrirlo y modificarlo, esto se deba que es uan version inferior a la 11 por eso me deja abrirlo.

12. Crea un nuevo proyecto en IntelliJ IDEA (TE21-Paso12) que se guarde en la carpeta TE21-Paso12.

- Configura el proyecto para que utilice la versión de Java 17 descargada con SDKMAN. (Muestra una captura de pantalla de la configuración del fichero .sdkmanrc)
- Agrega otro módulo al proyecto, que se guarde en la carpeta Modulo2.
- Agrega otro módulo al proyecto, que se guarde en la carpeta Modulo3.

(Muestra una captura de pantalla de la estructura del proyecto en IntelliJ IDEA)

- Vincula el proyecto principal, con los módulos 2 y 3. (Muestra una captura de pantalla de la configuración de los módulos)

13. En el módulo 2, crea una clase que se llame `Utilidades` y que tenga un método que se llame `calculadora` y que tenga los métodos de suma, resta, multiplicación y división.

(Muestra el código de la clase `Utilidades` con un bloque de código)

14. En el módulo 3, crea una clase llamada `Conversor` que tenga un método que se llame `Texto_to_Uppercase` que convierta un texto a mayúsculas, y otro método que se llame `Texto_to_Lowercase` que convierta un texto a minúsculas.

(Muestra el código de la clase `Conversor` con un bloque de código)

15. En el módulo principal, crea una clase llamada `Principal` que tenga un método `main` que instancie las clases `Utilidades` y `Conversor` y que muestre por consola el resultado de las operaciones de la clase `Utilidades` y el resultado de las operaciones de la clase `Conversor`.

(Muestra un gif donde se muestre la ejecución del programa, en depuración y se visualice que no existen errores de compilación ni ejecución).
