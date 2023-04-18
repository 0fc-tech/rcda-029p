package com.example.cadox.dao

import com.example.cadox.bo.Article
import com.example.cadox.dao.apirest.ArticleDAOApiRESTImpl
import com.example.cadox.dao.db.ArticleDAODbImpl
import com.example.cadox.dao.memory.ArticleDAOMemoryImpl

object ArticleRepository {
    private var daoDb :IArticleDAO = ArticleDAOFactory.getArticleDAO(DAOType.DB);
    private var  daoMemory :IArticleDAO = ArticleDAOFactory.getArticleDAO(DAOType.MEMORY)
    private var  daoApiRest: IArticleDAO = ArticleDAOFactory.getArticleDAO(DAOType.API_REST)

    fun getArticleById(id : Long) : Article?{
        return daoMemory.getById(id)
    }
    fun getAllArticleTest() : List<Article>?{
        return daoMemory.getAll()
    }

    fun getAllArticleOffline() : List<Article>?{
        return daoDb.getAll()
    }
    fun createArticle(article: Article) = daoApiRest.addArticle(article)
}