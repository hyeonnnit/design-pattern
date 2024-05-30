package ex07_01;

import ex07_01.lib.DB;
import ex07_01.lib.Driver;
import ex07_01.lib.MariaDB;
import ex07_01.lib.OracleDB;

public class DBFactory {
    private static DBFactory instance = new DBFactory();

    private DBFactory(){}

    public static DBFactory getInstance(){
        return instance;
    }

    public DB createDB(Driver driver){
        if (driver.getProtocol().equals("maria")){
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");
            return mariaDB;
        }else if (driver.getProtocol().equals("oracle")){
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
            return oracleDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
