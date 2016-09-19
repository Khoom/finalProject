package oh.test.model;

import org.mybatis.spring.SqlSessionTemplate;

public class TestDAOImple implements TestDAO {

	private SqlSessionTemplate sqlMap;
	
	public TestDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}
	
	public int add(TestDTO dto) {
		
		int result = sqlMap.insert("empInsert", dto);
		
		return result;
	}

}
