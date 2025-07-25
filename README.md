# Sistema web para agendamento de consultas médicas com Spring e Thymeleaf

![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white)

Essa aplicação foi desenvolvida para a disciplina de Desenvolvimento de Software para Web 1 (DSW1) da Ufscar. Nessa versão, ele foi organizado em contêineres. O sistema foi construído na arquivetura MVC (Model-View-Controller) e usou as seguintes tecnologias: Spring MVC, Spring Data JPA, Spring Security, Thymeleaf e MySQL no lado do servidor e CSS no lado do cliente.

## Estrutura de arquivos

```
.
├── docker-compose.yml
├── .git
├── .gitignore
├── images
├── pom.xml
├── README.md
├── redis
├── src
├── target

```

- O arquivo ```docker-compose.yml``` contém a orquestração dos contêineres da aplicação;
- Os arquivos ```.git``` e ```.gitignore``` contém configurações do GitHub;
- A pasta ```images``` contém as imagens deste README;
- O arquivo ```pom.xml``` define as dependências da aplicação;
- O arquivo ```README.md``` é este arquivo de ajuda;
- A pasta ```redis``` contém os arquivos relacionados ao container Redis;
- A pasta ```src``` contém todo o código fonte da aplicação;
- A pasta ```target``` contém os arquivos gerados após a compilação da aplicação.

A aplicação é composta por três contêineres:
- database:
  - responsável pelo banco de dados, portanto é de suma importância para a persistência dos dados da aplicação;
  - seu Dockerfile está localizado em ```src/main/java/br/ufscar/dc/dsw/dao/```;
- app:
  - responsável pelo backend e frontend, portanto é de suma importância para a utilização da aplicação por parte do usuário;
  - seu Dockerfile está em ```src/main/java/br/ufscar/dc/dsw/```;
- redis:
  - responsável pelo sistema de cache que reduz o número de acessos ao banco de dados, uma vez que armazena dados temporários e frequentemente acessados; portanto, é de suma importância para otimizar o desempenho da aplicação; 
  - seu Dockerfile está em ```redis/```.

## Funcionalidades

### O sistema oferece três tipos de cadastro:
  - de pacientes, com os seguintes dados: e-mail, senha, CPF, nome, telefone, sexo e data de nascimento;
  - de médicos, com os seguintes dados: e-mail, senha, CRM, nome e especialidade;
  - de consultas, com os seguintes dados: nome do médico, CRM do médico e data/hora da consulta. A duração da consulta é de 30 minutos e sempre inicia-se em "hora cheia" ou "hora meia".

### O sistema possui as seguintes funcionalidades:
  - CRUD de médicos mediante login de administrador;
  - CRUD de pacientes mediante login de administrador;
  - Listagem de todos os médicos em uma única página;
  - Listagem de todos os médicos por especialidade;
  - Agendamento de consulta com um médico meidante login do paciente;
  - Listagem de todas as consultas de um paciente mediante login do paciente;
  - Listagem de todas as consultas de um médico mediante login do médico;
  - Internacionalização em dois idiomas: português e inglês.

## Principais telas:

![Login](images/login.png)
![HomeAdmin](images/homeAdmin.png)
![CadastrarPaciente](images/cadastrarPaciente.png)
![CadastrarMedico](images/cadastroMedico.png)
![ListarPacientes](images/listaPaciente.png)
![ListarMedicos](images/listaMedicos.png)
![CadastrarConsulta](images/cadastrarConsulta.png)
![ConsultasPaciente](images/consultasPaciente.png)
![ConsultasMedico](images/consultasMedico.png)
![ListaGeralMedicos](images/listaGeral.png)

## Informações para execução local:
  - É necessário ter instalado o Docker (e o docker compose);
  - Primeiro, é necessário executar o comando ```docker compose up --build``` na pasta raiz da aplicação;
  - Depois, a aplicação estará disponível na url "localhost:8080".

## Outras informações:
  - A equipe foi composta por 1 integrante: Giovanna Victória Rossetto, RA 791648;
  - O banco de dados está populado com 2 administradores, 10 pacientes e 30 médicos;
  - Os logins e senhas dos usuários pré-cadastrados estão no arquivo "ClinicaApplication.java" no caminho "/src/main/java/br/ufscar/dc/dsw/ClinicaApplication.java";
  - Caso a aplicação seja modificada, é necessário fazer a compilação novamente com o comando ```mvn clean package -DskipTests``` e o novo arquivo Clinica-0.0.1-SNAPSHOT.jar, gerado na pasta ```target```, deve substituir o antigo na pasta ```src/main/java/br/ufscar/dc/dsw/```.

###### Autor: Giovanna Victória Rossetto
###### Data de criação: 17/05/2025 - 17 de maio de 2025
###### Última modificação: 30/05/2025 - 30 de maio de 2025
