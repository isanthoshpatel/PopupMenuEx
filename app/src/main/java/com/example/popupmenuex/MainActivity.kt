package com.example.popupmenuex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv1.setOnClickListener {

            PopupMenu(this, it).run {
                inflate(R.menu.menu)
                setOnMenuItemClickListener(this@MainActivity)
                show()
            }

        }

    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
       when(item!!.itemId){
            R.id.item1 -> Toast.makeText(this, "item1",Toast.LENGTH_LONG).show()
            R.id.item2 -> Toast.makeText(this, "item2",Toast.LENGTH_LONG).show()
           else ->super.onMenuItemSelected(item.itemId,item)
        }
        return true
    }
}
