import java.sql.*;
class JDBCSelectMySQL{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aits","root","jkclab");
			Statement stmt=con.createStatement();
			String sQuery="select *from aitsgoogle";
			ResultSet rs=stmt.executeQuery(sQuery);
			int i=1;
			while(rs.next()){
				System.out.println("Google Employee:"+i);
				System.out.println("********************");
				System.out.print("ID:"+rs.getString("empid")+"\t");
				System.out.print("Name:"+rs.getString("empname")+"\t");
				System.out.print("Designation:"+rs.getString("empdes")+"\n");
				i++;
			}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}