#Aula 04-04

## Roteiro da aula
Transcrever o sql para um ambiente gerenciado por um ORM.

//Jpa (especificação) > Implementações: hibernate, eclipseLink
//hibernate (spring data)

01. Criar o projeto springboot
02. Configurar a estrutura do projeto (yaml, pacotes, pom.xml e as variáveis de ambiente)
    02.1. Iremos inserir o drive do Postgres
03. Criar os pacotes
04. Criar as classes (vazias), num primeiro momento
05. Fazer as anotações (model) de acordo com o modelo do SQL
06. Fazer a estrutura resource > service > repository
    06.1 Fazer as anotações com OpenAPI para criar uma camada de teste(swagger).
07. Podemos fazer um CRUD simples para para persistência de dados.

## SQL gerado em sala de aula
![Projeto NorthWind E-Commerce](./src/main/resources/doc/northwind-v1-2024-04-04_18-54.svg "Title")

## Configuração do git
```shell
git init
git add .
git commit -m "first commit"
git branch -M main
git config user.email "you@example.com"
git config user.name "Your Name"
git remote add origin git@github.com:ipog-goias/northwind-springboot.git
git push -u origin main
```

Resultado esperado:

```shell
git push -u origin main
Enumerating objects: 22, done.
Counting objects: 100% (22/22), done.
Delta compression using up to 8 threads
Compressing objects: 100% (10/10), done.
Writing objects: 100% (22/22), 2.23 KiB | 1.11 MiB/s, done.
Total 22 (delta 0), reused 0 (delta 0), pack-reused 0
To github.com:ipog-goias/northwind-springboot.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'
```

### Configuração das variáveis de ambiente
Estas variáveis de ambiente devem ser informadas na configuração do seu projeto.
Seja no build ou seja na configuração do maven

```
SPRING_BANNER_CHARSET=UTF-8;SPRING_BANNER_LOCATION=classpath:/banner.txt;SPRING_OUTPUT_ANSI_ENABLE=always
```

### Configuração das variáveis de ambiente no IntelliJ Community
#### Configuração inicial
![Alt text](./src/main/resources/doc/image/config01.png)
#### Opção de configuração das variáveis de sistema
![Alt text](./src/main/resources/doc/image/config02.png)
#### Inserindo as variáveis de sistema
![Alt text](./src/main/resources/doc/image/config03.png)

## Integração entre as camadas de Resource, Service e Repository
![Alt text](./src/main/resources/doc/image/ipog-back-end-2-2024-1-03-springboot-em-camadas.drawio.png)