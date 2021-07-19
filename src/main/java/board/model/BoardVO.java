package board.model;

import java.util.Date;

public class BoardVO {
	int idx;
	String title;
	String content;
	int readcount;
	int groupid;
	int depth;
	int re_order;
	int isdel;
	String write_id;
	String write_name;
	Date write_day;
	
	public BoardVO() {
	
	}

	
	public BoardVO(String title, String content, String write_id, String write_name) {
		this.title = title;
		this.content = content;
		this.write_id = write_id;
		this.write_name = write_name;
	}


	public BoardVO(int idx, String title, String content, int readcount, int groupid, int depth, int re_order, int isdel,
			String write_id, String write_name, Date write_day) {
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.readcount = readcount;
		this.groupid = groupid;
		this.depth = depth;
		this.re_order = re_order;
		this.isdel = isdel;
		this.write_id = write_id;
		this.write_name = write_name;
		this.write_day = write_day;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getReOrder() {
		return re_order;
	}

	public void setReOrder(int re_order) {
		this.re_order = re_order;
	}

	public int getIsdel() {
		return isdel;
	}

	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

	public String getWriteId() {
		return write_id;
	}

	public void setWriteId(String write_id) {
		this.write_id = write_id;
	}

	public String getWriteName() {
		return write_name;
	}

	public void setWriteName(String write_name) {
		this.write_name = write_name;
	}

	public Date getWriteDay() {
		return write_day;
	}

	public void setWriteDay(Date write_day) {
		this.write_day = write_day;
	}

	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", title=" + title + ", content=" + content + ", groupid=" + groupid + ", depth="
				+ depth + ", reOrder=" + re_order + "]";
	}
	
	
	
}
