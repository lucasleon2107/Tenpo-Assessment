# Tenpo Assessment
### API URL:
- https://tenpo-assesment.herokuapp.com
### Project Documentation: 
- https://tenpo-assesment.herokuapp.com/swagger-ui/

### Login
Para hacer login se envía el siguiente payload como **POST** a **/login**. Tiene auto  sign-up.

```json
{
    "userName": "test",
    "password": "test"
}
```

##### This project is part of an assessment from Tenpo. Instructions down below.
***
# Requirements

1. Debes desarrollar una API REST en Spring Boot con las siguientes funcionalidades:
    * a. Sign up usuarios.
    * b. Login usuarios vía JWT.
    * c. Sumar dos números. Este endpoint debe retornar el resultado de la suma y puede ser consumido solo por usuarios logueados.
    * d. Historial de todas las operaciones por usuario. Responder en Json, con data paginada y el límite se encuentre en properties.
    * e. Logout usuarios.
    * f. El historial y la información de los usuarios se debe almacenar en una database PostgreSQL.  
    * g. Incluir errores http. Mensajes y descripciones para la serie 400.

2. Esta API debe ser desplegada en un docker container. Este docker puede estar en un dockerhub público. La base de datos también debe correr en un contenedor docker.

3. Debes agregar un Postman Collection o Swagger para que probemos tu API. 

4. Tu código debe estar disponible en un repositorio público, junto con las instrucciones de cómo desplegar el servicio y cómo utilizarlo.
