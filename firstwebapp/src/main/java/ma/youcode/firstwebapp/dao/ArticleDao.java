package ma.youcode.firstwebapp.dao;


import java.util.List;

import ma.youcode.firstwebapp.models.Article;

public interface ArticleDao {

    /**
     * Add new article
     * @param articleTitle title of article
     * @param articleBody body of article
     */
    int add(String articleTitle, String articleBody);

    /**
     * Get all articles
     * @return all articles
     */
    List<Article> getAllArticles();
    
    /**
     * Get article by an id
     * @param ArticleID
     * @return an article by passing its id
     */
    List<Article> getArticleById(int ArticleID);
    
    /**
     * Search an article by it's titl
     * @param articleTitle
     * @return match articles
     */
    List<Article> searchArticleByTitle(String articleTitle);
}
