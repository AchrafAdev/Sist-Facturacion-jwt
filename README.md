# Sist-Facturacion
Sistema de facturación realizado con Spring 5
La aplicación trata sobre un sistema de facturación en el que incluye subida de imágenes y gestión de usuarios con sus respectivos roles. 
Incluye también un autocomplete a la hora de buscar los productos para las facturas con código JS usando jQuery UI y haciendo una consulta JPA para cargar los productos. 


En cuanto al campo de Spring Security, se emplea el AccessDeniedPage para manejo de errores 403 y poder personalizarlo. Tambien empleo el SuccessHandler a la hora de iniciar sesion correctamente para que salte un flash.
Para completar mis conocimientos utilizo distintas maneras para obtener información del usuario que ha iniciado sesion mediante el logger, 
una de ellas con SecurityContextHolderAwareRequestWrapper.


Finalmente, para la seguridad del acceso a las distintas funciones que presenta la aplicación inicialmente opté declararlo en el SpringSecurityConfig en la funcion Configure pero al final decidí usar anotaciones en los distintos controladores.


PD: Hay mucho código comentado pero ese código es simplemente otra manera de hacerlo, no es que este mal.
