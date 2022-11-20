package com.ezatpanah.expandable_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ezatpanah.expandable_recyclerview.R
import com.ezatpanah.expandable_recyclerview.databinding.ParentItemBinding

class MainAdapter(private val collections: List<com.ezatpanah.expandable_recyclerview.model.MainModel>) :
    RecyclerView.Adapter<MainAdapter.CollectionsViewHolder>() {

    lateinit var context: Context

    class CollectionsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ParentItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        context = parent.context
        return CollectionsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionsViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collections[position]
            tvParentTitle.text = collection.title
            val subItemAdapter = SubItemAdapter(collection.subItemModels)
            rvSubItem.adapter = subItemAdapter
            rvSubItem.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

            tvParentTitle.setOnClickListener {
                rvSubItem.visibility = if (rvSubItem.isShown) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount() = collections.size
}