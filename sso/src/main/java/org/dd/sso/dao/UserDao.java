package org.dd.sso.dao;

import java.util.List;

import org.dd.sso.bean.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: SDD
 * Date: 14-5-17
 * Time: 下午11:40
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDao extends BaseDao {

	public User findByUserName(String userName) {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT u.USERNAME, u.PASSWORD, u.ENABLED, u.USERNAMECN FROM users u ");
		sql.append(" WHERE ");
		sql.append(" 	u.USERNAME = ? ");
		List<User> list  = this.getJdbcTemplate().query(sql.toString(), new Object[]{userName}, BeanPropertyRowMapper.newInstance(User.class));
		return list != null && list.size() > 0 ? list.get(0) : null;
	}

}