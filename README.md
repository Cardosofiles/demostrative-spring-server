# Demonstrative Spring Server

Este projeto é uma aplicação backend desenvolvida com Spring Boot, servindo como um servidor demonstrativo para fins de aprendizado, testes ou integração com aplicações frontend. Ele expõe endpoints RESTful para manipulação de dados e demonstra boas práticas de estruturação de projetos Java com Spring.

## Funcionalidades

- Exposição de APIs RESTful para operações CRUD (Create, Read, Update, Delete).
- Integração com banco de dados relacional via Spring Data JPA.
- Estrutura modular com separação de camadas (controller, service, repository, model).
- Configuração pronta para desenvolvimento local.

## Pré-requisitos

- Java 17 ou superior
- Maven 3.8+ ou Gradle (dependendo do gerenciador de dependências utilizado)
- (Opcional) Docker, caso queira rodar o banco de dados em container

## Como rodar localmente

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/demonstrative-spring-server.git
   cd demonstrative-spring-server
   ```

2. **Configure o banco de dados:**

   - Por padrão, a aplicação utiliza um banco de dados H2 em memória para facilitar o desenvolvimento.
   - Caso queira usar outro banco (MySQL, PostgreSQL, etc.), ajuste as configurações em `src/main/resources/application.properties`.

3. **Compile e rode a aplicação:**

   - Usando Maven:
     ```bash
     ./mvnw spring-boot:run
     ```
   - Usando Gradle:
     ```bash
     ./gradlew bootRun
     ```

4. **Acesse a aplicação:**
   - A API estará disponível em: [http://localhost:8080](http://localhost:8080)
   - (Opcional) Acesse o console do H2 em: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## Estrutura do Projeto

```
demonstrative-spring-server/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ... (código fonte)
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── ... (testes)
├── pom.xml / build.gradle
└── README.md
```

## Customização

- Para alterar configurações de porta, banco de dados ou outros parâmetros, edite o arquivo `application.properties`.
- Para adicionar novas funcionalidades, crie novos controllers, services e repositories conforme a arquitetura do Spring.

## 📫 Contato

<div align="center">

<a href="mailto:cardosofiles@outlook.com">
  <img src="https://img.shields.io/badge/Email-0078D4?style=for-the-badge&logo=microsoftoutlook&logoColor=white" alt="Email"/>
</a>
<a href="https://www.linkedin.com/in/joaobatista-dev/" target="_blank">
  <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/>
</a>
<a href="https://github.com/Cardosofiles" target="_blank">
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
</a>
<a href="https://cardosofiles.dev/" target="_blank">
  <img src="https://img.shields.io/badge/Portfólio-222222?style=for-the-badge&logo=about.me&logoColor=white" alt="Portfólio"/>
</a>

</div>
