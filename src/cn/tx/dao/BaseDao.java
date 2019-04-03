package cn.tx.dao;

import java.util.List;

import cn.tx.model.Dep;
import cn.tx.query.DepQuery;

public interface BaseDao<T, Q> {

	
	public void save(T t);
	
	public void update(T t);
	
	public T getObj(Integer id);
	
	public void delete(Integer id);
	
	public void delete(T t);
	
	/**
	 * 查询的数据是每一页的记录
	 * @param q
	 * @return
	 */
	public List<T> queryObjByCondition(final Q q, final List<String> exclude );
	
	/**
	 * 查询指定条件下的总记录数
	 * @param q
	 * @return
	 */
	
	
	public List<T> list();

	public Long queryObjByConditionCount(final Q q, final List<String> exclude);
	
	
	public List<T> queryObjByConditionNoPage(final Q q, final List<String> exclude );
}
