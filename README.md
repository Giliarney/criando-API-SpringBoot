# Padrões Projeto Spring

[![GitHub issues](https://img.shields.io/github/issues/seuusuario/nomedorepositorio)](https://github.com/seuusuario/nomedorepositorio/issues)
[![GitHub forks](https://img.shields.io/github/forks/seuusuario/nomedorepositorio)](https://github.com/seuusuario/nomedorepositorio/network)
[![GitHub stars](https://img.shields.io/github/stars/seuusuario/nomedorepositorio)](https://github.com/seuusuario/nomedorepositorio/stargazers)
[![GitHub license](https://img.shields.io/github/license/seuusuario/nomedorepositorio)](https://github.com/seuusuario/nomedorepositorio/blob/master/LICENSE)

## Índice

- [Sobre](#sobre)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [API Endpoints](#api-endpoints)
- [Contribuição](#contribuição)

## Sobre

Este projeto demonstra a implementação de padrões de projeto utilizando Spring Boot. Ele inclui exemplos de serviços RESTful, repositórios JPA e integração com o ViaCEP para consultas de endereços.

## Pré-requisitos

Certifique-se de ter os seguintes itens instalados:

- Java 17 ou superior
- Maven 3.6 ou superior
- Git

## Instalação

1. Clone o repositório:

    ```bash
    git clone https://github.com/seuusuario/nomedorepositorio.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd padroes-projeto-spring
    ```

3. Compile o projeto:

    ```bash
    mvn clean install
    ```

## Uso

1. Inicie a aplicação:

    ```bash
    mvn spring-boot:run
    ```

2. Acesse a aplicação no seu navegador:

    ```
    http://localhost:8080
    ```

## Estrutura do Projeto

```plaintext
padroes-projeto-spring
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── desafio_dio
│   │   │   │   │   ├── padroes_projeto_spring
│   │   │   │   │   │   ├── controller
│   │   │   │   │   │   │   ├── ClienteRestController.java
│   │   │   │   │   │   ├── model
│   │   │   │   │   │   │   ├── Cliente.java
│   │   │   │   │   │   │   ├── ClienteRepository.java
│   │   │   │   │   │   │   ├── Endereco.java
│   │   │   │   │   │   │   ├── EnderecoRepository.java
│   │   │   │   │   │   ├── service
│   │   │   │   │   │   │   ├── impl
│   │   │   │   │   │   │   │   ├── ClienteServiceImpl.java
│   │   │   │   │   │   │   │   ├── ClienteService.java
│   │   │   │   │   │   │   │   ├── ViaCepService.java
│   │   │   │   │   │   ├── PadroesProjetoSpringApplication.java
│   ├── resources
│   │   ├── application.properties
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## API Endpoints
  Obter Todos os Clientes
  URL: /clientes
  Método: GET
  Resposta:
  ```
  [
      {
          "id": 1,
          "nome": "João",
          "endereco": {
              "cep": "01001-000",
              "logradouro": "Praça da Sé",
              "complemento": "",
              "bairro": "Sé",
              "localidade": "São Paulo",
              "uf": "SP",
              "ibge": "3550308",
              "gia": "1004",
              "ddd": "11",
              "siafi": "7107"
          }
      }
  ]
```

## Criar um Novo Cliente
URL: /clientes
Método: POST
Corpo da Requisição:
```
{
    "nome": "Maria",
    "cep": "01001-000"
}
```

Reposta:
```
{
    "id": 2,
    "nome": "Maria",
    "endereco": {
        "cep": "01001-000",
        "logradouro": "Praça da Sé",
        "complemento": "",
        "bairro": "Sé",
        "localidade": "São Paulo",
        "uf": "SP",
        "ibge": "3550308",
        "gia": "1004",
        "ddd": "11",
        "siafi": "7107"
    }
}
```

## Obter Cliente por ID
URL: /clientes/{id}
Método: GET
Parâmetros de URL: id - ID do cliente
Resposta:
```
{
    "id": 1,
    "nome": "João",
    "endereco": {
        "cep": "01001-000",
        "logradouro": "Praça da Sé",
        "complemento": "",
        "bairro": "Sé",
        "localidade": "São Paulo",
        "uf": "SP",
        "ibge": "3550308",
        "gia": "1004",
        "ddd": "11",
        "siafi": "7107"
    }
}
```

## Contribuição
Faça um fork do projeto.
Crie uma nova branch com a sua feature:

```
git checkout -b minha-feature
git commit -m 'Adiciona minha feature'
git push origin minha-feature
```
