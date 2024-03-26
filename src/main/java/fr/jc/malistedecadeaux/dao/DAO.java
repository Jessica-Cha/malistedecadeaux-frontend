package fr.jc.malistedecadeaux.dao;

import java.sql.Connection;

public abstract class DAO <T> {
    public Connection getConnection() {
        return BDDConnect.getInstance();
    }
}
