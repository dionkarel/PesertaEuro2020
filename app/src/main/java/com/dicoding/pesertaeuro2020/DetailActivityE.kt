package com.dicoding.pesertaeuro2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivityE : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val foto_pesertaE = "foto"
        const val nama_pesertaE = "negara"
        const val pelatih_pesertaE = "pelatih"
        const val pemain_pesertaE = "pemain"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_e)
        setTitle(intent.getStringExtra(nama_pesertaE))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val negaraEdetail : TextView = findViewById(R.id.detailE_negara)
        val name = intent.getStringExtra(nama_pesertaE)
        negaraEdetail.text = name

        val pelatihEdetail : TextView = findViewById(R.id.detailE_pelatih)
        val pelatih = intent.getStringExtra(pelatih_pesertaE)
        pelatihEdetail.text = pelatih

        val pemainEdetail : TextView = findViewById(R.id.detailE_pemain)
        val pemain = intent.getStringExtra(pemain_pesertaE)
        pemainEdetail.text = pemain

        val fotoEdetail: CircleImageView = findViewById(R.id.detailE_foto )
        val foto = intent.getIntExtra(foto_pesertaE, 0)
        fotoEdetail.setImageResource(foto)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val shareNegara = intent.getStringExtra(nama_pesertaE)
                val sharePelatih = intent.getStringExtra(pelatih_pesertaE)
                val sharePemain = intent.getStringExtra(pemain_pesertaE)
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