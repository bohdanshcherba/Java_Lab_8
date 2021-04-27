# Java_Lab_8

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


>Написати код до завдання з лабораторної №2
 При записі програми потрібно використовувати домовленості щодо оформлення коду java code convention.
 Класи потрібно грамотно розкласти по пакетах.
 Робота з консоллю або консольне меню повинні бути мінімальними.
 В коді мають бути присутні лиш ті класи, які містяться на діаграмі класів
 Атрибути класів та їх видимість мають співпадати із зазначеними на діаграмі класів. Те саме стосується методів класів
 Для сортування слід використати вбудовані методи сортування, доступні в мові Java
 Сортування слід реалізувати в окремому методі
 Код немає містити статичних методів/атрибутів. Дозволено лиш один статичний метод - main
 Код має використовувати перелічувальний тип (Enum)
 Код слід залити в окремий репозиторій, попередньо створивши pull request (тобто код слід писати в окремому branch  на його основі зробити pull request)
 Реалізація порівняння елементів та їх сортування з використанням лямбда-виразів (приклади використання лямбд:   https://www.mkyong.com/java8/java-8-lambda-comparator-example/, більш детальний опис що таке лямбда: https://habrahabr.ru/post/224593/)
 Замість написання сеттерів і геттерів слід використати аннотації Lombok (@Data) - більш детально про цю бібліотеку - https://habr.com/ru/post/438870/ 
 Перетворити проект таким чином, щоб його збірку можна було виконувати з-за допомогою  maven. Також підключити наступні плагіни в pom.xml 
 >- плагін Jacoco який виконуватиме перевірку коду тестами (в секцію build):
 >- плагін FindBugs який здійснює автоматичну перевірку якості коду і пошук потенційних помилок в коді (в секцію reporting):
 >- плагін PMD (в секцію reporting):
 >- плагін Checkstyle - перевіряє дотримання code convention (в секцію reporting):
 
 
 >Після завершення роботи слід виконати команду mvn site і переглянути результати її виконання в папці target/site (відкривши файл index.html)
 В коді слід виправити всі помилки, які виявляють плагіни FindBugs, PMD і Checkstyle (окрім помилок, пов'язаних з відсутністю коментарів). 
 
 >Генерація відбувається з-за допомогою команди maven (можна виконувати з консолі) або з використанням Intelij IDEA/ Eclipse :
 
 >mvn archetype:generate -DgroupId=ua.lviv.iot -DartifactId=work -Dversion=1.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false
