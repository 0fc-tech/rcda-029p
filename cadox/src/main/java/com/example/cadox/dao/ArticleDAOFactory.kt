package com.example.cadox.dao

import com.example.cadox.dao.apirest.ArticleDAOApiRESTImpl
import com.example.cadox.dao.db.ArticleDAODbImpl
import com.example.cadox.dao.memory.ArticleDAOMemoryImpl

object ArticleDAOFactory {
    fun getArticleDAO(type: DAOType) : IArticleDAO{
        return when(type){
            DAOType.DB -> ArticleDAODbImpl()
            DAOType.API_REST -> ArticleDAOApiRESTImpl()
            DAOType.MEMORY -> ArticleDAOMemoryImpl()
        }
    }
}