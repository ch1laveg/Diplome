
package requestreciever;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBWorker {
    ConnectDB ConnectDB;
    Connection conn;
    public static ArrayList<String> listNames;
    public static Map<String, String> reqTypeList;
    public static Map<String, String> nameID;
    public static int id = 0;
    
    public DBWorker(){
        ConnectDB = new ConnectDB();
        conn = ConnectDB.getConn();
        listNames = new ArrayList<>();                
        this.install();
    }
    private void install(){
        try {
            Statement st = conn.createStatement();
            st.execute("PRAGMA journal_mode=WAL;");
            st.execute("create table if not exists users("
                    + "name text, password text, rule integer)");
            st.execute("create table if not exists requests(ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "username text, reqType integer, addInfo text)");
        } catch (SQLException ex) {
            System.out.println("Таблица не была создана");
        }
    }
    
    public void setRequest(String name, int reqType, String addInfo){
        try {
            Statement st = conn.createStatement();
            st.execute("insert into requests(username, reqType, addInfo)"
                    + "values('" + name + "','" + reqType + "','" + addInfo + "') ");
            System.out.println("Добавлено");
        } catch (SQLException ex) {
            System.out.println("Не удалось добавить заявку");
        } 
    }
    public void changeRequest(int id, String name, int reqType, String addInfo){
        try {
            Statement st = conn.createStatement();  
            st.execute("update requests set username = '" + name + "', reqType = '" + reqType + "', addInfo ='"
                    + addInfo + "' WHERE ID = '" + id + "'");
        } catch (SQLException ex) {
            System.out.println("Не удалось изменить текст заявки " + ex.getLocalizedMessage());
        }
    }
    public void setUser(String name, String password, int rule){
        try {
            Statement st = conn.createStatement();
            st.execute("insert into users(name, password, rule)"
                    + "values('" + name + "','" + password + "','" + rule + "') ");
        } catch (SQLException ex) {
            System.out.println("Не удалось добавить пользователя");
        }        
    }
    public String[] getUser(String name){
        String[] tmp = new String[3];
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from users where name = '" + name + "'");
            while(rs.next()){
                tmp[0] = rs.getString("name");
                tmp[1] = rs.getString("password");
                tmp[2] = rs.getString("rule");
            }
        } catch (SQLException ex) {
            System.out.println("Не удалось извлечь пользователя или пользователь не найден");
        }
        return tmp;        
    }
    
    public void getNamesForList(){        
        try {
            nameID = new HashMap<>();
            reqTypeList = new HashMap<>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select username, reqType, ID from requests");           
            while (rs.next()){
                int i = 1;
                DBWorker.listNames.add(rs.getString("username"));
                DBWorker.reqTypeList.put(rs.getString("username"), rs.getString("reqType"));
                DBWorker.nameID.put(rs.getString("username"), rs.getString("ID")); //Нужен для getID
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Не удалось получить пользователя из БД для листа");
        }        
    }  
    public int getID(String name){
        int ID;
        ID = Integer.parseInt(DBWorker.nameID.get(name));
        System.out.println(ID);
        return ID;        
    }
    
    public void clearRequests(){
        try {
            Statement st = conn.createStatement();
            st.execute("drop table requests");
        } catch (SQLException ex) {
            System.out.println("Не удалось очистить таблицу заявок" + ex.getMessage());
        }        
    }
    public String getNameByID(int id){
        String name = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select username from requests where ID = '" + id + "'");
            name = rs.getString("username");
        } catch (SQLException ex) {
            System.out.println("Не удалось получить имя по айди");
        }        
        return name;
    }
    public int getReqTypeByID(int id){
        int reqType = 0;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select reqType from requests where ID = '" + id + "'");
            reqType = Integer.parseInt(rs.getString("reqType"));
        } catch (SQLException ex) {
            System.out.println("Не удалось получить тип по айди");
        }        
        return reqType;
    }
    public String getAddInfoByID(int id){
        String addInfo = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select addInfo from requests where ID = '" + id + "'");
            addInfo = rs.getString("addInfo");
        } catch (SQLException ex) {
            System.out.println("Не удалось получить текст заявки по айди");
        }        
        return addInfo;
    }
    
    
    
    
    
}
