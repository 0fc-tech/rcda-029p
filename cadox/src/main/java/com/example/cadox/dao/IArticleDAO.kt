package com.example.cadox.dao

import com.example.cadox.bo.Article

interface IArticleDAO {
    fun getById(id:Long) : Article?
    fun addArticle(article:Article)
    fun getAll():List<Article>?
    fun deleteById(id:Long)
}