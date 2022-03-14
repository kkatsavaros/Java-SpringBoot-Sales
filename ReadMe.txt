Java-SpringBoot-Sales

Database: sales
Table:Sales


In that project i am using Spring Boot Framework to fetch the table sales of the sales database.

Spring Boot has designed to produce Rest Api.

We use both types, with HomeController we produce Json object
and the second type, with SalesController we use JSPs Pages to fetch table sales.



Τι αλλάζει από το Spring Boot:

1. Θα αποφύγουμε κάποιες ρυθμίσεις στο config πακέτο.
2. Το config του dispatcher Servlet initializer δεν θα το κάνουμε.
3. Με τους controllers δεν αλλάζει τίποτα.
4. Με τα Entities δεν αλλάζει τίποτα.
5. Με τα Repositories θα αλλάξουν λίγο.
6. Με τα Services δεν αλλάζει τίποτα.

Έχει σχεδιαστεί για να παρέχει REST-APIs.



1. Αρχικό σετάρισμα με Spring Initializr.
2. HomeController - Person class

3. Sales class - SalesRepo - SalesController - salesList.jsp


Katsavaros Konstantinos
