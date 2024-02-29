import java.util.Objects;
public class Student extends Person {
    private double uniqueField; // Уникальное числовое поле для класса

    public Student() {
        super();
        this.uniqueField = 0.0;
    }

    public Student(int id, String name, double uniqueField) {
        super(id, name);
        setUniqueField(uniqueField);
    }

    public double getUniqueField() {
        return uniqueField;
    }

    public void setUniqueField(double uniqueField) {
        // Проверка на допустимый диапазон, например от 0 до 100
        if (uniqueField >= 0 && uniqueField <= 100) {
            this.uniqueField = uniqueField;
        } else {
            throw new IllegalArgumentException("Unique field must be between 0 and 100.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student that = (Student) o;
        return Double.compare(that.uniqueField, uniqueField) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniqueField);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uniqueField=" + uniqueField +
                '}';
    }
}
