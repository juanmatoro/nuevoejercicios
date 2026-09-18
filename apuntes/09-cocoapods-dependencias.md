CocoaPods y Gestores de Dependencias 
 
¿Qué es un Gestores de Dependencias? 
Los gestores de dependencias son herramientas que facilitan la gestión e integración 
de bibliotecas externas en proyectos de software. Estas bibliotecas, también 
conocidas como dependencias, son componentes de código preexistentes 
desarrollados por terceros que pueden agregar funcionalidades adicionales a tu 
proyecto sin que necesites escribir todo desde cero. 
Algunos gestores de dependencias populares en el mundo del desarrollo de software 
incluyen CocoaPods para proyectos iOS y macOS, Gradle para proyectos basados en 
Java, Groovy y Kotlin, npm para proyectos JavaScript, pip para proyectos Python, y 
muchos otros. Estas herramientas simplifican el proceso de integración de 
dependencias, automatizan tareas repetitivas y ayudan a garantizar la compatibilidad 
y estabilidad de tu proyecto al manejar las versiones de las bibliotecas de manera 
efectiva, lo que a su vez mejora la productividad. 
 
¿Como instalar CocoaPods? 
1. Abre la Terminal en tu Mac. Puedes buscarlo en la lupa de arriba a la derecha. 
2. Instala CocoaPods usando RubyGems mediante el siguiente comando: 
sudo gem install cocoapods 
Ingresa tu contraseña de administrador si se te solicita. 
3. Una vez que la instalación haya finalizado, verifica si CocoaPods se instaló 
correctamente ejecutando: 
pod --version 
Deberías ver la versión de CocoaPods que acabas de instalar. 
 
Es posible que haya errores en la instalación, algunos se solucionan siguiendo los 
mensajes de error que muestra la propia instalación. En este caso simplemente 
ejecutaremos los siguientes comandos: 
sudo gem install drb -v 2.0.6 
sudo gem install activesupport -v 6.1.7.7 
 
Volvemos a ejecutar el primer comando para terminar de instalar CocoaPods. 

 
 
¿Como utilizar CocoaPods? 
1. Abre la Terminal y navega hasta la ubicación de tu proyecto Xcode usando el 
comando cd. 
2. Dentro del directorio de tu proyecto Xcode, ejecuta el siguiente comando para 
inicializar CocoaPods en tu proyecto: 
pod init 
Esto creará un archivo Podfile en el directorio de tu proyecto. 
3. Abre el archivo Podfile usando tu editor de texto preferido. 
4. En el archivo Podfile, agrega las dependencias de CocoaPods que deseas 
incluir en tu proyecto. Por ejemplo, si deseas agregar la biblioteca 
AFNetworking, tu Podfile se vería así: 
# Uncomment the next line to define a global platform 
for your project 
# platform :ios, '9.0' 
 
target 'NombreDelProyecto' do 
# Comment the next line if you don't want to use 
dynamic frameworks. 
# use_frameworks!  
 
# Add here your dependencies.  
pod 'AFNetworking'  
end 
Puedes agregar más dependencias debajo de pod 'AFNetworking' según tus 
necesidades. 
5. Guarda los cambios en el archivo Podfile y cierra el editor de texto. 
6. Regresa a la Terminal y ejecuta el siguiente comando para instalar las 
dependencias que especificaste en tu Podfile: 
pod install 
Esto descargará las bibliotecas especificadas y las integrará en tu proyecto Xcode. 
Este proceso puede tomar un tiempo dependiendo de la cantidad de dependencias y 
su tamaño. 
Una vez que el comando pod install haya finalizado, cierra tu proyecto Xcode si lo 
tienes abierto y abre el archivo .xcworkspace que se creó junto con tu proyecto 
Xcode. Este archivo contiene tu proyecto junto con las dependencias de CocoaPods 
integradas. 

A partir de ahora, siempre asegúrate de abrir el archivo .xcworkspace en lugar del 
archivo .xcodeproj para trabajar en tu proyecto con las dependencias de CocoaPods 
correctamente integradas. 
