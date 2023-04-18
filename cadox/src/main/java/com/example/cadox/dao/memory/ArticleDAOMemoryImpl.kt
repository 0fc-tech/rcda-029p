package com.example.cadox.dao.memory

import com.example.cadox.bo.Article
import com.example.cadox.dao.IArticleDAO

class ArticleDAOMemoryImpl : IArticleDAO {
    private val articlesInMemory: MutableList<Article> = mutableListOf<Article>( Article(1, "Des lunettes de soleil (memory)", "RAY-BAN RB 4259 601/19 51/20", 85.0, 3, "https://www.optical-center.fr/lunettes-de-soleil/lunettes-de-soleil-RAY-BAN-RB-4259-60119-5120-25318.html?gclid=EAIaIQobChMIitHizMWe5QIVloXVCh1X6gw_EAQYASABEgLu0PD_BwE"), Article(2,"Glacé (memory)", "Livre, XO éditions, Thriller, Bernard Minier", 8.25, 4, "https://livre.fnac.com/a10408001/Bernard-Minier-Glace") ,Article(3,"Complètement cramé ! (memory)", "Livre, Pocket, Humour, Gilles Legardinier", 7.60, 5, "https://www.amazon.fr/Compl%C3%A8tement-cram%C3%A9-Gilles-Legardinier/dp/2266246194") )
    override fun getById(id: Long): Article? {
        return articlesInMemory.find { it.id == id }
    }

    override fun addArticle(article: Article) {
        articlesInMemory.add(article)
    }

    override fun getAll(): List<Article> = articlesInMemory

    override fun deleteById(id: Long) {
        articlesInMemory.removeIf { it.id == id }
    }

}