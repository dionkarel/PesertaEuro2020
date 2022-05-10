package com.dicoding.pesertaeuro2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivityD : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val foto_pesertaD = "foto"
        const val nama_pesertaD = "negara"
        const val pelatih_pesertaD = "pelatih"
        const val pemain_pesertaD = "pemain"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_d)
        setTitle(intent.getStringExtra(nama_pesertaD))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val negaraDdetail : TextView = findViewById(R.id.detailD_negara)
        val name = intent.getStringExtra(nama_pesertaD)
        negaraDdetail.text = name

        val pelatihDdetail : TextView = findViewById(R.id.detailD_pelatih)
        val pelatih = intent.getStringExtra(pelatih_pesertaD)
        pelatihDdetail.text = pelatih

        val pemainDdetail : TextView = findViewById(R.id.detailD_pemain)
        val pemain = intent.getStringExtra(pemain_pesertaD)
        pemainDdetail.text = pemain

        val fotoDdetail: CircleImageView = findViewById(R.id.detailD_foto )
        val foto = intent.getIntExtra(foto_pesertaD, 0)
        fotoDdetail.setImageResource(foto)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val shareNegara = intent.getStringExtra(nama_pesertaD)
                val sharePelatih = intent.getStringExtra(pelatih_pesertaD)
                val sharePemain = intent.getStringExtra(pemain_pesertaD)
                val kontenShare : Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(
                        Intent.EXTRA_TEXT,
                        "Tim Favorite Saya : $shareNegara \n" +
                                "Pelatih : $sharePelatih \n"+
                                sharePemain )
                    type = "text/plain"
                }
                val share = Intent.createChooser(kontenShare, null)
                startActivity(share)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->{
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}