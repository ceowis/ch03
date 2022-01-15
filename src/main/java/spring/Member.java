package spring;

import java.util.Date;

public class Member {
    private Long id;
    private String email;
    private String password;
    private String name;
    private Date registerDate;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(final Date registerDate) {
        this.registerDate = registerDate;
    }

    public Member(String email, String password, String name, Date registerDate){
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDate = registerDate;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(!password.equals(oldPassword))
            throw new IdPasswordNotMatchingException();

        this.password = newPassword;

    }
}
