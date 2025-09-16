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
###### Última modificação: 17/09/2025 - 17 de setembro de 2025

# Web system for scheduling medical appointments with Spring and Thymeleaf

![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white)

This application was developed for the *Web Software Development 1 (DSW1)* course at UFSCar. In this version, it has been organized into containers. The system was built using the MVC (Model-View-Controller) architecture and used the following technologies: Spring MVC, Spring Data JPA, Spring Security, Thymeleaf, and MySQL on the server side, and CSS on the client side.

## File structure

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

- The file ```docker-compose.yml``` contains the orchestration of the application's containers;
- The ```.git``` and ```.gitignore``` files contain GitHub configuration;
- The ```images``` folder contains the images used in this README;
- The file ```pom.xml``` defines the application's dependencies;
- The file ```README.md``` is this help document;
- The ```redis``` folder contains files related to the Redis container;
- The ```src``` folder contains all the application’s source code;
- The ```target``` folder contains the files generated after the application is compiled.

The application is composed of three containers:
- database:
  - Responsible for the database, and therefore essential for data persistence in the application;
  - Its Dockerfile is located at ```src/main/java/br/ufscar/dc/dsw/dao/```;
- app:
  - Responsible for both backend and frontend, and therefore essential for user interaction with the application;
  - Its Dockerfile is located at ```src/main/java/br/ufscar/dc/dsw/```;
- redis:
  - Responsible for the caching system that reduces the number of database accesses by storing frequently accessed temporary data. It is essential for optimizing the application’s performance;
  - Its Dockerfile is located at ```redis/```.

## Features

### The system supports three types of registrations:
- Patients, with the following data: email, password, CPF (Brazilian ID), name, phone number, gender, and birth date;
- Doctors, with the following data: email, password, CRM (medical license number), name, and specialty;
- Appointments, with the following data: doctor’s name, CRM, and date/time of the appointment. Appointments last 30 minutes and always start at either the hour or half-hour mark.

### The system includes the following features:
- CRUD operations for doctors, accessible via administrator login;
- CRUD operations for patients, accessible via administrator login;
- Listing of all doctors on a single page;
- Listing of doctors by specialty;
- Appointment scheduling with a doctor, available via patient login;
- Listing of all appointments for a patient (requires patient login);
- Listing of all appointments for a doctor (requires doctor login);
- Internationalization in two languages: Portuguese and English.

## Main screens:

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

## Information for local execution:
- You need to have Docker (and Docker Compose) installed;
- First, run the command ```docker compose up --build``` from the application's root folder;
- Then, the application will be available at the URL "localhost:8080".

## Additional information:
- The team consisted of one member: Giovanna Victória Rossetto, RA 791648;
- The database is pre-populated with 2 administrators, 10 patients, and 30 doctors;
- The logins and passwords of the pre-registered users are in the file "ClinicaApplication.java", located at:
  ```/src/main/java/br/ufscar/dc/dsw/ClinicaApplication.jav```
- If the application is modified, it must be recompiled using the command
  ```mvn clean package -DskipTests``` and the newly generated file Clinica-0.0.1-SNAPSHOT.jar in the ```target``` folder must replace the old one in:
  ```src/main/java/br/ufscar/dc/dsw/```

###### Author: Giovanna Victória Rossetto
###### Created on: 05/17/2025 – May 17th, 2025
###### Last modified: 09/17/2025 – September 17th, 2025
