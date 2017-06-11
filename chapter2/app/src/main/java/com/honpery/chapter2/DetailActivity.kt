package com.honpery.chapter2

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // 接受传递数据
        var detail_id = intent.getStringExtra("detail_id")
        Toast.makeText(this, detail_id, Toast.LENGTH_SHORT).show()


        findViewById(R.id.link_btn).setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://www.baidu.com"))
            startActivity(intent)
        }

        findViewById(R.id.tel_btn).setOnClickListener{
            var intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:10086"))
            startActivity(intent)
        }
    }
}
