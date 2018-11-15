
package message;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author Ion Mikel Lopez, Lander Lluvia and Jon Gonzalez
 */
public class User implements Serializable{
    private static long serialVersionUID = 667L;
    private Integer id;
    private Status status;
    private Privilege privilege;
    private String fullName;
    private String login;
    private String email;
    private String password;
    private Timestamp lastAcces;
    private Timestamp lastPasswordChange;
    
    public User(Status status, Privilege privilege) {
        this.status=status;
        this.privilege=privilege;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Status getStatus() {
        return status;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Timestamp getLastAcces() {
        return lastAcces;
    }

    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastAcces(Timestamp lastAcces) {
        this.lastAcces = lastAcces;
    }

    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
}
