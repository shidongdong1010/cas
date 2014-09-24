package org.dd.sso.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterBatchUpdateUtils;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: SDD
 * Date: 13-12-25
 * Time: 下午11:04
 * To change this template use File | Settings | File Templates.
 */
public class BaseDao {

	private static Logger logger=Logger.getLogger(BaseDao.class);
	@Resource(name="jdbcTemplate")
	protected JdbcTemplate jdbcTemplate;
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate(){
		if(namedParameterJdbcTemplate == null){
			namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.getJdbcTemplate());
		}
		return namedParameterJdbcTemplate;
	}
}
