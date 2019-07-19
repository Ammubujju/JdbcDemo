package com.stackroute;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        SimpleJdbcDemo simple=new SimpleJdbcDemo();
        simple.getEmployeeDetails();
        simple.getEmployeeDetailsInReverse();
        simple.getEmployeeDetailsFromSecondRowInReverse();
        simple.getEmployeeDetailsByNameAndGender("ammu","female");

        System.out.println("----------------------------------------------------------");
        DatabaseMetaDataDemo databaseMetadataDemo=new DatabaseMetaDataDemo();
        System.out.println("----------------------------------------------------------");
        databaseMetadataDemo.databaseMetaData();

        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        System.out.println("----------------------------------------------------------");
        jdbcBatchDemo.jdbcBatch();

        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        System.out.println("----------------------------------------------------------");
       /* try {
            jdbcTransactionDemo.jdbcTransaction();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
*/

        ResultSetMetadataDemo resultsetmetadatademo=new ResultSetMetadataDemo();
        resultsetmetadatademo.getResultSetMetadata();

        RowSetDemo rowsetdemo=new RowSetDemo();
        rowsetdemo.rowSetDemo();
    }
}
