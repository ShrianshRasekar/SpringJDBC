package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        // JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
        //insert query
        //String query="insert into student values(?,?,?)";
        
        //fire query        
        //int result= template.update(query,2,"anshu","bramhapuri");
        //System.out.println("No. of record inserted "+result);
        
		/*Insert new record
		 * StudentDao studentdao= context.getBean("studentdao",StudentDao.class);
		 * Student student= new Student(); student.setSid(6); student.setSname("Lobby");
		 * student.setScity("Magbhid");
		 * 
		 * int result=studentdao.insert(student);
		 * System.out.println("No. of Student inserted "+result);
		 */
        
		/*
		 * StudentDao studentdao= context.getBean("studentdao",StudentDao.class);
		 * Student student= new Student(); student.setSid(6);
		 * student.setSname("Sushant"); student.setScity("Satara");
		 * 
		 * int result=studentdao.update(student);
		 * System.out.println("Student "+student.getSid()+" updated "
		 * +result+" rows affected" );
		 */
		/* default method in java 8
		 * StudentDaoImpl s=new StudentDaoImpl(); s.shows();
		 */
		 
		 StudentDao studentdao= context.getBean("studentdao",StudentDao.class);
		 
		 
		 int result=studentdao.delete(4);
		 System.out.println("Student  deleted "+result+" rows affected" );
    }
}
