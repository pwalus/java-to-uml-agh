# java-to-uml-agh

Program służący do zamiany kodu Java do opisowego języka PlantUML, który można przekształcić następnie do postaci wizualnej na przykład za pomocą narzędzia https://www.planttext.com

Na cele projektu została przygotowana gramatyka dla języka Java w wersji 8 opierając się na specyfikacji języka. Do tego celu wykorzystaliśmy narzędzie ANTLR, które pozwala na generowanie parserów na podstawie przygotowanej gramatyki. Poprawność gramatyki testowaliśmy przy pomocy pluginu ANTLR v4 grammar plugin instalowanego w Intellij IDEA oraz przygotowanych testowych plików \*.java. Następnie dodawaliśmy nowe funkcjonalności przetwarzania sparsowanego drzewa, dla których odrazu były przygotowywane testy. 

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
