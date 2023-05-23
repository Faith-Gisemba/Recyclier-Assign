package com.gisey.recyclierviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NamesRvAdapter(var nameList: List<String>): Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.name_list_item,parent,false)
        return NamesViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        var currentName = nameList.get(position)
        holder.tvName.text = currentName
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}
class NamesViewHolder(itemView: View): ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)

}