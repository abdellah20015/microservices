basic micro services architecture implementation using spring boot and spring boot libraries.

details about how this was implemented are in  [this article (in french)](https://bmar1.com/posts/microservices/simple_implementation/)


# How to run

 clone the project : 

```
git clone https://github.com/bmarwane/microservices-project-example
```

start the postgres database container : 

```
docker-compose up -d
```

open the project with intellij and build with gradle.

then run the projects in the following order :

1: discovery

2: configserver

3: all the other projects


# How to use

this project contains a basic webservices named **productCatalog** that will be our "target webservice", it will be a secured webservice, and we will need to provide a valid jwt token in the request headers to access it.

so first of all, we will go get a valid token : 

```
http://localhost:9080/oauth/authorize?response_type=token&client_id=app&redirect_uri=http://localhost:9080/front-end/callback
```

you will then see an authentication page, use the following credentials:

```
login: admin
password: admin
```

You will then see a page with the JWT token that you will need to access the webservices.

example: 

```
curl --location --request GET 'http://localhost:9080/api/product-catalog/somecategory/somesubcategory' \
--header 'Authorization: Bearer replace_me_with_token'
```