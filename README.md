# DSList

## Sobre o Projeto

DSList é uma aplicação backend desenvolvida em Java utilizando o framework Spring Boot. O objetivo principal é fornecer uma API RESTful para gerenciar listas de jogos, permitindo operações como listagem, consulta por ID e reordenação dos jogos dentro das listas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework para simplificar a configuração e o desenvolvimento da aplicação.
- **JPA / Hibernate**: Para mapeamento objeto-relacional e gerenciamento de persistência de dados.
- **Maven**: Gerenciador de dependências e automação de build.
- **Banco de Dados**:
  - **H2**: Utilizado para testes e desenvolvimento.
  - **PostgreSQL**: Utilizado em ambientes de homologação e produção.

## Arquitetura do Projeto

A aplicação segue o padrão de arquitetura em camadas, dividindo responsabilidades de forma clara:

1. **Controller**: Responsável por receber as requisições HTTP e retornar as respostas adequadas.
2. **Service**: Contém a lógica de negócios da aplicação.
3. **Repository**: Interage com o banco de dados para operações de persistência.

## Estrutura de Pastas

A estrutura de pastas do projeto é organizada da seguinte forma:

```
DSList
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── natalco
│   │   │           └── dslist
│   │   │               ├── controllers
│   │   │               ├── entities
│   │   │               ├── repositories
│   │   │               └── services
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

- **controllers**: Contém as classes que lidam com as requisições HTTP.
- **entities**: Define as entidades do domínio e seus mapeamentos JPA.
- **repositories**: Contém as interfaces que interagem com o banco de dados.
- **services**: Implementa a lógica de negócios da aplicação.
- **application.properties**: Arquivo de configuração da aplicação.
- **data.sql**: Script para popular o banco de dados com dados iniciais.

## Funcionalidades

A API oferece as seguintes funcionalidades:

- **Listar Jogos**: Recupera a lista de todos os jogos cadastrados.
- **Consultar Jogo por ID**: Retorna os detalhes de um jogo específico com base no seu ID.
- **Listar Jogos por Lista**: Recupera os jogos pertencentes a uma lista específica.
- **Reordenar Jogos na Lista**: Permite alterar a posição dos jogos dentro de uma lista.

## Como Executar o Projeto

### Pré-requisitos

- **Java 17** ou superior instalado.
- **Maven** instalado.

### Passos para Execução

1. **Clonar o Repositório**:

   ```bash
   git clone https://github.com/Natalco/DSlist.git
   cd DSlist
   ```

2. **Construir o Projeto**:

   ```bash
   ./mvnw clean install
   ```

3. **Executar a Aplicação**:

   ```bash
   ./mvnw spring-boot:run
   ```

A aplicação estará disponível em `http://localhost:8080`.

## Testes

Para testar os endpoints da API, você pode utilizar ferramentas como o **Postman** ou o **Insomnia**. Além disso, a aplicação inclui um script `data.sql` que insere dados iniciais no banco, facilitando os testes.

## Autor

Desenvolvido por [Natalco](https://github.com/Natalco). 
