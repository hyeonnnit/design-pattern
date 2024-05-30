package ex07;

import ex07.lib.DB;
import ex07.lib.MariaDB;
import ex07.lib.OracleDB;

public class DBFactory {
    private static DBFactory instance = new DBFactory();

    private DBFactory(){}

    public static DBFactory getInstance(){
        return instance;
    }

    public DB createDB(String protocol){
        if (protocol.equals("maria")){
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");
            return mariaDB;
        }else if (protocol.equals("oracle")){
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
            return oracleDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
