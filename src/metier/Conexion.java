
package metier;

import java.sql.*;
public class Conexion {
    private Connection c =null;
    private Statement stmt =null;
    
    public Conexion() throws ClassNotFoundException, SQLException
    {
    	
    	
        String url = "jdbc:mysql://localhost:3306/achraf?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        c = DriverManager.getConnection(url,"root","");
        
        
        stmt = c.createStatement();
        
        

        
    }
    public Statement getStmt() {
		return stmt;
	}
    
    
    
}
