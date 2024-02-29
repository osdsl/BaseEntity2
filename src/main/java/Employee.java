import java.util.Objects;

public class Employee extends Person {
    private boolean uniqueBoolean;
    private String anotherUniqueString;

    public Employee() {
        super();
        this.uniqueBoolean = false;
        this.anotherUniqueString = "defaultAnotherUniqueString";
    }
//Конструктор для создания объектов класса Employee с заданными значениями полей
    public Employee(int id, String name, boolean uniqueBoolean, String anotherUniqueString) {
        super(id, name);
        this.uniqueBoolean = uniqueBoolean;
        this.anotherUniqueString = anotherUniqueString;
    }
//Методы доступа  позволяют получить и установить значения уникальных полей класса Employee
    public boolean isUniqueBoolean() {
        return uniqueBoolean;
    }

    public void setUniqueBoolean(boolean uniqueBoolean) {
        this.uniqueBoolean = uniqueBoolean;
    }

    public String getAnotherUniqueString() {
        return anotherUniqueString;
    }

    public void setAnotherUniqueString(String anotherUniqueString) {
        this.anotherUniqueString = anotherUniqueString;
    }
// Метод  переопределен для сравнения объектов класса Employee.
// Он сначала использует метод equals суперкласса Person, 
// а затем сравнивает уникальные поля uniqueBoolean и anotherUniqueString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee that = (Employee) o;
        return uniqueBoolean == that.uniqueBoolean &&
                Objects.equals(anotherUniqueString, that.anotherUniqueString);
    }
// Метод переопределен для вычисления хэш-кода объекта Employee на основе значений всех его полей
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniqueBoolean, anotherUniqueString);
    }
// Метод переопределен для представления информации об объекте класса Employee в виде строки
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uniqueBoolean=" + uniqueBoolean +
                ", anotherUniqueString='" + anotherUniqueString + '\'' +
                '}';
    }
}
