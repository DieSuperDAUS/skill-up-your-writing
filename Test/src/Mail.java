import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

	
	public Mail(String from, String to, String subject, String text) throws AddressException, MessagingException{
		
	
	Properties p = new Properties();
	       p.put("mail.smtp.auth","true");
	       p.put("mail.smtp.host", "EEGDAG001");
	       p.put("mail.smpt.port", "25");
	       
	       Session s = Session.getDefaultInstance(p);
	       
	      
	       Message message = new MimeMessage(s);
	       message.setFrom(new InternetAddress(from));
	       message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to) );
	       message.setSubject(subject);
	       message.setText(text);
	       Transport.send(message);
	       //
	       
	       
	}
}
