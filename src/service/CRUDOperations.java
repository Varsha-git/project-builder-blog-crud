package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		list.set(list.indexOf(blog), blog);
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		 list.remove(blog);
	      System.out.println("\nAfter removing: "+list);
		return list;
		
	}
	
		
	public Object sortByTitle(List<Blog> blog) {
		ArrayList<Blog> sortByTitle=new ArrayList<>();	
		sortByTitle.sort((t1,t2) -> t1.getBlogTitle().compareTo(t2.getBlogTitle()));
		System.out.println("\nSort by Title: "+sortByTitle);
		return sortByTitle;
		}
	
	public Object sortByDate(List<Blog> blog) {
		ArrayList<Blog> sortByDate=new ArrayList<>();	
		sortByDate.sort((d1,d2) -> d1.getDate().compareTo(d2.getDate()));
		System.out.println("\nSort by Date: "+sortByDate);
		return sortByDate;
		}
}
