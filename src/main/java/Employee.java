import java.util.Objects;

public class Employee extends Person {
    private boolean uniqueBoolean;
    private String anotherUniqueString;

    public Employee() {
        super();
        this.uniqueBoolean = false;
        this.anotherUniqueString = "defaultAnotherUniqueString";
    }

    public Employee(int id, String name, boolean uniqueBoolean, String anotherUniqueString) {
        super(id, name);
        this.uniqueBoolean = uniqueBoolean;
        this.anotherUniqueString = anotherUniqueString;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee that = (Employee) o;
        return uniqueBoolean == that.uniqueBoolean &&
                Objects.equals(anotherUniqueString, that.anotherUniqueString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniqueBoolean, anotherUniqueString);
    }

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
