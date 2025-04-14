package com.java.rest.responsemodel;

import java.util.List;

public class getuserlistpojo {


	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getPer_page() {
		return per_page;
	}

	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	@Override
	public String toString() {
		return "getuserlistpojo [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", data=" + data + ", support=" + support + "]";
	}

	private String page;
    private String per_page;
    private String total;
    private String total_pages;
    private List<Data> data;
    private Support support;
    
    
    
    public static class Data {
    	public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getAvatar() {
			return avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		@Override
		public String toString() {
			return " id=" + id + ", \nemail=" + email + ", \nfirst_name=" + first_name + ", \nlast_name=" + last_name
					+ ", \navatar=" + avatar + "";
		}
		private String id; 
    	private String email;
    	private String first_name;
    	private String last_name;
    	private String avatar;
    	
    	
    }
    
    public static class Support{
    	
    	public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		@Override
		public String toString() {
			return "Support [url=" + url + ", text=" + text + "]";
		}
		private String url;
    	private String text;
    }
    	
    
}
