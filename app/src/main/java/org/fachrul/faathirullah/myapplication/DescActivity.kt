package org.fachrul.faathirullah.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DescActivity : AppCompatActivity() {
    var nama: TextView? = null
    var deskripsi: TextView? = null
    var _nama: String? = null
    var _deskripsi: String? = null
    var _gambar = 0
    var img: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)

        val bundle = intent.extras
        _nama = bundle!!.getString("nama")
        _deskripsi = bundle.getString("deskripsi")
        _gambar = bundle.getInt("gambar")

        nama = findViewById<View>(R.id.nama) as TextView
        deskripsi = findViewById<View>(R.id.deskripsi) as TextView
        img = findViewById<View>(R.id.gambar) as ImageView
        nama!!.text = "" + _nama
        deskripsi!!.text = "" + _deskripsi
        Glide.with(this@DescActivity).load(_gambar).apply(RequestOptions().override(370, 370)).into(img!!)
    }
}
