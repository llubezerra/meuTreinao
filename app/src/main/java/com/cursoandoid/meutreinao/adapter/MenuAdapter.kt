package com.cursoandoid.meutreinao.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cursoandoid.meutreinao.R
import com.cursoandoid.meutreinao.model.Menu


class MenuAdapter(private val listMenu: List<Menu>,
                  private val context: Context) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    //private lateinit var listener: ItemMenuHomeClickListener

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: ImageView
        val text: TextView

        init {
                // Define click listener for the ViewHolder's View.
            image = itemView.findViewById(R.id.image)
            text = itemView.findViewById(R.id.text)

            }


        //lateinit var root: LinearLayout
        //root = itemView.findViewById(R.id.ll_main);
        //root.setOnClickListener(view -> listener.onClickItem(listMenu.get(getAdapterPosition())));

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemSearch = LayoutInflater.from(context)
            .inflate(R.layout.adapter_menu_list, parent, false)
        return ViewHolder(itemSearch)
    }

    @Override
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemMenu = listMenu[position]

        holder.let {
            it.text.text = itemMenu.text
            it.image.setImageDrawable(itemMenu.image)
        }

    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    interface ItemMenuHomeClickListener {
        fun onClickItem(menu: Menu?)
    }

}