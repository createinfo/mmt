package lemon.weixin.bean.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Article for news message
 * @author lemon
 *
 */
@XStreamAlias("item")
public class Article {
	/** Title */
	@XStreamAlias("Title")
	private String title;
	/** Description */
	@XStreamAlias("Description")
	private String description;
	/** PicUrl(图片链接，支持JPG、PNG格式，较好的效果为大图640*320，小图80*80) */
	@XStreamAlias("PicUrl")
	private String picUrl;
	/** Url(点击图文消息跳转链接) */
	@XStreamAlias("Url")
	private String url;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
