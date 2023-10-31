package midterm;
import java.util.ResourceBundle;
public class App {
	public int login(String userid, String pwd)
	{
		ResourceBundle rb = ResourceBundle.getBundle("config") ;
		String user = rb.getString("username");
		String id = rb.getString("ID");
		
		if (userid.equals(user) && pwd.equals(id))
			return 1;
		else
			return 0;	
	}
}