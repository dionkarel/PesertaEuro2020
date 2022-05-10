package com.dicoding.pesertaeuro2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivityA : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val foto_pesertaA = "foto"
        const val nama_pesertaA = "negara"
        const val pelatih_pesertaA = "pelatih"
        const val pemain_pesertaA = "pemain"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_a)
        setTitle(intent.getStringExtra(nama_pesertaA))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val negaraAdetail: TextView = findViewById(R.id.detailA_negara)
        val name = intent.getStringExtra(nama_pesertaA)
        negaraAdetail.text = name

        val pelatihAdetail: TextView = findViewById(R.id.detailA_pelatih)
        val pelatih = intent.getStringExtra(pelatih_pesertaA)
        pelatihAdetail.text = pelatih

        val pemainAdetail: TextView = findViewById(R.id.detailA_pemain)
        val pemain = intent.getStringExtra(pemain_pesertaA)
        pemainAdetail.text = pemain

        val fotoAdetail: CircleImageView = findViewById(R.id.detailA_foto)
        val foto = intent.getIntExtra(foto_pesertaA, 0)
        fotoAdetail.setImageResource(foto)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val shareNegara = intent.getStringExtra(nama_pesertaA)
                val sharePelatih = intent.getStringExtra(pelatih_pesertaA)
                val sharePemain = intent.getStringExtra(pemain_pesertaA)
                val kontenShare : Intent = Intent().apply {
                    action =Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT,
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

