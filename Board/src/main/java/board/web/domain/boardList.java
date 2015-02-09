package board.web.domain;

import java.io.Serializable;
import java.util.Date;

public class boardList implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	protected int boardNo;
	protected String boardTitle;
	protected String boardContent;
	protected String boardWriter;
	protected String boardPasswd;
	protected int boardRecommend;
	protected Date boardDate;
	
	
	
	@Override
	public String toString() {
		return "boardList [boardNo=" + boardNo + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardWriter="
				+ boardWriter + ", boardPasswd=" + boardPasswd
				+ ", boardRecommend=" + boardRecommend + ", boardDate="
				+ boardDate + "]";
	}
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardPasswd() {
		return boardPasswd;
	}
	public void setBoardPasswd(String boardPasswd) {
		this.boardPasswd = boardPasswd;
	}
	public int getBoardRecommend() {
		return boardRecommend;
	}
	public void setBoardRecommend(int boardRecommend) {
		this.boardRecommend = boardRecommend;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	
	
	
	
	
}
