# SUMMATIVE PROJECT : Rest API

In this project, you will work with a team to build a REST API that provides a quote of the day, a word of the day, and Magic 8 Ball services. In addition, you will create a 1 to 3 minute video summary of the project.

![Netflix](https://img.shields.io/badge/Netflix-E50914?style=for-the-badge&logo=netflix&logoColor=white)

Contributors

    Ayoub Osman
    Andrew Fortner

### User Stories
- As an API user, I want to request a random quote so that I can expand my knowledge.
- As an API user, I want to request a random word and its definition so that I can expand my vocabulary.
- As an API user, I want to request a random answer to a question so that I can be entertained.

## Requirements
### General Setup and Format
- Your project must be created in an IntelliJ project named `Summative-1-Lastname-Firstname`.
- Your project must be built using Spring Boot and Spring MVC, initialized using start.spring.io.
- Your project must include a series of tests using MockMvc.
- Your project must use in-memory data.
- Your REST API must accept and return data in JSON format where appropriate.
- Your REST API must be documented using Swagger, with the .yaml file saved in the root of the project directory.

### Quote API
- URI: `/quote`
- Method: GET
- Request Body: None
- Response Body: Quote

The Quote model should include the following:
- id
- author
- quote

Your service must contain at least 10 quotes, served up at random.

### Word API
- URI: `/word`
- Method: GET
- Request Body: None
- Response Body: Definition

The Definition model should include the following:
- id
- word
- definition

Your service must contain at least 10 words and definitions, served up at random.

### Magic 8 Ball API
- URI: `/magic`
- Method: POST
- Request Body: Question
- Response Body: Answer

The POST request for the Magic 8 Ball endpoint should include a user-provided question. Note that you are not required to include any model validations for this project, so a response will still be returned even if the POST request does not include a question.

The Answer model should include the following:
- id
- question
- answer

