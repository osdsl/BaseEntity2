import java.util.Objects;

public class Teacher extends Person {
    private int uniqueNumber;
    private String uniqueString;

    public Teacher() {
        super();
        this.uniqueNumber = 0;
        this.uniqueString = "defaultUniqueString";
    }

    public Teacher(int id, String name, int uniqueNumber, String uniqueString) {
        super(id, name);
        setUniqueNumber(uniqueNumber);
        this.uniqueString = uniqueString;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        // Проверка диапазона для uniqueNumber, если требуется
        this.uniqueNumber = uniqueNumber;
    }

    public String getUniqueString() {
        return uniqueString;
    }

    public void setUniqueString(String uniqueString) {
        this.uniqueString = uniqueString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        if (!super.equals(o)) return false;
        Teacher that = (Teacher) o;
        return uniqueNumber == that.uniqueNumber &&
                Objects.equals(uniqueString, that.uniqueString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniqueNumber, uniqueString);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uniqueNumber=" + uniqueNumber +
                ", uniqueString='" + uniqueString + '\'' +
                '}';
    }
}
