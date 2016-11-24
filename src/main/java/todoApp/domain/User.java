package todoApp.domain;

import javax.persistence.*;

@Entity
@Table(name = "usersdb")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/* if left unannotated, they’ll be mapped to columns that share the same name as the properties themselves */
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;

	protected User() {}

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", login='" + login + '\'' + '}';
	}
}
