package lemon.weixin.bean.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * News message
 * 
 * @author lemon
 * 
 */
public class NewsMessage extends BasicMessage {
	/** ArticleCount(图文消息个数，限制为10条以内) */
	@XStreamAlias("ArticleCount")
	private int articleCount;
	/** Articles(多条图文消息信息，默认第一个item为大图) */
	@XStreamAlias("Articles")
	private Article[] articles;
	
	public NewsMessage(){
		super(MsgType.NEWS);
	}
	public int getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}
}
