Inside the TechM repo I have created two branches
1. /main --> containing Django based web app that displays list of Books-Authors and made few test cases using pytest.
2. /master --> containing Maven based application that calculates division of two numbers and verified using several test cases.

Applications used => Docker Desktop, Jenkins, Django, Maven, VS Code.

*Steps for Django app -:*
After installing Django and pytest , I made a project(root directory) named 'addition' within which I made an app named 'myapp' using django.
Command : django-admin startproject addition
          django-admin startapp myapp
After successfully fetching lists of books and authors from the database, I tested the presence of books and authors in the app using pytest and it passed and created its docker-image using dockerhub.
On creating a job (Addition_pipeline) in jenkins I installed necessary plugins and after setting paths and running batch commands I established pipeline and successfully run testing.
![Screenshot (14)](https://github.com/user-attachments/assets/d93d1fc5-4be6-455e-ae1d-09ee55635b73)
![Screenshot (15)](https://github.com/user-attachments/assets/63d174a5-4455-4d56-8200-9c7db7aab716)

*Steps for Maven application -:*
After installing Maven and setting the path I 
Command:
1. mvn archetype:generate -DgroupId=com.example -DartifactId=division-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false // Make a Maven app

After running above command app directory was created and I input the code in the files and updated pom.xml file and created a Dockerfile in the root directory and pushed code in github repo.
On creating a job (Division) in jenkins I installed necessary plugins and after setting paths and running batch commands I established pipeline and successfully run testing.
![Screenshot (19)](https://github.com/user-attachments/assets/71dcdf27-ad47-4ef1-803a-224ab2b449a1)
![Screenshot (18)](https://github.com/user-attachments/assets/66cb595d-e8cc-4459-84b8-592c78e84d6a)

Commands used in both application to create Docker images : 
1. docker build -t {image-name}-app .

*1. Docker image proof of Django app*
   ![Screenshot (7)](https://github.com/user-attachments/assets/2f735f12-428d-4c07-9b7a-3fdb39e57be8)

*2. Docker image proof of Maven App*
   ![Screenshot (10)](https://github.com/user-attachments/assets/2c12f017-6892-44be-9b6b-ec5a805d0f40)

*Final view of Jenkins Dashboard*
![Screenshot (20)](https://github.com/user-attachments/assets/3a247b93-daa5-45bd-9e1c-0c5a562f5f2b)

