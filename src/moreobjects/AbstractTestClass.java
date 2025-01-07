package moreobjects;

public abstract class AbstractTestClass {

    private String login;

    private String password;

    public AbstractTestClass(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public abstract void doSmth();

    String getLogin() {
        return login;
    }

    String getPassword() {
        return password;
    }
}
