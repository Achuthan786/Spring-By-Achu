package com.telusko.dao;
import java.util.List;   
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.telusko.bean.CustomerBean;

public class CustomerDao {

	JdbcTemplate template;  // importing jdbc template
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	public int save2(CustomerBean cbobj)  // save2 method has link with line no 34 in customer controller
	{
		
		//String sql="insert into customertable(CustomerId,CustomerName,CustomerArea,CustomerContactNo) values ('"+cbobj.getCustomerId()+"',"+cbobj.getCustomerName()+",'"+cbobj.getCustomerArea()+"'+'"+cbobj.getCustomerContactNo()+"')";
		String sql="insert into customertable (CustomerId,CustomerName,CustomerArea,CustomerContactNo) values ("+cbobj.getCustomerId()+",'"+cbobj.getCustomerName()+"','"+cbobj.getCustomerArea()+"',"+cbobj.getCustomerContactNo()+")";
		return template.update(sql);
	}
	
public int deletetemp(int id)
{
	String sql="delete from customertable where CustomerId="+id+"";    
    return template.update(sql);  
}

public int update(CustomerBean m)
{
	String sql="update customertable set CustomerName='"+m.getCustomerName()+"', CustomerArea='"+m.getCustomerArea()+"',CustomerContactNo='"+m.getCustomerContactNo()+"' where CustomerId="+m.getCustomerId()+"";    
    return template.update(sql);
}
public CustomerBean getByCustomerId(int customerId)
{
	String sql="select * from customertable where CustomerId=?";
	return template.queryForObject(sql, new Object[]{customerId},new BeanPropertyRowMapper<CustomerBean>(CustomerBean.class)); 
}
	public List<CustomerBean> getCustomers()
	{
		return template.query("select * from customertable",new RowMapper<CustomerBean>()
				{
			public CustomerBean mapRow(ResultSet rs,int row) throws SQLException
			{
				CustomerBean cbobj2=new CustomerBean();
				cbobj2.setCustomerId(rs.getInt(1));
				cbobj2.setCustomerName(rs.getString(2));
				cbobj2.setCustomerArea(rs.getString(3));
				cbobj2.setCustomerContactNo(rs.getInt(4));
				
				return cbobj2;
				
			}
				});	
	}
}
