# java-to-uml-agh

## Spis treści


## Zespół
- Patryk Waluś
- Konrad Mikucki

## Wstęp
Program służący do zamiany kodu Java do opisowego języka PlantUML, który można przekształcić następnie do postaci wizualnej na przykład za pomocą narzędzia https://www.planttext.com

## Opis systemu typizacji języka Java w wersji 8

Język Java jest językiem:
 - opartym na paradygmacie obiektowym
 - kompilowanym
 - z silnym, statycznym typowaniem
 - którego kod jest kompilowany do kodu bajtowego, czyli postaci zrozumiałej dla maszyny wirtualnej Javy
 - niezależnym od systemy operacyjnego i procesora
 - każda klasa dziedziczy po klasie Object, przez co istnieje sposób, aby niezależnie od typu przypisać wartość do zmiennej typu Object
 - od Javy w wersji 5 można korzystać z typów generycznych, które pozwalają na parametryzowanie klas oraz interfejsów, dzięki czemu klasy oraz metody mogą operować na obiektach różnych typów przy czym w dalszym ciągu zapewnia bezpieczeństwo typu kompilacji.
 
## Uzasadnienie wyboru generatora parserów ANTLRv4
- Narzędzie ANTLRv4 zostało przedstawione na zajęciach jako odpowiedni generatorów parserów dla języka Java.
- W internecie znajduje się wiele poradników oraz przykładowych repozytoriów, które pomogły nam zrozumieć w jaki sposób możemy zacząć tworzyć projekt. Po zaznajomieniu się z informacjami w internecie oraz samym narzędziem ANTLRv4 stwierdziliśmy, że wykonamy projekt przy użyciu właśnie ANTLRv4.
- Dodatkowym atutem jest plugin dla IntelliJ IDEA, który pozwala w łatwy sposób korzystać z ANTLRv4, posiada narzędzia do debugowania gramatyki oraz wyświetlania drzewa dla przykładowego kodu.

## Opis napotkanych problemów oraz sposób ich rozwiązania
- Jednym z pierwszych napotkanych problemów było zrozumienie jak napisać własną gramatykę. Pomocne w tym przypadku okazały się: materiały dostępne na stronie ANTLRv4, poradniki oraz przykładowe repozytoria.
- Pojawił się problem ze zdefiniowaniem reguły dla bloku metody, która może zawierać z punktu widzenia gramatyki obojętnie jaki kod (Tylko w przypadku diagramów UML, gdzie ważniejsze są relacje między klasami). Konieczne było zaznajomienie się z rekurencyjną regułą. Pomogły tutaj materiały na stackoverflow.
- Zbyt duże skomplikowanie gramatyki. Podczas prac implementacyjnych, musieliśmy zrezygnować lub uprościć niektóre reguły, ponieważ okazało się dla nas zbyt trudne zaimplementowanie tłumaczenie kodu względem takiej gramatyki.
- Zdecydowanie się na przechodzenie po drzewie przy użyciu wzorca **Listener** lub **Visitor**. Aby wybrać dobrą ściężkę, postanowiliśmy przetestować zarówno jeden jak i drugi wzorzec. Próbowaliśmy implementacji dla obu podejść, jednak w naszym przypadku łatwiejsze było użycie wzorca **Listener**, ponieważ przechodzi on automatycznie po całym drzewie(nie trzeba kontrolować przepływu danych między węzłami), metody nie zwracają danych (parametry metod zależą od kontekstu, a nie od poprzedniej wartości. Jest to bardziej przydatne w przypadku tworzenia interpretera)
 
## Opis działań
Na cele projektu została przygotowana gramatyka dla języka Java w wersji 8 opierając się na specyfikacji języka. Do tego celu wykorzystaliśmy narzędzie ANTLR, które pozwala na generowanie parserów na podstawie przygotowanej gramatyki. Poprawność gramatyki testowaliśmy przy pomocy pluginu ANTLR v4 grammar plugin instalowanego w Intellij IDEA oraz przygotowanych testowych plików \*.java. Następnie dodawaliśmy nowe funkcjonalności przetwarzania sparsowanego drzewa, dla których odrazu były przygotowywane testy. 

## Linkografia
- https://www.antlr.org - Strona główna ANTLR
- https://github.com/antlr/antlr4/blob/master/doc/index.md - Oficjalna dokumentacja ANTLR
- https://docs.oracle.com/javase/specs/jls/se8/html/ - Specyfikacja języka Java w wersji 8
- https://github.com/antlr/grammars-v4 - Repozytorium gramatyk narzędzia ANTLR
- https://stackoverflow.com - Wybrane pytania, dotyczące napotkanych problemów


## Sposób uruchomienia
Dla celów demonstracyjnych przygotowaliśmy testowy package o nazwie **testpackage**, który znajduje się w **src/main/java/testpackage**. Staraliśmy się dodać do niego wszystkie obsłużone przez nas przypadki.

Aby uruchomić program należy w konsoli wykonać polecenie, gdzie jako argument podajemy absolutną ścieżkę do folderu, w którym znajduje się Java do przetłumaczenia na diagramy UML.

```
./gradlew run  --args='/absolute-dir/java/package'
```

Przykład:

```
./gradlew run  --args='/Users/patrykwalus/IdeaProjects/semestr8/kompil/java-to-uml-agh/src/main/java/testpackage'
```

Powyższe polecenie wyświetla przetłumaczony kod, który następnie można zwizualizować w narzędziu https://www.planttext.com

Przetłumaczony kod Java z folderu **testpackage**:
```
@startuml
package testpackage.abstraction{
abstract class testpackage.abstraction.Person<ID>{
{field} -firstName: String
{field} -lastName: String
{field} -age: Integer
{field} -address: Address
{method} +save(): void
{method} +find(ID id): PersistInterface<ID>
{method} +getFullName(): String
{method} #getFirstName(): String
{method} #getLastName(): String
{method} #getAge(): Integer
{method} -getAddress(): Address
}
interface testpackage.abstraction.PersistInterface<ID>{
{method} ~save(): void
{method} ~find(ID id): PersistInterface<ID>
}
}
package testpackage.location{
class testpackage.location.Country{
{field} -name: String
{field} -code: String
}
class testpackage.location.Address{
{field} -zipCode: String
{field} -street: String
{field} -city: City
}
class testpackage.location.City{
{field} -state: State
{field} -name: String
}
class testpackage.location.State{
{field} -country: Country
{field} -name: String
{field} -code: String
}
}
package testpackage.university.learn{
class testpackage.university.learn.Course{
{field} -name: String
{field} -code: String
{field} -description: String
{field} -hours: Integer
{field} +lecturers: Set<Lecturer>
}
}
package testpackage.university.people{
class testpackage.university.people.Lecturer{
{field} -salary: Double
{method} +getSalary(): Double
}
class testpackage.university.people.Student{
{field} +department: String
{field} #registrationNumber: String
{field} -PESEL: String
{field} -courseList: List<Course>
{method} +getCourseList(): List<Course>
}
}
testpackage.location.Address -- testpackage.abstraction.Person
testpackage.location.City -- testpackage.location.Address
testpackage.location.State -- testpackage.location.City
testpackage.location.Country -- testpackage.location.State
testpackage.university.people.Lecturer -- testpackage.university.learn.Course
testpackage.university.learn.Course -- testpackage.university.people.Student
testpackage.abstraction.Person <|-- testpackage.university.people.Lecturer
testpackage.abstraction.Person <|-- testpackage.university.people.Student
testpackage.abstraction.PersistInterface .. testpackage.abstraction.Person
@enduml
```
