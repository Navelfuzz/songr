# Songr Application

Songr Appliction is a simple web app that is an exercise in using Spring

## How to Use the Application 

* "http://localhost:8080/" : This is the splash page, I added navigation
* "http://localhost:8080/hello": Simply prints hello
* "http://localhost:8080/capitalize/hello": Prints a capitalized hello
* "http://localhost:8080/capitalize/your%20input%20here": Allows you to capitalize whatever input
* "http://localhost:8080/albums": Displays 3 albums from my Album class and model
* Additionally "http://localhost:8080/" defaults to "http://localhost:8080" using index.html page

___

# Lab: Class 11

Today, you'll set up a basic webapp that will be useful for the next 5 labs.

## Setup

Use the [Spring Initializr](https://start.spring.io/) to create a new application `songr` with Web and Thymeleaf
(and optionally DevTools) dependencies. Download the zip file and extract the directory it contains.
Add the course `.gitignore` file into that directory. Run `git init`, `git add .`, and `git commit -m "initial commit
from Spring init"`. Create a new gitHub repo and push your initial commit to your master branch there. Then checkout 
a new branch to begin your work for the day. 

### Feature tasks

As you work on these feature tasks, remember to consider your basic application setup. What classes should you create? 
How should they be related? 

1. Ensure that you can run the Spring App
2. Create a `hello world` route at `/hello`, and ensure that you can visit that route in your browser and see a rendered template come back.
3. Create a route that turns words to UPPER CASE. `/capitalize/hello` or `/capitalize/{anytext}`
4. Create a basic splash page for the Songr app, available at the root route and style it appropriately with css.
5. Create an Album class to act as a model in our app. 
    * An `Album` has a `title`, `artist`, `songCount`, `length` (in seconds), and an `imageUrl`
6. Create a route at `/albums` that shows three album instances (hardcoded for today)

___

# Lab: Class 12

## Setup
Continue working in the same `songr` webapp you generated for the previous lab. Ensure that you have all of these 
dependencies in your `build.gradle`. (Note that when you add the dependencies on postgres and JPA, your app will stop 
working until you have the configuration in `application.properties` to access your Postgres database.)

```
dependencies {
implementation('org.springframework.boot:spring-boot-starter-data-jpa')
implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
implementation('org.springframework.boot:spring-boot-starter-web')
runtimeOnly('org.postgresql:postgresql')
testImplementation('org.springframework.boot:spring-boot-starter-test')
}
```

## Feature Task

* Update your `Album` model so that it can be saved in a database.
  * An `Album` has a `title`, `artist`, `songCount`, `length` (in seconds), `imageUrl`
* A user should be able to see information about all the albums on the site
* A user should be able to add albums to the site

### Stretch goals

* A user should be able to update information about albums on the site.
* A user should be able to delete albums on the site. 

#### Planning
You’ll need to plan your steps carefully to succeed in this lab. Build incrementally, and make sure to try each 
new route as you create it. Try to isolate issues as they come up: exactly what about your app is not currently 
working the way you expected? Work on the feature tasks in isolation, and ensure that each is functional before 
moving on to the next.

#### Testing
Tests not required for this lab.







