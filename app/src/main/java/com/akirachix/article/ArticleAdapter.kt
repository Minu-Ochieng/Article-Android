package com.akirachix.article

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter(val readerLists: List<Article>) : RecyclerView.Adapter<ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.reader_list_item, parent, false)
        return ArticleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val reader = readerLists[position]
        holder.tvAuthor.text = reader.author
        holder.tvTitle.text = reader.title
        holder.tvArticleView.text = reader.articleView
        holder.tvPublishDate.text = reader.publishDate
//        holder.tvLink.text = reader.linkToView
    }

    override fun getItemCount(): Int {
     return  readerLists.size
    }
}


class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPublishDate = itemView.findViewById<TextView>(R.id.tvPublishDate)
    var tvArticleView = itemView.findViewById<TextView>(R.id.tvArticleView)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)


}