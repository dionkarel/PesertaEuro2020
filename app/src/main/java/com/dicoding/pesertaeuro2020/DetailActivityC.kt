package com.dicoding.pesertaeuro2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivityC : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val foto_pesertaC = "foto"
        const val nama_pesertaC = "negara"
        const val pelatih_pesertaC = "pelatih"
        const val pemain_pesertaC = "pemain"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_c)
        setTitle(intent.getStringExtra(nama_pesertaC))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val negaraCdetail : TextView = findViewById(R.id.detailC_negara)
        val name = intent.getStringExtra(nama_pesertaC)
        negaraCdetail.text = name

        val pelatihCdetail : TextView = findViewById(R.id.detailC_pelatih)
        val pelatih = intent.getStringExtra(pelatih_pesertaC)
        pelatihCdetail.text = pelatih

        val pemainCdetail : TextView = findViewById(R.id.detailC_pemain)
        val pemain = intent.getStringExtra(pemain_pesertaC)
        pemainCdetail.text = pemain

        val fotoCdetail: CircleImageView = findViewById(R.id.detailC_foto )
        val foto = intent.getIntExtra(foto_pesertaC, 0)
        fotoCdetail.setImageResource(foto)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val shareNegara = intent.getStringExtra(nama_pesertaC)
                val sharePelatih = intent.getStringExtra(pelatih_pesertaC)
                val sharePemain = intent.getStringExtra(pemain_pesertaC)
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