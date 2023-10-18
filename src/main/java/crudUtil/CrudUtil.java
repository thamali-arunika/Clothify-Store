package crudUtil;

import db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {
    public static <S> S execute(String sql, Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement psTm = DBConnection.getInstance().getConnection()
                .prepareStatement(sql);

        for (int i = 0; i < args.length; i++) {
            psTm.setObject((i + 1), args[i]);
        }
        if (sql.startsWith("SELECT") || sql.startsWith("select")) {
            return (S) psTm.executeQuery();
        }
        return (S) (Boolean)(psTm.executeUpdate()>0);
}

}
