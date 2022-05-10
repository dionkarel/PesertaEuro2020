package com.dicoding.pesertaeuro2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPesertaA: RecyclerView
    private val listA: ArrayList<PesertaA> = arrayListOf()

    private lateinit var rvPesertaB: RecyclerView
    private val listB: ArrayList<PesertaB> = arrayListOf()

    private lateinit var rvPesertaC: RecyclerView
    private val listC: ArrayList<PesertaC> = arrayListOf()

    private lateinit var rvPesertaD: RecyclerView
    private val listD: ArrayList<PesertaD> = arrayListOf()

    private lateinit var rvPesertaE: RecyclerView
    private val listE: ArrayList<PesertaE> = arrayListOf()

    private lateinit var rvPesertaF: RecyclerView
    private val listF: ArrayList<PesertaF> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

        rvPesertaA = findViewById(R.id.rv_peserta_a)
        rvPesertaA.setHasFixedSize(true)

        rvPesertaB = findViewById(R.id.rv_peserta_b)
        rvPesertaB.setHasFixedSize(true)

        rvPesertaC = findViewById(R.id.rv_peserta_c)
        rvPesertaC.setHasFixedSize(true)

        rvPesertaD = findViewById(R.id.rv_peserta_d)
        rvPesertaD.setHasFixedSize(true)

        rvPesertaE = findViewById(R.id.rv_peserta_e)
        rvPesertaE.setHasFixedSize(true)

        rvPesertaF = findViewById(R.id.rv_peserta_f)
        rvPesertaF.setHasFixedSize(true)


        listA.addAll(DataPeserta.listDataA)
        showRecyclerList()

        listB.addAll(DataPeserta.listDataB)
        showRecyclerList()

        listC.addAll(DataPeserta.listDataC)
        showRecyclerList()

        listD.addAll(DataPeserta.listDataD)
        showRecyclerList()

        listE.addAll(DataPeserta.listDataE)
        showRecyclerList()

        listF.addAll(DataPeserta.listDataF)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPesertaA.layoutManager = LinearLayoutManager(this)
        val listAdapterA = ListAdapterA(listA)
        rvPesertaA.adapter = listAdapterA

        rvPesertaB.layoutManager = LinearLayoutManager(this)
        val listAdapterB = ListAdapterB(listB)
        rvPesertaB.adapter = listAdapterB

        rvPesertaC.layoutManager = LinearLayoutManager(this)
        val listAdapterC = ListAdapterC(listC)
        rvPesertaC.adapter = listAdapterC

        rvPesertaD.layoutManager = LinearLayoutManager(this)
        val listAdapterD = ListAdapterD(listD)
        rvPesertaD.adapter = listAdapterD

        rvPesertaE.layoutManager = LinearLayoutManager(this)
        val listAdapterE = ListAdapterE(listE)
        rvPesertaE.adapter = listAdapterE

        rvPesertaF.layoutManager = LinearLayoutManager(this)
        val listAdapterF = ListAdapterF(listF)
        rvPesertaF.adapter = listAdapterF

        listAdapterA.setOnItemClickCallback(object : ListAdapterA.OnItemClickCallback {
            override fun onItemClicked(data: PesertaA) {
                showPesertaA(data)
            }
        })

        listAdapterB.setOnItemClickCallback(object : ListAdapterB.OnItemClickCallback {
            override fun onItemClicked(data: PesertaB) {
                showPesertaB(data)
            }
        })

        listAdapterC.setOnItemClickCallback(object : ListAdapterC.OnItemClickCallback {
            override fun onItemClicked(data: PesertaC) {
                showPesertaC(data)
            }
        })

        listAdapterD.setOnItemClickCallback(object : ListAdapterD.OnItemClickCallback {
            override fun onItemClicked(data: PesertaD) {
                showPesertaD(data)
            }
        })

        listAdapterE.setOnItemClickCallback(object : ListAdapterE.OnItemClickCallback {
            override fun onItemClicked(data: PesertaE) {
                showPesertaE(data)
            }
        })

        listAdapterF.setOnItemClickCallback(object : ListAdapterF.OnItemClickCallback {
            override fun onItemClicked(data: PesertaF) {
                showPesertaF(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val moveAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveAbout)
            }
        }
    }

    private fun showPesertaA(data: PesertaA) {
        Toast.makeText(this, "Kamu memilih " + data.nameA, Toast.LENGTH_SHORT).show()
        val moveDetailA = Intent(this@MainActivity, DetailActivityA::class.java)
        moveDetailA.putExtra(DetailActivityA.nama_pesertaA, data.nameA)
        moveDetailA.putExtra(DetailActivityA.pelatih_pesertaA, data.detailA)
        moveDetailA.putExtra(DetailActivityA.pemain_pesertaA, data.pemainA)
        moveDetailA.putExtra(DetailActivityA.foto_pesertaA, data.fotoA)
        startActivity(moveDetailA)
    }

    private fun showPesertaB(data: PesertaB) {
        Toast.makeText(this, "Kamu memilih " + data.nameB, Toast.LENGTH_SHORT).show()
        val moveDetailB = Intent(this@MainActivity, DetailActivityB::class.java)
        moveDetailB.putExtra(DetailActivityB.nama_pesertaB, data.nameB)
        moveDetailB.putExtra(DetailActivityB.pelatih_pesertaB, data.detailB)
        moveDetailB.putExtra(DetailActivityB.pemain_pesertaB, data.pemainB)
        moveDetailB.putExtra(DetailActivityB.foto_pesertaB, data.fotoB)
        startActivity(moveDetailB)
    }

    private fun showPesertaC(data: PesertaC) {
        Toast.makeText(this, "Kamu memilih " + data.nameC, Toast.LENGTH_SHORT).show()
        val moveDetailC = Intent(this@MainActivity, DetailActivityC::class.java)
        moveDetailC.putExtra(DetailActivityC.nama_pesertaC, data.nameC)
        moveDetailC.putExtra(DetailActivityC.pelatih_pesertaC, data.detailC)
        moveDetailC.putExtra(DetailActivityC.pemain_pesertaC, data.pemainC)
        moveDetailC.putExtra(DetailActivityC.foto_pesertaC, data.fotoC)
        startActivity(moveDetailC)
    }

    private fun showPesertaD(data: PesertaD) {
        Toast.makeText(this, "Kamu memilih " + data.nameD, Toast.LENGTH_SHORT).show()
        val moveDetailD = Intent(this@MainActivity, DetailActivityD::class.java)
        moveDetailD.putExtra(DetailActivityD.nama_pesertaD, data.nameD)
        moveDetailD.putExtra(DetailActivityD.pelatih_pesertaD, data.detailD)
        moveDetailD.putExtra(DetailActivityD.pemain_pesertaD, data.pemainD)
        moveDetailD.putExtra(DetailActivityD.foto_pesertaD, data.fotoD)
        startActivity(moveDetailD)
    }

    private fun showPesertaE(data: PesertaE) {
        Toast.makeText(this, "Kamu memilih " + data.nameE, Toast.LENGTH_SHORT).show()
        val moveDetailE = Intent(this@MainActivity, DetailActivityE::class.java)
        moveDetailE.putExtra(DetailActivityE.nama_pesertaE, data.nameE)
        moveDetailE.putExtra(DetailActivityE.pelatih_pesertaE, data.detailE)
        moveDetailE.putExtra(DetailActivityE.pemain_pesertaE, data.pemainE)
        moveDetailE.putExtra(DetailActivityE.foto_pesertaE, data.fotoE)
        startActivity(moveDetailE)
    }

    private fun showPesertaF(data: PesertaF) {
        Toast.makeText(this, "Kamu memilih " + data.nameF, Toast.LENGTH_SHORT).show()
        val moveDetailF = Intent(this@MainActivity, DetailActivityF::class.java)
        moveDetailF.putExtra(DetailActivityF.nama_pesertaF, data.nameF)
        moveDetailF.putExtra(DetailActivityF.pelatih_pesertaF, data.detailF)
        moveDetailF.putExtra(DetailActivityF.pemain_pesertaF, data.pemainF)
        moveDetailF.putExtra(DetailActivityF.foto_pesertaF, data.fotoF)
        startActivity(moveDetailF)
    }
}