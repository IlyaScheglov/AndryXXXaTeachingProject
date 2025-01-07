package moreobjects;

public class AbstractExtender extends AbstractTestClass {

    public AbstractExtender(String login, String password) {
        super(login, password);
    }

    @Override
    public void doSmth() {
        System.out.println(super.getLogin() + " " + super.getPassword());
    }
}
