Предметная область
-
Моя предметная область - это симуляция создания вселенной. Моя программа позволяет 
создовать свои галактики и звёзды, которые находяться в этих галактиках.

Сущность Галактика состоит из следующих свойств:
* Имя
* Диаметр большой оси галактики (измеряется в световых годах)
* Диаметр меньшей оси галактики (измеряется в световых годах)
* Тип галактики (эллептическая, спиральная, неправильная)
* Расстояние от галактики до планеты "Земля" (измеряется в миллионах световых лет)

Сущность Звезда состоит из следующих свойств:
* Имя
* Температура (измеряется в кельвинах)
* Радиус (измеряется с помощью солнечного радиуса)
* Светимость (измеряется с помощью солнечной светимости)
* Масса (измеряется с помощью солнечной массы)


Список подключённых зависимостей
- 
- Spring Web
- MySQL Driver
- Lombok
- Spring Data JPA

Инструкция для сборки и запуска проекта:
-
- Cкачать архива с репозитория Github или клонировать его
- Из папки schemaMySql используем скрипт для создания базы данных
- В корневой папке проекта открываем консоль и вводим каманду mvc install
- После этого заходим в папку target и запускаем в консоли команду java -jar universe-0.0.1-SNAPSHOT.jar
- Тепеь используя файл из папки postman, тестируем приложение 


