public class PersonBuilder {

    protected Person person;

    public Person getPerson() {

        return person;

    }

    public void crearNuevoPerson() {

        person = new Person();

    }

    public void name(String name) {

        person.setName(name);

    }

    public void age(int age) {

        person.setAge(age);

    }

}
