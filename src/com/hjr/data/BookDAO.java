package com.hjr.data;

import java.util.HashMap;
import java.util.Map;

import com.hjr.domain.Book;

public class BookDAO {

	private static Map<Integer,Book> books = new HashMap<Integer,Book>();

	static {
		Book book1 = new Book(1, "三国演义", 20.0, "武汉大学出版社", "滚滚长江东逝水，浪花淘尽英雄！");
		Book book2 = new Book(2, "水浒传", 30.0, "北京大学出版社", "兄弟相逢三碗酒，兄弟安民万世夸");
		Book book3 = new Book(3, "西游记", 20.0, "人民教育出版社", "你挑着担，我牵着马");
		Book book4 = new Book(4, "聊斋志异", 20.0, "武汉大学出版社", "你也说聊斋，我也说聊斋");
		Book book5 = new Book(5, "红楼梦", 20.0, "武汉大学出版社", "满纸荒唐言，一把辛酸泪");
		Book book6 = new Book(7, "封神演义", 20.0, "武汉大学出版社", "心如流水常自在，意如流水任西东");
		Book book7 = new Book(8, "世说新语", 20.0, "武汉大学出版社", "蓬莱文章建安骨，魏晋风流");
		Book book8 = new Book(9, "庄子", 20.0, "武汉大学出版社", "乘天地之正，而御六气之辨");
		Book book9 = new Book(10, "论语", 20.0, "武汉大学出版社", "学而时习之，不亦说乎？");
		Book book10 = new Book(1, "孟子", 20.0, "武汉大学出版社", "为天地立心，为生民立命");

		books.put(book1.getId(),book1);
		books.put(book2.getId(),book2);
		books.put(book3.getId(),book3);
		books.put(book4.getId(),book4);
		books.put(book5.getId(),book5);
		books.put(book6.getId(),book6);
		books.put(book7.getId(),book7);
		books.put(book8.getId(),book8);
		books.put(book9.getId(),book9);
		books.put(book10.getId(),book10);
	}

	public static Map<Integer,Book> getAll() {
		return books;
	}
	
	public static Book findById(Integer id) {
		return books.get(id);
	}

}
