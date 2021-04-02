package web_basic.jsp_12;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;

	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("noname890131", "yayyxweyuvqkorud");
	}

	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
}
