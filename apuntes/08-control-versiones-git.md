# Control de Versiones con Git

## ¿Qué es el Control de Versiones?
El control de versiones es una herramienta fundamental en el desarrollo de software
que permite gestionar los cambios en el código fuente de un proyecto a lo largo del
tiempo. Proporciona un historial detallado de las modificaciones, facilita la
colaboración entre equipos y permite revertir a versiones anteriores si es necesario.
En este documento, exploraremos qué es Git, cómo funciona y las diferencias clave
con otros sistemas como Subversion, además de una introducción a GitHub.

## Conceptos Básicos del control de versiones
- Repositorio: Almacén de archivos y su historial de cambios.
- Commit: Registro de cambios en el repositorio.
- Update (Actualizar): Descarga de cambios desde el repositorio
- Branch (Rama): Línea de desarrollo independiente.
- Merge (Combinar): Integración de cambios de una rama a otra.

## ¿Qué es Git?
Git es un sistema de control de versiones distribuido, diseñado para manejar desde
proyectos pequeños hasta proyectos muy grandes con rapidez y eficiencia. Fue
creado por Linus Torvalds en 2005 para el desarrollo del kernel de Linux y desde
entonces se ha convertido en una herramienta esencial para los desarrolladores de
software en todo el mundo.

## Cómo funciona Git
Git utiliza un modelo de datos distribuido, lo que significa que cada desarrollador
tiene una copia completa del repositorio, incluyendo todo el historial de cambios.
Esto permite un trabajo colaborativo sin depender de un servidor centralizado. Los
desarrolladores pueden trabajar de forma independiente en sus propias ramas
(branch) y luego fusionar (merge) sus cambios cuando sea necesario.


El flujo de trabajo típico en Git involucra los siguientes pasos:
- Inicialización del repositorio: Crear un nuevo repositorio o clonar uno
existente con git checkout.
- Agregar cambios: Modificar archivos y agregarlos al área de preparación
(staging area) con git add.
- Confirmar cambios: Guardar los cambios en el repositorio con git commit.
- Compartir cambios: Enviar los cambios al repositorio remoto con git push.

## Integración con IDEs
La mayoría de IDEs nos proporcionaran herramientas visuales para trabajar con Git y
no tener que lidiar con los comandos, así como modificaciones visuales para
identificar los cambios en los archivos mediante colores o iconos.

## Subversion vs. Git
```kotlin
Subversion (SVN) es otro sistema de control de versiones ampliamente utilizado,
pero difiere significativamente de Git en varios aspectos:
```
- Centralizado vs. Distribuido: SVN sigue un modelo centralizado, donde todos
los desarrolladores interactúan con un único repositorio central. Git, en
cambio, es distribuido, lo que permite una mayor flexibilidad y escalabilidad
en el trabajo colaborativo.
- Historia de cambios: SVN almacena la historia de cambios como un conjunto
de cambios (revisions) numéricos, mientras que Git utiliza un grafo dirigido
```kotlin
acíclico (DAG) que representa las relaciones entre los commits.
```
- Ramas y fusiones: En SVN, las ramas y fusiones son operaciones pesadas y
requieren la intervención del servidor central. En Git, las ramas son ligeras y
las fusiones son rápidas y fáciles debido a su modelo distribuido.

## GitHub
GitHub es una plataforma de desarrollo colaborativo que utiliza Git como sistema de
control de versiones. Permite a los desarrolladores alojar y revisar código, gestionar
proyectos y colaborar en equipo. Además de alojar repositorios Git, GitHub ofrece
características adicionales como seguimiento de problemas (issues), solicitudes de
```kotlin
extracción (pull requests), integración continua y despliegue automático.
```


## Conclusión
En resumen, Git es un poderoso sistema de control de versiones distribuido que
ofrece flexibilidad, velocidad y escalabilidad para el desarrollo de software
colaborativo. Aunque Subversion sigue siendo utilizado en algunos contextos, Git se
ha convertido en el estándar de facto en la industria del desarrollo de software. Y
GitHub, como plataforma basada en Git, proporciona herramientas adicionales para
facilitar la colaboración y el desarrollo de proyectos.

## Comandos más comunes
- `git init`: Inicializa un nuevo repositorio Git en un directorio local.
- `git clone [url]`: Clona un repositorio Git existente desde una URL remota al
directorio local.
- `git add [archivo(s)]`: Agrega los cambios de archivos específicos al área de
```kotlin
preparación (staging area) para ser incluidos en el próximo commit.
```
- `git commit -m "[mensaje]"`: Guarda los cambios realizados en el repositorio.
El mensaje describe brevemente los cambios realizados en este commit.
- `git status`: Muestra el estado actual del repositorio, incluyendo archivos
modificados, archivos en el área de preparación y el estado de la rama actual.
- `git pull`: Recupera los cambios desde el repositorio remoto y los fusiona con el
repositorio local. Es una combinación de git fetch y git merge.
- `git push`: Envía los commits locales al repositorio remoto. Es importante tener
actualizado el repositorio local antes de hacer push.
- `git branch [nombre]`: Crea una nueva rama con el nombre especificado.
- `git checkout [rama]`: Cambia a la rama especificada, permitiendo trabajar en
una línea de desarrollo diferente.
- `git merge [rama]`: Fusiona los cambios de la rama especificada en la rama
actual.
- `git fetch`: Recupera los cambios desde el repositorio remoto, pero no los
fusiona con el repositorio local. Útil para ver cambios antes de fusionarlos.
- `git log`: Muestra un historial de commits en la rama actual, incluyendo
información como el autor, fecha y mensaje del commit.
- `git reset`: Deshace cambios en el repositorio. Puede utilizarse para deshacer
cambios en el área de preparación o en el directorio de trabajo.
- `git remote`: Muestra los repositorios remotos configurados y sus URLs.
- `git config`: Permite configurar opciones de Git, como el nombre de usuario,
dirección de correo electrónico, etc.
