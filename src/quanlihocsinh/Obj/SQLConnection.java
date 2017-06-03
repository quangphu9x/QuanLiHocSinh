
package quanlihocsinh.Obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConnection {
    
    private String hostName;
    private String username;
    private String password;
    private String dbName;
    private boolean connectSuccessfully = false;
    private ArrayList<Connection> connectionManager;
    
    public SQLConnection() {
        try {
            getUser();
            
            // quan li cac ket noi csdl
            connectionManager = new ArrayList<>();
            // kiem tra ket noi
            testConnection();
        } catch (IOException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // thu ket noi voi CSDL
    public boolean testConnection() {
        try {
            Connection connection = getConnection();
            connection.close();
            connectSuccessfully = true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connectSuccessfully;
    }
    
    // kiem tra ket noi thanh cong hay chua
    public boolean isConnected() {
        return connectSuccessfully;
    }
    
    private void getUser() throws IOException {
        InputStreamReader isReader = new InputStreamReader(getClass().getResourceAsStream("/quanlihocsinh/Obj/SQL.txt"));
        BufferedReader br = new BufferedReader(isReader);
        hostName = br.readLine();
        dbName = br.readLine();
        username = br.readLine();
        password = br.readLine();
        br.close();
    }
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
        Connection connection = DriverManager.getConnection(connectionURL, username, password);
        connectionManager.add(connection);
        return connection;
    }
    
    public void closeAllConnection() {
        int count = 0;
        while(connectionManager.size() > 0) {
            try {
                if(!connectionManager.get(0).isClosed()) {
                    connectionManager.get(0).close();
                    count++;
                }
                connectionManager.remove(0);
            } catch (SQLException ex) {
                Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("closed " + count + " connection.");
    }

}
