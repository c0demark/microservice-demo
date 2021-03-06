package be.g00glen00b.service.data;

import be.g00glen00b.service.web.model.ArticleDTO;
import be.g00glen00b.service.web.model.ArticleSort;
import be.g00glen00b.service.web.model.ArticlesDTO;

public interface ArticleService {
    ArticlesDTO findAll(ArticleQuery query, int offset, int limit, ArticleSort sort);
    ArticleDTO findOne(String slug);
    ArticleDTO save(ArticleDTO dto);
    ArticleDTO update(String slug, ArticleDTO input);
    void delete(String slug);
}
