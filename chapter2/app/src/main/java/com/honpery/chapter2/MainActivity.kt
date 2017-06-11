package com.honpery.chapter2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.detail_btn).setOnClickListener{
            // 显示intent
            var intent = Intent(this@MainActivity, DetailActivity::class.java)

            // 向下传递数据
            intent.putExtra("detail_id", "a1")
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item!!.itemId) {
            R.id.menu_add -> {
                // 隐式intent
                var intent = Intent("com.honpery.chapter2.ACTION_CREATE")
                intent.addCategory("com.honpery.chapter2.PAGE")
                startActivity(intent)
            }
            R.id.menu_edit -> Toast.makeText(this, "menu edit", Toast.LENGTH_SHORT).show()
            R.id.menu_close -> finish()
            else -> {}
        }
        return true
    }
}
