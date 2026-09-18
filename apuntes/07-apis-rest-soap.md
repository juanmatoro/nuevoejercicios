Introducción a las APIs (REST y SOAP) 
 
 
¿En qué consiste una API? 
Una API (Application Programming Interface) es un conjunto de reglas y protocolos para 
crear servicios web que permiten a diferentes aplicaciones comunicarse e intercambiar 
información de manera estandarizada a través de Internet. 
Existen diferentes tipos de APIs, pero las más comunes para el desarrollo de aplicaciones 
móviles y web son: 
• SOAP (Simple Object Access Protocol): 
o Usa XML como formato de intercambio. 
o Más rígido, orientado a servicios empresariales. 
o Se basa en mensajes muy estructurados y complejos. 
o Ejemplo: antiguos servicios bancarios o sistemas corporativos. 
• REST (Representational State Transfer): 
o Es el más usado actualmente en web y móviles. 
o Usa URLs y métodos HTTP para acceder a recursos. 
o Los datos suelen enviarse en JSON. 
o Ejemplo: API de Twitter, Google Maps, Spotify. 
Nos centraremos en esta última ya que es la más utilizada. 
 
¿Como funciona una API REST? 
Una API REST se basa en el concepto de recursos. Cada recurso tiene una URL (Uniform 
Resource Locator) única que lo identifica, y a través de los métodos del protocolo HTTP 
podemos interactuar con ellos. Los recursos se envían en formatos de representación, 
siendo JSON (JavaScript Object Notation) el más común.  
Por ejemplo: 
https://api.mitienda.com/productos/15 
• https:// → protocolo de comunicación. 
• api.mitienda.com → dominio o servidor. 
• /productos → recurso principal o ruta (colección de productos). 
• /15 → identificador específico del recurso (producto con id = 15). 

Un ejemplo de respuesta a esta petición sería: 
{ 
   "id": 15, 
   "title": "Essence Mascara Lash Princess", 
   "category": "beauty", 
   "price": 9.99, 
   "available": true, 
   "images": ["...", "...", "..."] 
} 
 
 
Parámetros en una URL 
En las llamadas HTTP podemos enviar parámetros de distintas maneras: 
1. Path Parameters (parte de la ruta): 
https://api.mitienda.com/productos/15 
Aquí el 15 es el ID del producto. 
2. Query Parameters (después del ? separados con &): 
https://api.mitienda.com/productos?categoria=ropa&orden=precio 
Aquí categoria=ropa y orden=precio son filtros. 
3. Body Parameters (en el cuerpo de la petición, sobre todo con POST y PUT): 
{ 
   "name": "Shirt", 
   "price": 14.99, 
   "stock": 30 
} 
 
Métodos HTTP más usados en REST 
Cada método indica la acción a realizar sobre un recurso: 
GET → Obtener (leer) un recurso. 
POST → Crear un nuevo recurso. 
PUT → Actualizar un recurso existente. 
DELETE → Eliminar un recurso. 
