# Java_Lab_10

#How run code
### RUN IN AN IDE

If you want to run the examples in an IDE, such as Eclipse, you should
be able to copy-and-paste the entire contents of any one of the chapter folders
into a project in the IDE, and then run the programs.  For GUI programs,
which use JavaFX, you will very likely need to configure Eclipse as
discussed in Section 2.6 of the book.  Note: When adding items to
an Eclipse project, do not copy the chapter folder itself; open the 
folder and copy the contents into the src folder in the Eclipse project.
You can put the examples from several chapters into the same project if you 
want; some files, such as TextIO.java, are duplicated in several chapters,
but any two files with the same name are identical, and you only need one
copy of the file in your project.


### COMPILE AND RUN ON THE COMMAND LINE 

If you know how to compile programs on the command line, and if you have
downloaded the examples, you can easily compile and run all the examples.
For non-GUI programs, just change into one of the chapter directories inside 
the "sources" directory, and use a command of the form

                  javac ExampleClassName.java
                  
For example:
                  javac HelloWorld.java
                  
As long as your compiler supports Java 8 or higher, there should be no errors.  
(You might see some warnings, especially if you use a newer version of Java, 
but warnings do not stop a program from being compiled or executed.)  You can 
then run the compiled programs using the java command.  For example:

                  java HelloWorld
                  
For GUI programs, which use JavaFX, you will have to add command-line options to
the javac and java commands, as discussed in Section 2.6 of the textbook,
but the basic idea is the same.
                  
Several examples from Chapter 12, Section 5 and the Mandelbrot Set example
from Chapter 13, Section 5 use packages.  The source files for these examples
can be found in the directories chapter12/netgame and chapter13/edu.  Compiling
and running programs from packages is a little harder; see the discussions in
the textbook in the relevant sections.
#Task 


>Лабораторна 10
 Реалізувати збереження об'єкту одного з класів з лабораторної роботи №8 в таблиці в базі даних, використовуючи Spring boot та Spring data
 
 >Код 9ї лабораторної має бути зміненим таким чином, щоб збереження і зчитування даних відбувалось з використанням бази даних
 Код має відповідати code convention
 Код слід перевірити плагінами FindBugs, PMD і Checkstyle, та виправити помилки
 Код має бути залито в репозиторій як окремий pull request (а не в окрему папку чи окремий репозиторій)
 Код має містити окремий клас *Controller, *Service та інтерфейс *Repository
 Налаштування доступу до бази даних має бути реалізоване через проперті файл
 
 
 >Налаштування 
 MySQL дистрибутив можна скачати за посиланням: https://dev.mysql.com/downloads/ 
 Після скачування його слід встановити. 
 
 >Створення бази даних в MySQL з використанням консольного клієнта
 
 
 >Для того щоб під'єднатись до бази даних слід виконати наступну команду в консольному вікні: 
 
 
 
 
 
 >mysql -h localhost -u myname -p
 myname - імя користувача (оскільки база щойно встановлена, то буде існувати лише користувач root
 Далі слід ввести пароль користувача root, який був вказаний при встановленні бази даних
 Для створення бази даних, котра називається iot-test-db виконайте команду (назву можна обирати на власний розсуд):
 CREATE DATABASE `iot-test-db`;
 
 >Також цю дію можна виконати через mySQL Workbench tool (for Windows or Linux) або Sequel Pro (Mac)
 Для створення користувача в базі даних виконайте команду:
 
 >create user  'username'@'localhost' IDENTIFIED BY 'password';
 grant all on *.* to 'username'@'localhost';
 
 >Замінивши 'username' та 'password' на бажані значення. Наприклад, для того щоб створити користувача iotuser з паролем iotuser:
 
 >create user  'iotuser'@'localhost' IDENTIFIED BY 'iotuser';
 grant all on *.* to 'iotuser'@'localhost';
 
 
 >Також цю команду можна виконати з використанням mySQL in the mySQL Workbench tool (for Windows or Linux) або Sequel Pro (Mac)
 
 
 >MYSQL драйвер можна скачати по посиланню: https://dev.mysql.com/downloads/connector/j/
