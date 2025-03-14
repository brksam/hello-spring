# Projeto Spring Boot - Seção de Estudos

## 📌 Descrição
Este projeto é uma aplicação **Spring Boot** que expõe endpoints REST. O foco principal é fornecer uma **seção de estudos** onde os usuários podem acessar mensagens de exemplos de desenvolvimento com Spring Boot.

## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot 3+
- Maven
- Spring Web

## 📂 Estrutura do Projeto
```
hello-spring/
│── src/
│   ├── main/java/com/seuprojeto/controller/HelloController.java
│   ├── main/resources/application.properties
│── pom.xml
│── README.md
```

## 🔥 Endpoints Disponíveis
### ✅ Hello World
- **Rota:** `GET /api/test`
- **Descrição:** Retorna a mensagem "Hello, World! Bem-vindo ao meu projeto Spring Boot!"
- **Exemplo de resposta:**
  ```json
  {
      "message": "Hello, World! Bem-vindo ao meu projeto Spring Boot!"
  }
  ```

### 📖 Seção de Estudos
- **Rota:** `GET /api/estudos`
- **Descrição:** Retorna uma mensagem motivacional para os estudos.
- **Exemplo de resposta:**
  ```json
  {
      "message": "Seja bem-vindo à seção de estudos! Continue aprendendo e evoluindo."
  }
  ```

## 🎯 Como Executar o Projeto
### 1️⃣ Pré-requisitos
Antes de começar, você precisará ter instalado em seu ambiente:
- [JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

### 2️⃣ Clonar o Repositório
```sh
git clone https://github.com/brksam/hello-spring.git
cd hello-spring
```

### 4️⃣ Testar os Endpoints
Após iniciar a aplicação, acesse os seguintes endpoints no navegador ou via Postman:
- [http://localhost:8080/api/test](http://localhost:8080/api/test)
- [http://localhost:8080/api/estudos](http://localhost:8080/api/estudos)

## 📜 Licença
Este projeto é de uso livre para fins educacionais. Sinta-se à vontade para contribuir!

---

