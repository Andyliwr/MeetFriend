package meetFriend;

import java.sql.ResultSet;
import java.sql.SQLException;
public class test {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws SQLException{
		Operation op = new Operation();
		op.getConnection();
		String[] parameters = {"Andyliwr"};
		op.executeQuery("select * from userTable where username=?", parameters );
		ResultSet rss = op.getRs();
		//System.out.println(rss.getString(0));
		System.out.println(rss.next());
		System.out.println(rss.next());
		System.out.println(rss.first());
		System.out.println(rss.getString("username"));
		System.out.println(rss.getString("password"));
		//op.executeInsert("insert into userTable(id, username, password, mail, tel, Admin) values(?, ?, ?, ?, ?,?)", parameters);
	}
}