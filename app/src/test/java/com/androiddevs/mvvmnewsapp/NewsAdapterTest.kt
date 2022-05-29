package com.androiddevs.mvvmnewsapp

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class NewsAdapterTest {

    fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem == newItem
    }

    @Test
    fun valitdate_arecontentsthesame(){
        val oldSource = Source(id=1, name="CNA")
        val oldArticle = Article(id=1, author="John", content="Content", description="Description", publishedAt="Date",source=oldSource, title="Title",url="URL", urlToImage="URL")
        val newArticle = Article(id=2, author="John", content="Content", description="Description", publishedAt="Date",source=oldSource, title="Title",url="URL", urlToImage="URL")
        assertEquals(false, areContentsTheSame(oldArticle, newArticle))
    }
}