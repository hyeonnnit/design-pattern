package ex07;

import ex07.lib.DB;
import ex07.lib.MariaDB;
import ex07.lib.OracleDB;

public class App {
    public static void main(String[] args) {

//        MariaDB mariaDB = new MariaDB();
//        mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");
//        mariaDB.execute("select");
//
//        OracleDB oracleDB = new OracleDB();
//        oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
//        oracleDB.execute("select");
        DBFactory factory = DBFactory.getInstance();
        DB oracleDB = factory.createDB("maria");
    }
}
