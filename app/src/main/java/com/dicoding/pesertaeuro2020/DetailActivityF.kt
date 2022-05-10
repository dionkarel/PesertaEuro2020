package com.dicoding.pesertaeuro2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivityF : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val foto_pesertaF = "foto"
        const val nama_pesertaF = "negara"
        const val pelatih_pesertaF = "pelatih"
        const val pemain_pesertaF = "pemain"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_f)
        setTitle(intent.getStringExtra(nama_pesertaF))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val negaraFdetail : TextView = findViewById(R.id.detailF_negara)
        val name = intent.getStringExtra(nama_pesertaF)
        negaraFdetail.text = name

        val pelatihFdetail : TextView = findViewById(R.id.detailF_pelatih)
        val pelatih = intent.getStringExtra(pelatih_pesertaF)
        pelatihFdetail.text = pelatih

        val pemainFdetail : TextView = findViewById(R.id.detailF_pemain)
        val pemain = intent.getStringExtra(pemain_pesertaF)
        pemainFdetail.text = pemain

        val fotoFdetail: CircleImageView = findViewById(R.id.detailF_foto )
        val foto = intent.getIntExtra(foto_pesertaF, 0)
        fotoFdetail.setImageResource(foto)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val shareNegara = intent.getStringExtra(nama_pesertaF)
                val sharePelatih = intent.getStringExtra(pelatih_pesertaF)
                val sharePemain = intent.getStringExtra(pemain_pesertaF)
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