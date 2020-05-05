package com.bjsxt.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bjsxt.dao.FlowerDao;
import com.bjsxt.pojo.Flower;
/**
 * 鏁版嵁搴撹闂眰瑕佹湁寮傚父澶勭悊
 * @author Administrator
 *
 */
public class FlowerDaoImpl implements FlowerDao{

	@Override
	public List<Flower> selAll() {
		//jdk 1.7 寮�濮嬪悗闈㈡硾鍨嬪彲浠ョ渷鐣�
		List<Flower> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm","root","66236983");
			ps = conn.prepareStatement("select * from flower");
			rs = ps.executeQuery();
			while(rs.next()){
				list.add(new Flower(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int insFlower(Flower flower) {
		int  index= 0;
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm","root","66236983");
			ps = conn.prepareStatement("insert into flower values(default,?,?,?)");
			ps.setObject(1, flower.getName());
			ps.setObject(2, flower.getPrice());
			ps.setObject(3, flower.getProduction());
			index = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return index;
	}

}
