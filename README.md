# API FINANCEIRO:
API REST desenvolvido com framework Spring Boot com intuito de gerenciamento de usuários.

## TECNOLOGIAS UTILIZADAS:

- Java 17
- Spring Boot (framework)
- Spring Data JPA (camada de abstração)
- Hibernate (conectar classes a ao banco)
- MySQL (banco de dados)
- Bean Validation (validação de dados)
- Maven (dependência do projeto)

## FUNCIONALIDADES:

- Criar usuário
- Listar usuários
- Buscar usuário por ID
- Atualizar usuários
- Deletar usuários
- Validação de dados
- Tratamento global de exceções

## COMO RODAR O PROJETO?

1. Clone o repositório
2. Crie o banco de dados MySQL: "CREATE DATABASE financeiro"
3. Configure o "application.properties"
3. Rode a classe "FinanceiroApplication.java"
4. Acesse no Postman: http://localhost:8080

## ESTRUTURA:

- Controller (mapeia as requisições HTTP)
- Service (lógica de negócio)
- Repository (manipulação de dados do banco)
- Entity (representação de tabelas do banco)
- Exception Handler (manipulador de excessões)

## PRÉ-REQUISITOS PARA RODAR:

- Java 17
- Banco de Dados MySQL instalado

---

Projeto desenvolvido com finalidade de aprendizagem em Java buscando evolução no back-end.
