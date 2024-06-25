package com.akirachix.article

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class ArticleAdapter(val readerLists:List<Article>):RecyclerView.Adapter<ArticleViewHolder>() {
//
//
//}


class ArticleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
     var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPublishDate = itemView.findViewById<TextView>(R.id.tvPublishDate)
    var tvArticleView = itemView.findViewById<TextView>(R.id.tvArticleView)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)






}