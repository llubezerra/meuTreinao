package com.cursoandoid.meutreinao.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cursoandoid.meutreinao.R
import com.cursoandoid.meutreinao.adapter.MenuAdapter
import com.cursoandoid.meutreinao.databinding.ActivityMenuBinding
import com.cursoandoid.meutreinao.model.Menu

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    private var listMenu = mutableListOf<Menu>()
    private lateinit var menu: Menu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.light_gray));

        //Listagem de itens
        recyclerViewList()
        this.criarMenu()
    }

    private fun recyclerViewList() {
        val recyclerView = binding.recyclerMenuList
        recyclerView.adapter = MenuAdapter(listMenu, this)

        //val adapter = MenuAdapter(listMenu, this)

        //Configurar RecyclerView
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager

        //binding.recyclerMenuList.adapter = adapter
    }

    private fun criarMenu() {

        menu = Menu(ContextCompat.getDrawable(this, R.drawable.fitness_48px), "Treino atual")
        listMenu.add(menu)

        menu = Menu(ContextCompat.getDrawable(this, R.drawable.inventory_48px), "Todos os treinos")
        listMenu.add(menu)

        menu = Menu(ContextCompat.getDrawable(this, R.drawable.library_add_48px), "Adicionar novo treino")
        listMenu.add(menu)

        menu = Menu(ContextCompat.getDrawable(this, R.drawable.backup_48px), "Backup")
        listMenu.add(menu)

        menu = Menu(ContextCompat.getDrawable(this, R.drawable.settings_48px), "Configurações")
        listMenu.add(menu)

        /*menu = new Menu(ContextCompat.getDrawable(this, R.drawable.planet), getString(R.string.search_planets));
        this.listMenu.add(menu);*/

    }

}