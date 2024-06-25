package models;

public class Person {
    private Long idPerson;
    private String firstName;
    private String LastName;
    private int age;
    private String email;
    private SocialMedia socialMedia;
    private Car car;

    public Person(Long idPerson, String firstName, String lastName, int age, String email ) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.email = email;
    }

    public Person(Long idPerson, String firstName, String lastName, int age, String email, SocialMedia socialMedia, Car car) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.email = email;
        this.socialMedia = socialMedia;
        this.car = car;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + idPerson +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", socialMedia=" + socialMedia +
                ", car=" + car +
                '}';
    }
}