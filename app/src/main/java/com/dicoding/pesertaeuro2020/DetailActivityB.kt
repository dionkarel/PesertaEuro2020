package com.dicoding.pesertaeuro2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivityB : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val foto_pesertaB = "foto"
        const val nama_pesertaB = "negara"
        const val pelatih_pesertaB = "pelatih"
        const val pemain_pesertaB = "pemain"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_b)
        setTitle(intent.getStringExtra(nama_pesertaB))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val negaraBdetail : TextView = findViewById(R.id.detailB_negara)
        val name = intent.getStringExtra(nama_pesertaB)
        negaraBdetail.text = name

        val pelatihBdetail : TextView = findViewById(R.id.detailB_pelatih)
        val pelatih = intent.getStringExtra(pelatih_pesertaB)
        pelatihBdetail.text = pelatih

        val pemainBdetail : TextView = findViewById(R.id.detailB_pemain)
        val pemain = intent.getStringExtra(pemain_pesertaB)
        pemainBdetail.text = pemain

        val fotoBdetail: CircleImageView = findViewById(R.id.detailB_foto)
        val foto = intent.getIntExtra(foto_pesertaB, 0)
        fotoBdetail.setImageResource(foto)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val shareNegara = intent.getStringExtra(nama_pesertaB)
                val sharePelatih = intent.getStringExtra(pelatih_pesertaB)
                val sharePemain = intent.getStringExtra(pemain_pesertaB)
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