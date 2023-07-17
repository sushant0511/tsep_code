import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		
		List<User> list=new LinkedList<User>();
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/tsep", "root", "root");
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("SELECT * FROM facebook");
			while(rs.next())
			{
				User user=new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				list.add(user);
			}
			System.out.println(list.size());
			for(User u:list)
			{
				if(u.getName().equals("Amit"));
				{
					//System.out.println(u.getId());
				}
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
}
