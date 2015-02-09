-- 게시판
DROP TABLE IF EXISTS board RESTRICT;

-- 게시판
CREATE TABLE board (
	bno      INTEGER       NOT NULL COMMENT '번호', -- 번호
	btitle   VARCHAR(110)  NOT NULL COMMENT '제목', -- 제목
	bcontent VARCHAR(1000) NOT NULL COMMENT '내용', -- 내용
	bwriter  VARCHAR(50)   NOT NULL COMMENT '글쓴이', -- 글쓴이
	bpass    VARCHAR(40)   NOT NULL COMMENT '비밀번호', -- 비밀번호
	recom    INTEGER       NULL     COMMENT '추천수', -- 추천수
	bdate    DATETIME      NOT NULL COMMENT '날짜' -- 날짜
)
COMMENT '게시판';

ALTER TABLE board
	MODIFY COLUMN bno INTEGER NOT NULL AUTO_INCREMENT COMMENT '번호';