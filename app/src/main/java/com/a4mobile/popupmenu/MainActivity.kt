package com.a4mobile.popupmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.PopupMenu
import android.view.MenuItem
import android.widget.Toast
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menu_button: ImageView = findViewById(R.id.menu_button)
        menu_button.setOnClickListener {
                //Creating the instance of PopupMenu
                val popup = PopupMenu(this@MainActivity, menu_button)
                //Inflating the Popup using xml file
                popup.getMenuInflater()
                        .inflate(R.menu.menu, popup.getMenu())

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {
                    override fun onMenuItemClick(item: MenuItem): Boolean {
                        Toast.makeText(
                                this@MainActivity,
                                "You Clicked : " + item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show()
                        return true
                    }
                })
                popup.show() //showing popup menu
            }
    }
}
