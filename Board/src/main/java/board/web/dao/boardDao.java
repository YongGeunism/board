package board.web.dao;

import board.web.domain.Board;

import java.util.List;
import java.util.Map;

public interface boardDao {
	public List<?> selectList(Map<String,Object> params);
	public void delete(int no);
	public void update(int no);
	public void insert(Board board);
	public Board selectOne(Integer no);
	public int totalSize(Map<String,Object> params);

}
