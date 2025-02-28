**Inside the TechM repo I have created two branches**

1. /main --> containing Django based web app that displays list of Books-Authors and made few test cases using pytest.
2. /master --> containing Maven based application that calculates division of two numbers and verified using several test cases.

**Utilities => Docker Desktop, Jenkins, Django, Maven, VS Code.**.<br>

**Steps for Django app -:**

After installing Django and pytest , I made a project(root directory) named 'addition' within which I made an app named 'myapp' using django.<br>
**Commands :**.<br>
 <code>1. django-admin startproject addition.</code><br>
<code>2. django-admin startapp myapp.</code><br>
 
After successfully fetching lists of books and authors from the database, I tested the presence of books and authors in the app using pytest and it passed and created its docker-image using dockerhub.<br>
On creating a job (Addition_pipeline) in jenkins I installed necessary plugins and after setting paths and running batch commands I established pipeline and successfully run testing.<br>
<br>
![Screenshot (14)](https://github.com/user-attachments/assets/d93d1fc5-4be6-455e-ae1d-09ee55635b73)<br>
![Screenshot (15)](https://github.com/user-attachments/assets/63d174a5-4455-4d56-8200-9c7db7aab716)<br>

**Steps for Maven application -:** <br>
After installing Maven and setting the path I made a directory using below project create command.<br>
**Command:**<br>
<code>1. mvn archetype:generate -DgroupId=com.example -DartifactId=division-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false // Make a Maven app</code><br>

After running above command app directory was created and I input the code in the files and updated pom.xml file and created a Dockerfile in the root directory and pushed code in github repo.<br>
On creating a job (Division) in jenkins I installed necessary plugins and after setting paths and running batch commands I established pipeline and successfully run testing.<br>

![Screenshot (19)](https://github.com/user-attachments/assets/71dcdf27-ad47-4ef1-803a-224ab2b449a1)<br>
![Screenshot (18)](https://github.com/user-attachments/assets/66cb595d-e8cc-4459-84b8-592c78e84d6a)<br>

**Commands used in both application to create Docker images :** <br>

<code>1. docker build -t {image-name}-app</code> <br>

**1. Docker image proof of Django app**<br>
   ![Screenshot (7)](https://github.com/user-attachments/assets/2f735f12-428d-4c07-9b7a-3fdb39e57be8)<br>
**2. Docker image proof of Maven App**<br>
   ![Screenshot (10)](https://github.com/user-attachments/assets/2c12f017-6892-44be-9b6b-ec5a805d0f40)<br>

**Final view of Jenkins Dashboard**<br>

![Screenshot (20)](https://github.com/user-attachments/assets/3a247b93-daa5-45bd-9e1c-0c5a562f5f2b)<br>

