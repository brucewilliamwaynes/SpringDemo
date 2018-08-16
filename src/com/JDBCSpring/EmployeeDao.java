package com.JDBCSpring;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;

    }

    public int saveEmployee(Employee e){

        String query = "insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";

        return jdbcTemplate.update(query);

    }

    public int updateEmployee(Employee e){

        String query = "update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";

        return jdbcTemplate.update(query);

    }

    public int deleteEmployee(Employee e){

        String query="delete from employee where id='"+e.getId()+"' ";

        return jdbcTemplate.update(query);

    }


    public Boolean saveEmployeeByPreparedStatement(Employee emp) {

        String query = "insert into employee values(?,?,?)";

        return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

                ps.setInt(1, emp.getId());

                ps.setString(2, emp.getName());

                ps.setFloat(3, emp.getSalary());

                return ps.execute();

            }
        });
    }

}
