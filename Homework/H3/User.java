package Exception.Homework.H3;

public class User {
    private String lastName; //фамилия
    private String firstName; //имя
    private String fatherName; //отчество
    private String dateBirth;
    private String phoneNumber;
    private String sex;

    public User(String lastName, String firstName, String fatherName, String dateBirth, String phoneNumber, String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, fatherName, dateBirth, phoneNumber, sex);
    }

    public String getLastName() {
        return lastName;
    }
}
