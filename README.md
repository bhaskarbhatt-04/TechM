Inside the TechM repo I have created two branches
1. /main --> containing Django based web app that displays list of Books-Authors and made few test cases using pytest.
2. /master --> containing Maven based application that calculates division of two numbers and verified using few test cases.

Applications used => Docker Desktop, Jenkins, Django, Maven, VS Code.

Steps for Django app -:
After installing Django and pytest , I made a project(root directory) named 'addition' within which I made an app named 'myapp' using django.
Command : django-admin startproject addition
          django-admin startapp myapp
After successfully fetching lists of books and authors from the database, I tested the presence of books and authors in the app using pytest and it passed, I created its docker-image using dockerhub.
On creating a job in jenkins I stucked while setting up the pipeline.

Steps for Maven application -:
After installing Maven and setting the path I 
Command:
1. mvn archetype:generate -DgroupId=com.example -DartifactId=division-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false // Make a Maven app

After running above command app directory was created and I input the code in the files and updated pom.xml file and created a Dockerfile in the root directory and pushed code i+on github repo.

Commands used in both application to create Docker images : 
1. docker build -t {image-name}-app .
