public class User {
    private int id;
    private String name;
    private String surName;
    private String userMail;
    private String Password;

    public User(int id, String name, String surName, String userMail, String password) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.userMail = userMail;
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
