package africa.semicolon.yarnMe.services;

import africa.semicolon.yarnMe.data.models.Article;
import africa.semicolon.yarnMe.dtos.requests.CreateArticleRequest;

public interface ArticleService {
    Article createNewArticle(CreateArticleRequest createArticleRequest);

    Article findArticle(int id);

    long count();
}