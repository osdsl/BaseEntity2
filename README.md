#    Практическая работа №1
Цель работы: Ознакомиться с механизмом наследования в языке Java. Повторить основные языковые конструкции языка Java.

Варианты классов для построения иерархий:
Персона, студент, преподаватель, сотрудник.
## Инструкция по сборке
### 1 Вариант
Для сборки Java проекта из командной строки в Windows, необходимо установить JDK (Java Development Kit). После этого выполните следующие шаги:

Убедитесь, что переменная среды JAVA_HOME указывает на каталог, где установлен JDK.

Откройте командную строку (cmd).

Перейдите в каталог вашего Java проекта с помощью команды cd.

Выполните компиляцию всех исходных файлов Java с помощью команды javac:

javac Main.java Person.java Student.java Teacher.java Employee.java

После успешной компиляции запустите Java-проект с помощью команды java.

java Main

Эта команда скомпилируют все указанные файлы .java в соответствующие .class файлы и запустит программу, используя класс Main в качестве точки входа.

### 2 Вариант
Запуск кода с компилированного JAR файла.
Для запуска JAR-файла в Windows выполните следующие шаги:

Скопируйте JAR файл BaseEntity2-1.0-SNAPSHOT.jar с репозитория проекта

Откройте командную строку (cmd).

Перейдите в каталог, где находится ваш JAR-файл, с помощью команды cd.

Запустите JAR-файл с помощью команды java -jar.

java -jar BaseEntity2-1.0-SNAPSHOT.jar

Эта команда запустит ваш JAR-файл и выполнит программу, которая в нем содержится. Убедитесь, что у вас установлено JDK (Java Development Kit) для корректной работы этой команды.
